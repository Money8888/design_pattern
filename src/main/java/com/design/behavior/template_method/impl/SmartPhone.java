package com.design.behavior.template_method.impl;

import com.design.behavior.template_method.Phone;

public class SmartPhone extends Phone {
	@Override
	public boolean needAddNFC() {
		return true;
	}

	@Override
	public void packaged() {
		System.out.println("附赠耳机一副");
	}
}
