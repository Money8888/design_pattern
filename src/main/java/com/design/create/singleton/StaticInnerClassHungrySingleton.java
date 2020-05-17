package com.design.create.singleton;

/**
 * 静态内部类
 * 在类初始化时就完成相关单例对象的创建
 */
public class StaticInnerClassHungrySingleton {
	// 定义静态内部类
	private static class InnerClass{
		private static StaticInnerClassHungrySingleton instance = new StaticInnerClassHungrySingleton();
	}

	// 确保构造器私有
	private StaticInnerClassHungrySingleton(){}

	// 获取单例对象
	public static StaticInnerClassHungrySingleton getInstance() {
		return InnerClass.instance;
	}
}
