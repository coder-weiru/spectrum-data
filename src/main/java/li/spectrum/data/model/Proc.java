package li.spectrum.data.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.marklogic.client.pojo.annotation.Id;

public class Proc implements Serializable {
	private static final long serialVersionUID = -2566506139771557L;
	@Id
	public String id;
	private String rootDir;
	private String timestamp;
	private List<Record> records = new ArrayList<Record>();
	private int totalRecordCount;
	private Processing processing;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public boolean addRecord(Record record) {
		return this.records.add(record);
	}

	public String getRootDir() {
		return rootDir;
	}

	public void setRootDir(String rootDir) {
		this.rootDir = rootDir;
	}

	public Processing getProcessing() {
		return processing;
	}

	public void setProcessing(Processing processing) {
		this.processing = processing;
	}

	public int getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

}
