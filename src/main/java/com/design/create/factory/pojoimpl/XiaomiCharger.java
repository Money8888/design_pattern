package com.design.create.factory.pojoimpl;

import com.design.create.factory.Charger;
import com.design.create.factory.Phone;

public class XiaomiCharger extends Charger {
    @Override
    public void charge(Phone phone) {
        System.out.println("小米充电器给" + phone + "充电");
    }
}