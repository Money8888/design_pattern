package com.design.create.factory.pojoimpl;

import com.design.create.factory.Phone;

public class XiaomiPhone extends Phone {
    @Override
	public void call(String phoneNum) {
        System.out.println("小米手机拨打电话：" + phoneNum);
    }
}