package li.spectrum.data.model;

import java.io.Serializable;

public class Processing implements Serializable {
	private static final long serialVersionUID = 4533483733567225148L;
	private String taskName;
	private String status;
	private Exception exception;

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

}
