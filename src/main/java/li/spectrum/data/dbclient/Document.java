package li.spectrum.data.dbclient;

import com.marklogic.client.pojo.annotation.Id;

public class Document {
	/**
	 * The String identifier for this user, a primary key.
	 */
	@Id
	public String id;

	private String content;

	public Document(String id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}