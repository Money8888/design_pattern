package com.design.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器类
 */
public class BookIterator implements Iterator<Book> {

	public List<Book> bookList;
	private int position = 0;

	public BookIterator(List<Book> bookList) {
		this.bookList = bookList;
	}

	//边界条件
	@Override
	public boolean hasNext() {
		return position < bookList.size();
	}

	@Override
	public Book next() {
		return bookList.get(position++);
	}
}
