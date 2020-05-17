package com.design.create.singleton;

import java.io.*;

/**
 * 序列化攻击单例模式demo
 * 解决办法是单例类中定义 readResolve() 方法
 */
public class SerializationDamage {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 构架一个饿汉单例
		HungrySingleton instance = HungrySingleton.getInstance();
		// 将对象实例写入输出流,默认文件创建在项目根目录
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SingletonFile"));
		outputStream.writeObject(instance);
		// 构建输入流，并读取
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SingletonFile"));
		HungrySingleton newInstance = (HungrySingleton)inputStream.readObject();
		System.out.println(instance == newInstance);
	}
}
