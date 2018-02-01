package li.spectrum.data.dbclient;

import li.spectrum.data.model.Proc;

public interface ProcessService {

	void add(Proc process);

	Proc get(String procId);
}
