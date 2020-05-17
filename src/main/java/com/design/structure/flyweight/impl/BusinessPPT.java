package com.design.structure.flyweight.impl;

import com.design.structure.flyweight.PowerPoint;

/**
 * ppt实现类
 */
public class BusinessPPT extends PowerPoint {

	public BusinessPPT(String copyright){
		super(copyright);
	}

	@Override
	public void create() {
		System.out.println("商务类PPT模板");
	}
}
