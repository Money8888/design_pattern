package com.design.structure.flyweight;

/**
 * ppt抽象类
 */
public abstract class PowerPoint {
	//版权
	private String copyright;
	//标题
	private String title;

	// 版权为内部属性，由构造方法指定
	public PowerPoint(String copyright) {
		this.copyright = copyright;
	}

	// 标题为外在属性，可由外部更改，由set方法实现
	public void setTitle(String title){
		this.title = title;
	}

	public abstract void create();

	@Override
	public String toString() {
		return "PowerPoint{" +
			"copyright='" + copyright + '\'' +
			", title='" + title + '\'' +
			'}';
	}
}
