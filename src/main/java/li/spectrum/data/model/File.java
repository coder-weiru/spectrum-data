package li.spectrum.data.model;

import java.io.Serializable;

public class File implements Serializable {
	private static final long serialVersionUID = 6475121205416507298L;
	private String name;
	private String canonicalPath;
	private Metadata _metadata = new Metadata();

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
