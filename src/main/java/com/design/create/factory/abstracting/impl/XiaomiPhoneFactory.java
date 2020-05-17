package com.design.create.factory.abstracting.impl;

import com.design.create.factory.Charger;
import com.design.create.factory.Phone;
import com.design.create.factory.pojoimpl.XiaomiCharger;
import com.design.create.factory.pojoimpl.XiaomiPhone;
import com.design.create.factory.abstracting.Factory;

/**
 * 小米工厂类
 */
public class XiaomiPhoneFactory implements Factory {
    @Override
    public Phone producePhone() {
        return new XiaomiPhone();
    }
    @Override
    public Charger produceCharger() {
        return new XiaomiCharger();
    }
}