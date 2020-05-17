package com.design.create.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 验证枚举式单例的不受攻击性和线程安全性
 * 序列化攻击仍然对象一致
 * 反射攻击会抛异常，不能通过反射创建类
 * */
public class EnumInstanceTest {
	public static void main(String[] args) throws Exception {
		// 序列化攻击
		EnumInstance instance = EnumInstance.getInstance();
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("SingletonFile"));
		outputStream.writeObject(instance);
		// 构建输入流，并读取
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("SingletonFile"));
		EnumInstance newInstance = (EnumInstance)inputStream.readObject();
		System.out.println(instance == newInstance);

//		反射攻击
//		之所以构造参数是string和int两个是因为Enum的构造方法是
//		protected Enum(String name, int ordinal) {
//			this.name = name;
//			this.ordinal = ordinal;
//		}
		Constructor<EnumInstance> constructor = EnumInstance.class.getDeclaredConstructor(String.class, int.class);
		constructor.setAccessible(true);
		EnumInstance enumInstance = constructor.newInstance("name", 0);
		System.out.println(instance == enumInstance);
	}
}
