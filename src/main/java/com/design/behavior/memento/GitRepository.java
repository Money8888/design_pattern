package com.design.behavior.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * git历史版本类
 * 管理者类
 */
public class GitRepository {

	public List<Memorandum> repository = new ArrayList<>();

	// 保存当前的数据
	public void save(Article article){
		Memorandum memorandum = new Memorandum(article);
		repository.add(memorandum);
	}

	// 获取某一版本的数据
	public Article get(int version){
		Memorandum memorandum = repository.get(version);
		return memorandum.toArticle();
	}

	// 撤销当前操作
	// 即返回最后一个版本的历史数据
	public Article back(){
		return repository.get(repository.size() - 1).toArticle();
	}

}
