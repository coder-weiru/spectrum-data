package li.spectrum.data.model.builder;

import java.util.ArrayList;
import java.util.List;

import com.marklogic.client.pojo.PojoPage;

import li.spectrum.data.model.File;
import li.spectrum.data.model.FileCollection;
import li.spectrum.data.model.FileModel;

public class FileCollectionBuilder {

	private PojoPage<FileModel> fileModelPage;

	private FileCollectionBuilder() {
		super();
	}

	public static FileCollectionBuilder newBuilder() {
		return new FileCollectionBuilder();
	}

	public FileCollectionBuilder setFileModelPage(PojoPage<FileModel> fileModelPage) {
		this.fileModelPage = fileModelPage;
		return this;
	}

	public FileCollection build() {
		FileCollection fileCollection = null;
		List<File> fileList = new ArrayList<File>();
		if (fileModelPage != null && fileModelPage.hasContent()) {
			while (fileModelPage.hasNext()) {
				FileModel fm = fileModelPage.next();
				fileList.add((File) fm.getFile());
			}
			long start = fileModelPage.getStart();
			long pageSize = fileModelPage.getPageSize();
			long totalSize = fileModelPage.getTotalSize();
			fileCollection = new FileCollection(fileList, start, pageSize, totalSize);

		}
		return fileCollection;
	}
}