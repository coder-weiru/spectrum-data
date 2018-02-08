package li.spectrum.data.model;

import java.io.Serializable;

public class Record implements Serializable {

	private static final long serialVersionUID = 6672102940829365244L;
	private String value;
	private String status;

	public Record(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
