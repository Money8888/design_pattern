package com.design.create.builder;

/**
 * 产品的管理者类
 * 用于指导建造的全过程
 */
public class Manager {

	private Builder builder;

	public Manager(Builder builder) {
		this.builder = builder;
	}

	// 主方法
	public Phone buy(){
		builder.addCamera();
		builder.addProcessor();
		builder.addScreen();
		return builder.produce();
	}
}
