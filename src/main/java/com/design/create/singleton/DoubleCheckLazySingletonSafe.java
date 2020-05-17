package com.design.create.singleton;

/**
 * 多个线程安全
 * 提高并发获取对象的性能
 */
public class DoubleCheckLazySingletonSafe {

	// 这里的 volatile 是为了禁止对象创建过程的指令重排序
	// 1、给对象分配内存空间；
	// 2、调用对象的构造器方法，并执行初始化操作；
	// 3、将变量指向相应的内存地址
	// 即为了防止2和3步发生排序，防止其他线程拿到一个尚未初始化完成的instance
	private static volatile DoubleCheckLazySingletonSafe instance = null;

	// 一定要写，不然默认构造方法为公有方法
	private DoubleCheckLazySingletonSafe(){
	}


	public static DoubleCheckLazySingletonSafe getInstance() {
		if(instance == null){
			synchronized (DoubleCheckLazySingletonSafe.class){
				// 一定要再判断
				// 为了避免当两个线程都进入第一个if，然后一个线程获得了锁进入new了对象，防止释放锁后另一个线程进来new对象
				if(instance == null){
					instance = new DoubleCheckLazySingletonSafe();
				}
			}
		}
		return instance;
	}
}
