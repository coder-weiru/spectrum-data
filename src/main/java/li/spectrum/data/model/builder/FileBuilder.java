package li.spectrum.data.model.builder;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.util.StringUtils;

import li.spectrum.data.model.File;
import li.spectrum.data.model.Folder;

public class FileBuilder {

	private String filePath;

	public FileBuilder() {
		super();
	}

	public FileBuilder setFilePath(String path) {
		this.filePath = path;
		return this;
	}

	public File build() throws IOException {
		Path path = Paths.get(filePath);
		File file = null;
		java.io.File f = path.toFile();
		if (f.isDirectory()) {
			file = new Folder(path.toString());
			Folder folder = (Folder) file;
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
			for (Path p : directoryStream) {
				if (p.toFile().isDirectory()) {
					folder.setFolderCount(folder.getFolderCount() + 1);
				} else {
					folder.setFileCount(folder.getFileCount() + 1);
				}
			}
			folder.setItemCount(folder.getFolderCount() + folder.getFileCount());
			directoryStream.close();
		} else {
			file = new File(path.toString());
		}
		file.setName(path.getFileName().toString());
		file.setParentPath(f.getParent());
		file.setParentHidden(f.getParentFile().isHidden());
		
		java.io.File parentFile = f.getParentFile();
		while (parentFile!=null && parentFile.exists()) {
			String fname = parentFile.getName();
			if (!StringUtils.isEmpty(fname)) {
				file.addParentFolder(fname);
			}
			parentFile = parentFile.getParentFile();
		}
		
		file.setHidden(f.isHidden());
		file.setLastModified(f.lastModified());
		file.setUri(f.toURI().toString());
		file.setType(file.getClass().getSimpleName());

		FileChannel fileChannel = FileChannel.open(path);
		file.setSize(fileChannel.size());
		fileChannel.close();

		return file;
	}
	
}