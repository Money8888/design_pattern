package com.design.behavior.iterator.impl;

import com.design.behavior.iterator.Book;
import com.design.behavior.iterator.BookIterator;
import com.design.behavior.iterator.Bookshelf;

import java.util.ArrayList;
import java.util.List;

/**
 * 书柜实现类
 */
public class BookshelfImpl implements Bookshelf {

	private List<Book> bookList = new ArrayList<>();

	@Override
	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public void removeBook(Book book) {
		bookList.remove(book);
	}

	@Override
	public BookIterator iterator() {
		return new BookIterator(bookList);
	}
}
