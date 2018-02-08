package li.spectrum.data.dbclient;

import li.spectrum.data.model.Proc;

public interface ProcessService {

	void addOrUpdate(Proc process);

	Proc get(String procId);
}
