package com.design.create.factory.abstracting;

import com.design.create.factory.abstracting.impl.HuaweiPhoneFactory;
import com.design.create.factory.abstracting.impl.XiaomiPhoneFactory;

/**
 * 抽象工厂类测试
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		XiaomiPhoneFactory xiaomiPhoneFactory = new XiaomiPhoneFactory();
		//用小米生产的充电器给小米生产的手机充电
		xiaomiPhoneFactory.produceCharger().charge(xiaomiPhoneFactory.producePhone());

		HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
		huaweiPhoneFactory.produceCharger().charge(huaweiPhoneFactory.producePhone());
	}
}
