package com.design.create.factory.ordinary.impl;

import com.design.create.factory.ordinary.Factory;
import com.design.create.factory.pojoimpl.HuaweiPhone;
import com.design.create.factory.Phone;

/**
 * 生产具体手机的实现类
 * 重写生产方法
 */
public class HuaweiPhoneFactory implements Factory {
    @Override
    public Phone produce() {
        return new HuaweiPhone();
    }
}