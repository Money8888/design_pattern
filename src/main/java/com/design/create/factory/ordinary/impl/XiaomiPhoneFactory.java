package com.design.create.factory.ordinary.impl;

import com.design.create.factory.Phone;
import com.design.create.factory.ordinary.Factory;
import com.design.create.factory.pojoimpl.XiaomiPhone;

public class XiaomiPhoneFactory implements Factory {
    @Override
    public Phone produce() {
        return new XiaomiPhone();
    }
}