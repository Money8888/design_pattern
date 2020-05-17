package com.design.create.builder.impl;

import com.design.create.builder.Builder;

public class HuaweiBuilder extends Builder {

	// phone为公共父类成员变量，子类可直接获得

    @Override
    public void addProcessor() {
        phone.setProcessor("海思麒麟处理器");
    }

    @Override
    public void addCamera() {
        phone.setCamera("莱卡摄像头");
    }

    @Override
    public void addScreen() {
        phone.setScreen("OLED");
    }
}