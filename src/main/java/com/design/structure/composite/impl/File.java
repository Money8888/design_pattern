package com.design.structure.composite.impl;

import com.design.structure.composite.Component;

/**
 * 文件类
 */
public class File extends Component {

	// 文件内容
	private String content;

	public File(String name) {
		super(name);
	}

	@Override
	public void vim(String content) {
		this.content = content;
	}

	@Override
	public void cat() {
		System.out.println(content);
	}

	@Override
	public void print() {
		System.out.println(getName());
	}
}
