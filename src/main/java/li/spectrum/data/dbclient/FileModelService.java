package li.spectrum.data.dbclient;

import li.spectrum.data.model.FileModel;

public interface FileModelService {

	void add(FileModel file);

	FileModel get(String id);
}
