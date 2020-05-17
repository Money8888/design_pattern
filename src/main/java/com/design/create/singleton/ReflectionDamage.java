package com.design.create.singleton;

import java.lang.reflect.Constructor;

/**
 * 反射方式破坏单例demo
 * 由于 Java 的反射功能过于强大，这种破坏几乎是无法规避的
 * 即便在创建单例对象时将构造器声明为私有，此时仍然可以通过反射修改权限来获取，此时单例模式就被破坏了
 */
public class ReflectionDamage {
	public static void main(String[] args) throws Exception {
		// 获取构造方法
		Constructor<HungrySingleton> constructor = HungrySingleton.class.getDeclaredConstructor();
		// 获取私有构造器的访问权限
		constructor.setAccessible(true);
		// 创建对象实例
		HungrySingleton singleton = constructor.newInstance();
		HungrySingleton instance = HungrySingleton.getInstance();
		System.out.println(singleton == instance);
	}
}
