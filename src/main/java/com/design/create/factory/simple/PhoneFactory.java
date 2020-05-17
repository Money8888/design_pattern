package com.design.create.factory.simple;

import com.design.create.factory.Phone;
import com.design.create.factory.pojoimpl.HuaweiPhone;
import com.design.create.factory.pojoimpl.XiaomiPhone;

/**
 * 手机工厂类
 * 获取是哪一款手机的实体类
 */
public class PhoneFactory {

	// 违背开闭原则
	public Phone getPhone(String type) {
		if ("xiaomi".equalsIgnoreCase(type)) {
			return new XiaomiPhone();
		} else if ("huawei".equalsIgnoreCase(type)) {
			return new HuaweiPhone();
		}
		return null;
	}

	/**
	 * 采用泛型改进
	 * @param phoneClass
	 * @return
	 */
	public Phone getPhone(Class<? extends Phone> phoneClass){
		try {
			return (Phone) Class.forName(phoneClass.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}


}
