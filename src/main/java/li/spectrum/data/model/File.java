package li.spectrum.data.model;

import java.io.Serializable;

import org.springframework.util.StringUtils;

public class File implements Serializable {
	private static final long serialVersionUID = 6475121205416507298L;
	private String name;
	private String parentPath;
	private boolean parentHidden;
	private String parentFolders;
	private boolean hidden;
	private long lastModified;
	private String uri;
	private long size;
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

	public String getParentPath() {
		return parentPath;
	}

	public void setParentPath(String parentPath) {
		this.parentPath = parentPath;
	}

	public boolean isParentHidden() {
		return parentHidden;
	}

	public void setParentHidden(boolean parentHidden) {
		this.parentHidden = parentHidden;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public long getLastModified() {
		return lastModified;
	}

	public void setLastModified(long lastModified) {
		this.lastModified = lastModified;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getParentFolders() {
		return parentFolders;
	}

	public void addParentFolder(String folder) {
		if (!StringUtils.isEmpty(parentFolders)) {
			parentFolders += " " + folder;
		} else {
			parentFolders = folder;
		}
	}

}
