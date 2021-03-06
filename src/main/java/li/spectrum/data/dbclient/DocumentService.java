package li.spectrum.data.dbclient;

import java.io.InputStream;

public interface DocumentService {

	Document add(String docId, InputStream content, String collectionName);

	Document get(String docId);
}
