package li.spectrum.data.model;

import com.marklogic.client.pojo.annotation.Id;


public class FileModel {

	@Id
	public String filePath;

	private TikaModel tikaModel;

	private Processing processing;

	private File file;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
