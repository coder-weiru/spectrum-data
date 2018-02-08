package li.spectrum.data.model.builder;

import java.io.IOException;

import li.spectrum.data.model.File;
import li.spectrum.data.model.FileModel;
import li.spectrum.data.model.Processing;

public class FileModelBuilder {

	private File file;
	private Processing processing;

	public FileModelBuilder() {
		super();
	}

	public FileModelBuilder setFile(File file) {
		this.file = file;
		return this;
	}

	public FileModelBuilder setProcessing(Processing processing) {
		this.processing = processing;
		return this;
	}

	public FileModel build() throws IOException {
		FileModel fm = null;
		if (file != null) {
			fm = new FileModel();
			fm.setFile(file);

			if (processing != null) {
				fm.setProcessing(processing);
			}
		}
		return fm;
	}
}