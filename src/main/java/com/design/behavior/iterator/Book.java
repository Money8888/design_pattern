package com.design.behavior.iterator;

/**
 * 书籍类
 * 迭代的元素类
 */
public class Book {
    private String name;
    public Book(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Book{" +
			"name='" + name + '\'' +
			'}';
	}
}