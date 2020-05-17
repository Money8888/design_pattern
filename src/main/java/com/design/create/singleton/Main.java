package com.design.create.singleton;

public class Main {
	public static void main(String[] args) {
		// 静态代码块实现饿汉式单例模式
		hungrySingleton();
		// 静态内部类实现饿汉式单例模式
		staticInnerClassHungrySingleton();
	}

	private static void hungrySingleton(){
		// 失败,构造函数私有
		// HungrySingleton singleton = new HungrySingleton();

		// com.design.create.singleton.HungrySingleton@1b6d3586
		// ---------
		// com.design.create.singleton.HungrySingleton@1b6d3586
		// 多个实例的id一致，说明只创建了一个对象
		HungrySingleton singleton = HungrySingleton.getInstance();
		System.out.println(singleton);

		System.out.println("---------");
		HungrySingleton singleton1 = HungrySingleton.getInstance();
		System.out.println(singleton1);
	}

	private static void staticInnerClassHungrySingleton(){
		StaticInnerClassHungrySingleton staticInnerClassHungrySingleton = StaticInnerClassHungrySingleton.getInstance();
		StaticInnerClassHungrySingleton staticInnerClassHungrySingleton1 = StaticInnerClassHungrySingleton.getInstance();

		System.out.println(staticInnerClassHungrySingleton.equals(staticInnerClassHungrySingleton1));
	}
}
