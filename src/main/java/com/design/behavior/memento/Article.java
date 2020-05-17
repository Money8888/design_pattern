package com.design.behavior.memento;

/**
 * 待捕捉内容的对象
 * 文章类
 */
public class Article {

    private String title;
    private String content;

	public Article(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Article{" +
			"title='" + title + '\'' +
			", content='" + content + '\'' +
			'}';
	}
}