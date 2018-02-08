package li.spectrum.data.model;

public class Folder extends File {

	private static final long serialVersionUID = -2418943571618711253L;
	private int itemCount;
	private int folderCount;
	private int fileCount;

	public Folder() {
		super();
	}

	public Folder(String path) {
		super(path);
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public int getFolderCount() {
		return folderCount;
	}

	public void setFolderCount(int folderCount) {
		this.folderCount = folderCount;
	}

	public int getFileCount() {
		return fileCount;
	}

	public void setFileCount(int fileCount) {
		this.fileCount = fileCount;
	}

}
