package com.design.structure.composite;

/**
 * 组件抽象类
 * 定义linux文件夹和文件的所有操作
 */
public abstract class Component {

	private String name;

	public Component(String name){
		this.name = name;
	}

	public void add(Component component) {
		throw new UnsupportedOperationException("不支持添加操作");
	}

	public void remove(Component component) {
		throw new UnsupportedOperationException("不支持删除操作");
	}


	public void vim(String content) {
		throw new UnsupportedOperationException("不支持使用vim编辑器打开");
	}

	public void cat() {
		throw new UnsupportedOperationException("不支持查看操作");
	}

	public void print() {
		throw new UnsupportedOperationException("不支持打印操作");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
