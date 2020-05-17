package com.design.behavior.visitor;

/**
 * 档案室接口
 */
public interface Archive {

	// 接受访问者
	void accept(Visitor visitor);
}
