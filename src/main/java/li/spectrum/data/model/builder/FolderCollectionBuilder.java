package li.spectrum.data.model.builder;

import java.util.ArrayList;
import java.util.List;

import com.marklogic.client.pojo.PojoPage;

import li.spectrum.data.model.FileModel;
import li.spectrum.data.model.Folder;
import li.spectrum.data.model.FolderCollection;

public class FolderCollectionBuilder {

	private PojoPage<FileModel> fileModelPage;

	public FolderCollectionBuilder() {
		super();
	}

	public FolderCollectionBuilder setFileModelPaGE(PojoPage<FileModel> fileModelPage) {
		this.fileModelPage = fileModelPage;
		return this;
	}

	public FolderCollection build() {
		FolderCollection folderCollection = null;
		List<Folder> folderList = new ArrayList<Folder>();
		if (fileModelPage != null && fileModelPage.hasContent()) {
			while (fileModelPage.hasNext()) {
				FileModel fm = fileModelPage.next();
				folderList.add((Folder) fm.getFile());
			}
			long start = fileModelPage.getStart();
			long pageSize = fileModelPage.getPageSize();
			long totalSize = fileModelPage.getTotalSize();
			folderCollection = new FolderCollection(folderList, start, pageSize, totalSize);

		}
		return folderCollection;
	}
}