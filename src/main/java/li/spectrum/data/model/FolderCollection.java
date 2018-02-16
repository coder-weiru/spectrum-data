package li.spectrum.data.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FolderCollection extends BasicPage<Folder> {

	private List<Folder> folders = new ArrayList<Folder>();

	public static FolderCollection emptyCollection() {
		return new FolderCollection(new ArrayList<Folder>(), 0, 0, 0);
	}

	public FolderCollection(List<Folder> list, long start, long pageSize, long totalSize) {
		this(list.iterator(), start, pageSize, totalSize);
		this.folders = list;
	}

	public FolderCollection(Iterator<Folder> iterator, long start, long pageSize, long totalSize) {
		super(iterator, start, pageSize, totalSize);
		
	}

	public List<Folder> getFolders() {
		return folders;
	}

	public void setFolders(List<Folder> folders) {
		this.folders = folders;
	}

	@Override
	public boolean hasNext() {
		return super.hasNext();
	}

	@Override
	public Folder next() {
		return super.next();
	}

	@Override
	public long getStart() {
		return super.getStart();
	}

	@Override
	public long getPageSize() {
		return super.getPageSize();
	}

	@Override
	public long getTotalSize() {
		return super.getTotalSize();
	}

	@Override
	public long getTotalPages() {
		return super.getTotalPages();
	}

	@Override
	public boolean hasContent() {
		return super.hasContent();
	}

	@Override
	public boolean hasNextPage() {
		return super.hasNextPage();
	}

	@Override
	public boolean hasPreviousPage() {
		return super.hasPreviousPage();
	}

	@Override
	public long getPageNumber() {
		return super.getPageNumber();
	}

	@Override
	public boolean isFirstPage() {
		return super.isFirstPage();
	}

	@Override
	public boolean isLastPage() {
		return super.isLastPage();
	}

	@Override
	public long size() {
		return super.size();
	}

}
