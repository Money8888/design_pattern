package com.design.create.builder;

import com.design.create.builder.impl.HuaweiBuilder;
import com.design.create.builder.impl.XiaomiBuilder;

/**
 * 调用管理者类，实现产品的生产
 */
public class BuilderTest {
	public static void main(String[] args) {
		Phone huawei = new Manager(new HuaweiBuilder()).buy();
		System.out.println(huawei);

		Phone xiaomi = new Manager(new XiaomiBuilder()).buy();
		System.out.println(xiaomi);
	}
}
