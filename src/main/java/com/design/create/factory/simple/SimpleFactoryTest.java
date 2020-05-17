package com.design.create.factory.simple;

import com.design.create.factory.pojoimpl.HuaweiPhone;
import com.design.create.factory.pojoimpl.XiaomiPhone;

/**
 * 简单工厂模式测试
 */
public class SimpleFactoryTest {
	public static void main(String[] args) {
		// 新建一个工厂
		PhoneFactory phoneFactory = new PhoneFactory();
		// 分别打电话，
		// 违反开闭原则
//		phoneFactory.getPhone("xiaomi").call("小米111");
//		phoneFactory.getPhone("huawei").call("华为222");

		// 采用泛型
		phoneFactory.getPhone(XiaomiPhone.class).call("小米111");
		phoneFactory.getPhone(HuaweiPhone.class).call("华为222");
	}
}
