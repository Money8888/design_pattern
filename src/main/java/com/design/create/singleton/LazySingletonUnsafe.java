package com.design.create.singleton;

public class LazySingletonUnsafe {

	// 不进行初始化，直接赋值为null
	private static LazySingletonUnsafe instance = null;

	private LazySingletonUnsafe(){
	}

	public static LazySingletonUnsafe getInstance1(){
		// 待调用方法时判断，如果不为null，说明之前已经new了单例对象
		// 线程不安全，instance为临界资源
		if(instance == null){
			instance = new LazySingletonUnsafe();
		}
		return instance;
	}

	// 线程安全
	// 但损耗性能，synchronized 修饰的是静态方法，其锁住的是整个类对象
	// 因为假设对象一旦创建成功，其他线程来获取该对象时会因为被锁导致等待，从而降低了吞吐量
	public synchronized static LazySingletonUnsafe getInstance2(){
		if(instance == null){
			instance = new LazySingletonUnsafe();
		}
		return instance;
	}

	// 解决方法见双重检查类 DoubleCheckLazySingletonSafe
}
