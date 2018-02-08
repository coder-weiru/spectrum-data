package li.spectrum.data.dbclient;

import li.spectrum.data.model.FileModel;

public interface FileModelService {

	void addOrUpdate(FileModel file);

	FileModel get(String id);
}
