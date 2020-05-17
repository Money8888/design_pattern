package com.design.behavior.memento;

import java.util.Date;

/**
 * 备忘录对象
 */
public class Memorandum {

	private String title;
	private String content;
	private Date createTime;

	// 根据目标对象来创建备忘录对象
	public Memorandum(Article article) {
		this.title = article.getTitle();
		this.content = article.getContent();
		this.createTime = new Date();
	}

	public Article toArticle() {
		return new Article(this.title, this.content);
	}
}
