package li.spectrum.data.model;

import java.util.Iterator;

public class BasicPage<T> implements Pageable<T> {
	private Iterator<T> iterator;
	private long start;
	private Long size = null;
	private long pageSize;
	private long totalSize;

	protected BasicPage(Class<T> type) {
	}

	public BasicPage(Iterator<T> iterator, long start, long pageSize, long totalSize) {
		this.iterator = iterator;
		this.start = start;
		this.pageSize = pageSize;
		this.totalSize = totalSize;
	}

	@Override
	public Iterator<T> iterator() {
		return iterator;
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public T next() {
		return iterator.next();
	}

	@Override
	public long getStart() {
		return start;
	}

	public BasicPage<T> setStart(long start) {
		this.start = start;
		return this;
	}

	@Override
	public long getPageSize() {
		return pageSize;
	}

	public BasicPage<T> setPageSize(long pageSize) {
		this.pageSize = pageSize;
		return this;
	}

	@Override
	public long getTotalSize() {
		return totalSize;
	}

	public BasicPage<T> setTotalSize(long totalSize) {
		this.totalSize = totalSize;
		return this;
	}

	public BasicPage<T> setSize(long size) {
		this.size = new Long(size);
		return this;
	}

	@Override
	public long size() {
		if (size != null)
			return size.longValue();
		if (getPageSize() == 0) {
			return 0;
		} else if (hasNextPage()) {
			return getPageSize();
		} else if ((getTotalSize() % getPageSize()) == 0) {
			return getPageSize();
		} else {
			return getTotalSize() % getPageSize();
		}
	}

	@Override
	public long getTotalPages() {
		if (getPageSize() == 0)
			return 0;
		return (long) Math.ceil((double) getTotalSize() / (double) getPageSize());
	}

	@Override
	public boolean hasContent() {
		return size() > 0;
	}

	@Override
	public boolean hasNextPage() {
		return getPageNumber() < getTotalPages();
	}

	@Override
	public boolean hasPreviousPage() {
		return getPageNumber() > 1;
	}

	@Override
	public long getPageNumber() {
		if (getPageSize() == 0)
			return 0;
		double _start = (double) start;
		double _pageSize = (double) getPageSize();
		if (_start % _pageSize == 0)
			return new Double(_start / _pageSize).longValue();
		else
			return (long) Math.floor(_start / _pageSize) + 1;
	}

	@Override
	public boolean isFirstPage() {
		if (getPageSize() == 0)
			return true;
		return getPageNumber() == 1;
	}

	@Override
	public boolean isLastPage() {
		if (getPageSize() == 0)
			return true;
		return getPageNumber() == getTotalPages();
	}
}