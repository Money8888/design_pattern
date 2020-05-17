package com.design.structure.decorator.impl;

import com.design.structure.decorator.Phone;

/**
 * 装饰器类(抽象类)
 * 继承手机类
 * 抽象类继承抽象类不用强制重写父类方法
 */
public abstract class Decorator extends Phone {

	private Phone phone;

	public Decorator(Phone phone){
		this.phone = phone;
	}

	@Override
	public int getPrice() {
		return phone.getPrice();
	}

	@Override
	public String getDesc() {
		return phone.getDesc();
	}
}
