package com.design.structure.decorator;

import com.design.structure.decorator.impl.MiPhone;
import com.design.structure.decorator.impl.decoratorimpl.FilmDecorator;
import com.design.structure.decorator.impl.decoratorimpl.ShellDecorator;

/**
 * 装饰器模式启动类
 */
public class DecoratorMain {

	public static void main(String[] args) {
		Phone phone = new ShellDecorator(new FilmDecorator(new MiPhone()));
		System.out.println(phone.getDesc() + " : " + phone.getPrice());
	}
}
