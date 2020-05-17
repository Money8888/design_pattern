package com.design.structure.proxy.impl;

import com.design.structure.proxy.IService;

/**
 * 代理对象
 */
public class ProxyService implements IService {

	// 注入目标对象,多态

	private IService target;

	public ProxyService(IService target){
		this.target = target;
	}

	@Override
	public void compute() {
		System.out.println("权限1校验");
		// 执行主业务
		target.compute();
		System.out.println("资源1回收");
	}
}
