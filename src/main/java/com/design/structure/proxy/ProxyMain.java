package com.design.structure.proxy;

import com.design.structure.proxy.impl.ProxyService;
import com.design.structure.proxy.impl.TargetService;

import java.lang.reflect.Proxy;

/**
 * 运行类
 */
public class ProxyMain {
	public static void main(final String[] args) {
		// 静态代理方式(将目标对象作为代理对象构造方法的参数传入)
		// 需创建目标类和代理类共同实习的接口(IService 接口)和 代理类
		// new代理对象
		ProxyService proxyService = new ProxyService(new TargetService());
		proxyService.compute();


		// jdk 动态代理，需要调用时才new代理对象
		// JDK 中的 Proxy 类和反射功能实现
		// 必须保证目标类是实现了接口方法的
		// 需创建IService接口不用事先显示的定义代理类
		TargetService targetService = new TargetService();
		IService proxyInstance = (IService) Proxy.newProxyInstance(
			targetService.getClass().getClassLoader(),
			// 代理类要实现的接口列表
			targetService.getClass().getInterfaces(),
			// InvocationHandler
			// public Object invoke(Object proxy, Method method, Object[] args)
			(proxy, method, args1) -> {
				System.out.println("权限2校验");
				Object invoke = method.invoke(targetService, args1);
				System.out.println("资源2回收");
				return invoke;
			});
		proxyInstance.compute();

		// Cglib 动态代理
		// 不用创建IService接口
		// 处理没有实现接口的目标类
		// new一个cglib的代理类
		CglibProxy cglibProxy = new CglibProxy(new TargetService());
		TargetService service = (TargetService) cglibProxy.getProxyInstance();
		service.compute();
	}
}
