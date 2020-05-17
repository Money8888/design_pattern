package com.design.behavior.memento;

/**
 * 备忘录模式的启动类
 */
public class MementoMain {

	public static void main(String[] args) {
		GitRepository repository = new GitRepository();
		Article article = new Article("java", "1.0");
		repository.save(article);
		article.setContent("2.0");
		repository.save(article);
		article.setContent("3.0");
		repository.save(article);
		System.out.println(repository.back());
		System.out.println(repository.get(2));
	}

}
