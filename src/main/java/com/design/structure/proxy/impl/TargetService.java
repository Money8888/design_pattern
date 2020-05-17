package com.design.structure.proxy.impl;

import com.design.structure.proxy.IService;

/**
 * 目标对象
 */
public class TargetService implements IService {
	@Override
	public void compute() {
		System.out.println("主业务处理");
	}
}
