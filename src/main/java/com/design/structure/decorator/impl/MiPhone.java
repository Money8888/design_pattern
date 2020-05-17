package com.design.structure.decorator.impl;

import com.design.structure.decorator.Phone;

/**
 * 手机子类
 * 小米手机
 */
public class MiPhone extends Phone {
    
    @Override
    public int getPrice() {
        return 1999;
    }

    @Override
    public String getDesc() {
        return "MiPhone";
    }
}