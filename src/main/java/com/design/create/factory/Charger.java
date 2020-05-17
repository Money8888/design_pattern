package com.design.create.factory;

/**
 * 充电器类
 * 抽象方法充电
 * 与手机类相依赖
 */
public abstract class Charger {
    public abstract void charge(Phone phone);
}