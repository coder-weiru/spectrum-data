package li.spectrum.data.model;

public class Document extends File {

	private static final long serialVersionUID = 1606293411136491759L;

	public Document() {
		super();
	}

	public Document(String path) {
		super(path);
	}

	public static Document of(File file) {
		Document doc = new Document();
		doc.set_metadata(file.get_metadata());
		doc.setCanonicalPath(file.getCanonicalPath());
		doc.setHidden(file.isHidden());
		doc.setLastModified(file.getLastModified());
		doc.setName(file.getName());
		doc.setParentHidden(file.isParentHidden());
		doc.setParentPath(file.getParentPath());
		doc.setSize(file.getSize());
		doc.setUri(file.getUri());

		return doc;
	}
}
