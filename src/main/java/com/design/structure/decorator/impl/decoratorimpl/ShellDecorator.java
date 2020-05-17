package com.design.structure.decorator.impl.decoratorimpl;

import com.design.structure.decorator.Phone;
import com.design.structure.decorator.impl.Decorator;

/**
 * 手机壳装饰器
 * 继承装饰器抽象类
 */
public class ShellDecorator extends Decorator {

	public ShellDecorator(Phone phone) {
		super(phone);
	}

	@Override
	public int getPrice() {
		// 增加的一些功能,200为手机壳的价钱，总共给原始对象增加200
		return super.getPrice() + 200;
	}

	@Override
	public String getDesc() {
		return super.getDesc() + " + 手机壳";
	}
}
