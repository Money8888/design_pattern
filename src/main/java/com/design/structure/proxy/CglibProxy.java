package com.design.structure.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib 代理的主类
 * intercept用来代理对象功能的扩展
 */
public class CglibProxy implements MethodInterceptor {

	private Object target;

	public CglibProxy(Object target){
		this.target = target;
	}

	public Object getProxyInstance(){
		// 创建用于生成动态子类的工具类
		Enhancer enhancer = new Enhancer();
		// 指定动态生成类的父类(目标类)
		enhancer.setSuperclass(target.getClass());
		// 设置回调
		enhancer.setCallback(this);
		// 动态生成子类
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("权限3校验");
		Object invoke = method.invoke(target, objects);
		System.out.println("资源3回收");
		return invoke;
	}
}
