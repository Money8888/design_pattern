package com.design.create.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例
 * 在类初始化时就完成相关单例对象的创建
 * 静态代码块方式
 */
public class HungrySingleton implements Serializable {
	private static final HungrySingleton instance;

	static {
		instance = new HungrySingleton();
	}

	// 防止被序列化攻击，造成单例对象不一致
	//	This readResolve method follows the same invocation rules and
	//  accessibility rules as writeReplace
	private Object readResolve() {
		return instance;
	}



	// 确保构造器私有
	private HungrySingleton(){
		// 规避反射破坏单例的异常
		if(instance != null){
			throw new RuntimeException("单例模式禁止反射调用");
		}
	}

	// 获取单例对象

	public static HungrySingleton getInstance() {
		return instance;
	}
}
