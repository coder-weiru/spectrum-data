package li.spectrum.data.model.builder;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import li.spectrum.data.model.File;
import li.spectrum.data.model.Folder;
import li.spectrum.data.model.Metadata;

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
		file.setHidden(f.isHidden());
		file.setLastModified(f.lastModified());
		file.setUri(f.toURI().toString());

		FileChannel fileChannel = FileChannel.open(path);
		file.setSize(fileChannel.size());
		fileChannel.close();

		Metadata meta = file.get_metadata();
		meta.setType(file.getClass().getSimpleName());
		meta.setUri(file.getUri());

		return file;
	}
}