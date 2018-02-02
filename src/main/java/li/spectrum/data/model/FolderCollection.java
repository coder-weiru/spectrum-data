package li.spectrum.data.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FolderCollection {
	private List<Folder> folders = new ArrayList<Folder>();

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

	public int size() {
		return folders.size();
	}

	public boolean isEmpty() {
		return folders.isEmpty();
	}

	public Iterator<Folder> iterator() {
		return folders.iterator();
	}

	public boolean add(Folder e) {
		return folders.add(e);
	}

	public boolean remove(Object o) {
		return folders.remove(o);
	}

	public boolean addAll(Collection<? extends Folder> c) {
		return folders.addAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		return folders.removeAll(c);
	}

	public Folder remove(int index) {
		return folders.remove(index);
	}

	public ListIterator<Folder> listIterator() {
		return folders.listIterator();
	}

}
