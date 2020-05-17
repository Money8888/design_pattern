package com.design.structure.decorator.impl.decoratorimpl;

import com.design.structure.decorator.Phone;
import com.design.structure.decorator.impl.Decorator;

/**
 * 手机膜类
 */
public class FilmDecorator extends Decorator {

	public FilmDecorator(Phone phone) {
		super(phone);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + 100;
	}

	@Override
	public String getDesc() {
		return super.getDesc() + " 钢化膜";
	}
}
