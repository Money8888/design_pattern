package com.design.create.factory.pojoimpl;

import com.design.create.factory.Charger;
import com.design.create.factory.Phone;

/**
 * 具体的充电器类，实现与手机类的交互
 */
public class HuaiweiCharger extends Charger {
    @Override
    public void charge(Phone phone) {
        System.out.println("华为充电器给" + phone + "充电");
    }
}