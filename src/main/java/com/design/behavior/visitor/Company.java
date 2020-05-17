package com.design.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 通过公司管理类来访问
 */
public class Company {

	private List<Archive> archives = new ArrayList<>();

	// 增加档案
	public void add(Archive archive){
		archives.add(archive);
	}

	// 减少档案
	public void remove(Archive archive){
		archives.remove(archive);
	}

	// 接受访问者
	public void accept(Visitor visitor){
		for (Archive archive : archives) {
			archive.accept(visitor);
		}
	}
}
