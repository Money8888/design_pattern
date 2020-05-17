package com.design.behavior.iterator;

/**
 * 书柜接口
 *
 */
public interface Bookshelf {
	void addBook(Book book);
	void removeBook(Book book);
	BookIterator iterator();
}
