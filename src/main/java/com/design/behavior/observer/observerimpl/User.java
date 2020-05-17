package com.design.behavior.observer.observerimpl;

import com.design.behavior.observer.Observer;

/**
 * 顾客类
 * 用于接收商家发布的信息
 */
public class User implements Observer {

	private String name;

	public User(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void receive(String message) {
		System.out.println(getName() + "收到消息:" + message);
	}
}
