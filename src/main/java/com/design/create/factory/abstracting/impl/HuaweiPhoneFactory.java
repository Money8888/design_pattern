package com.design.create.factory.abstracting.impl;

import com.design.create.factory.Charger;
import com.design.create.factory.pojoimpl.HuaiweiCharger;
import com.design.create.factory.pojoimpl.HuaweiPhone;
import com.design.create.factory.Phone;
import com.design.create.factory.abstracting.Factory;

/**
 * 具体的工厂，华为工厂
 * 该类包含生产手机和充电器
 */
public class HuaweiPhoneFactory implements Factory {
    @Override
    public Phone producePhone() {
        return new HuaweiPhone();
    }
    @Override
    public Charger produceCharger() {
        return new HuaiweiCharger();
    }
}