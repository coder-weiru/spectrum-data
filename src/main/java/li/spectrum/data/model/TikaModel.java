package li.spectrum.data.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TikaModel implements Serializable {
	private static final long serialVersionUID = -1298242849602486987L;
	private Map<String, Object> metadata;

	public TikaModel() {
		metadata = new HashMap<String, Object>();
	}

	public void addMetadata(String name, String[] value) {
		metadata.put(name, value);
	}

	public Object getMetadata(String name) {
		return metadata.get(name);
	}

	public Set<String> metadataNames() {
		return metadata.keySet();
	}

	public void removeMetadata(String name) {
		metadata.remove(name);
	}

	public void setMetadata(String name, Object value) {
		metadata.put(name, value);
	}

	public int metadataSize() {
		return metadata.size();
	}

	public String toString() {
		return metadata.toString();
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

}
