package com.design.create.factory.ordinary;

import com.design.create.factory.ordinary.impl.HuaweiPhoneFactory;
import com.design.create.factory.ordinary.impl.XiaomiPhoneFactory;

/**
 * 由调用者决定哪一类
 */
public class OrdinaryFactoryTest {
	public static void main(String[] args) {
		XiaomiPhoneFactory xiaomiPhoneFactory = new XiaomiPhoneFactory();
		xiaomiPhoneFactory.produce().call("小米111");
		HuaweiPhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
		huaweiPhoneFactory.produce().call("华为222");
	}
}
