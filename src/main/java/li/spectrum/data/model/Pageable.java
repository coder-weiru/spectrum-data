package li.spectrum.data.model;

import java.util.Iterator;

/**
 * A generic interface for pagination through large sets of items of type
 * &lt;T&gt;.
 */
public interface Pageable<T> extends Iterable<T> {
	/**
	 * The internal iterator of type T in this Page. This iterator is the same
	 * one used for {@link #hasNext()} and {@link #next()}.
	 */
	@Override
	Iterator<T> iterator();

	/**
	 * Returns true if internal iterator has more elements. The internal
	 * iterator is separate from any new iterator created by calls to
	 * iterator().
	 * 
	 * @return true if the internal iterator has more elements
	 */
	boolean hasNext();

	/**
	 * Returns the next element in the internal iterator, which is separate from
	 * any new iterator created by calls to iterator().
	 * 
	 * @return the next element in the iteration
	 */
	T next();

	/**
	 * The start position of this page within all possible items. For result
	 * sets this is the position of the first result within the result set.
	 * 
	 * @return the start position
	 */
	long getStart();

	/**
	 * The page size which is the maximum number of items allowed in one page.
	 * 
	 * @return the page size
	 */
	public long getPageSize();

	/**
	 * The total count
	 * 
	 * @return the total count of possible items
	 * @see <a href="http://docs.marklogic.com/xdmp:estimate">xdmp:estimate</a>
	 * @see <a href=
	 *      "http://docs.marklogic.com/search:estimate">search:estimate</a>
	 */
	long getTotalSize();

	/**
	 * The count of items in this page, which is always less than getPageSize().
	 * If ({@link #getTotalSize()} - {@link #getStart()}) &gt;
	 * {@link #getPageSize()} then size() == getPageSize().
	 * 
	 * @return the count of items in this page
	 */
	long size();

	/**
	 * The number of pages covering all possible items.
	 * 
	 * @return the number of pages. In pseudo-code:
	 * 
	 *         <pre>
	 * {@code if ( getPageSize() == 0 ) return 0;
	 *Math.ceil( getTotalSize() /  getPageSize() );
	 * }
	 *         </pre>
	 */
	long getTotalPages();

	/**
	 * Whether there are any items in this page.
	 * 
	 * @return true if {@code size() > 0; }
	 */
	boolean hasContent();

	/**
	 * Whether there are any items in the next page.
	 * 
	 * @return true if {@code getPageNumber() < getTotalPages(); }
	 */
	boolean hasNextPage();

	/**
	 * Whether there is a previous page.
	 * 
	 * @return true if {@code getPageNumber() > 0 }
	 */
	boolean hasPreviousPage();

	/**
	 * The page number within the count of all possible pages.
	 * 
	 * @return the page number. In pseudo-code:
	 * 
	 *         <pre>
	 * {@code if ( getPageSize() == 0 ) return 0;
	 *if ( getStart() % getPageSize() == 0 ) return getStart() / getPageSize();
	 *else return Math.floor(getStart() / getPageSize()) + 1;
	 * }
	 *         </pre>
	 */
	long getPageNumber();

	/**
	 * @return true if {@code getPageSize()==0 or getPageNumber()==1 }
	 */
	boolean isFirstPage();

	/**
	 * @return true if
	 *         {@code getPageSize()==0 or getPageNumber()==getTotalPages() }
	 */
	boolean isLastPage();
}
