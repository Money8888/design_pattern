package com.design.behavior.template_method.impl;

import com.design.behavior.template_method.Phone;

/**
 * 抽象父类的子类
 * 老年机类
 */
public class OlderPhone extends Phone {
	@Override
	public boolean needAddNFC() {
		return false;
	}

	@Override
	public void packaged() {
		System.out.println("附赠一个手机壳");
	}
}
