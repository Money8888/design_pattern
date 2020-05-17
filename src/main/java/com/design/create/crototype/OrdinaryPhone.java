package com.design.create.crototype;

/**
 * 原型模式
 * 采用java中Cloneable 的clone方法进行对象间的拷贝
 */
public class OrdinaryPhone implements Cloneable {

	private String type;

	public OrdinaryPhone(String type) {
		System.out.println("构造器被调用");
		this.type = type;
	}

	public void call() {
		System.out.println(type + "拨打电话");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone方法被调用");
		return super.clone();
	}
}
