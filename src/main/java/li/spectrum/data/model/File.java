package li.spectrum.data.model;

public class File {
	private String name;
	private String canonicalPath;
	private Metadata _metadata;

	public File() {
		super();
	}

	public File(String path) {
		super();
		this.canonicalPath = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCanonicalPath() {
		return canonicalPath;
	}

	public void setCanonicalPath(String canonicalPath) {
		this.canonicalPath = canonicalPath;
	}

	public Metadata get_metadata() {
		return _metadata;
	}

	public void set_metadata(Metadata _metadata) {
		this._metadata = _metadata;
	}

}
