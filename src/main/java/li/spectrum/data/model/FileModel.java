package li.spectrum.data.model;

import org.springframework.util.Assert;

import com.marklogic.client.pojo.annotation.Id;


public class FileModel {

	public String path;

	private TikaModel tikaModel;

	private Processing processing;

	private File file;

	@Id
	public String getPath() {
		Assert.notNull(file, "'file' must not be null");

		return file.getCanonicalPath();
	}

	public TikaModel getTikaModel() {
		return tikaModel;
	}

	public void setTikaModel(TikaModel tikaModel) {
		this.tikaModel = tikaModel;
	}

	public Processing getProcessing() {
		return processing;
	}

	public void setProcessing(Processing processing) {
		this.processing = processing;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
