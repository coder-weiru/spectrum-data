package li.spectrum.data.model.builder;

import java.util.ArrayList;
import java.util.List;

import com.marklogic.client.pojo.PojoPage;

import li.spectrum.data.model.Document;
import li.spectrum.data.model.DocumentCollection;
import li.spectrum.data.model.File;
import li.spectrum.data.model.FileModel;

public class DocumentCollectionBuilder {

	private PojoPage<FileModel> fileModelPage;

	public DocumentCollectionBuilder() {
		super();
	}

	public DocumentCollectionBuilder setFileModelPage(PojoPage<FileModel> fileModelPage) {
		this.fileModelPage = fileModelPage;
		return this;
	}

	public DocumentCollection build() {
		DocumentCollection documentCollection = null;
		List<Document> docList = new ArrayList<Document>();
		if (fileModelPage != null && fileModelPage.hasContent()) {
			while (fileModelPage.hasNext()) {
				FileModel fm = fileModelPage.next();
				docList.add(Document.of((File) fm.getFile()));
			}
			long start = fileModelPage.getStart();
			long pageSize = fileModelPage.getPageSize();
			long totalSize = fileModelPage.getTotalSize();
			documentCollection = new DocumentCollection(docList, start, pageSize, totalSize);

		}
		return documentCollection;
	}
}