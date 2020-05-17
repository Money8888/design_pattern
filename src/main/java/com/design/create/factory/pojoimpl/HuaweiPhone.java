package com.design.create.factory.pojoimpl;

import com.design.create.factory.Phone;

/**
 * 抽象类的子类
 * 重写父类的打电话方法，明确是谁打电话
 */
public class HuaweiPhone extends Phone {
    @Override
	public void call(String phoneNum) {
        System.out.println("华为手机拨打电话：" + phoneNum);
    }
}