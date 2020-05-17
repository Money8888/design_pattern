package com.design.behavior.iterator;

import com.design.behavior.iterator.impl.BookshelfImpl;

/**
 * 迭代器模式启动类
 */
public class IteratorMain {

	public static void main(String[] args) {
		Bookshelf bookshelf = new BookshelfImpl();
		bookshelf.addBook(new Book("java书籍"));
		bookshelf.addBook(new Book("python书籍"));
		bookshelf.addBook(new Book("c++ 书籍"));
		BookIterator iterator = bookshelf.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
