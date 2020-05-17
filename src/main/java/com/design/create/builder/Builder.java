package com.design.create.builder;

/**
 * 建造者抽象类
 * 需要和产品类进行关联
 * 用于给定生产什么样的产品的模板
 */
public abstract class Builder {

    protected Phone phone = new Phone();
    /*安装处理器*/
    public abstract void addProcessor();
    /*组装摄像头*/
    public abstract void addCamera();
    /*安装屏幕*/
    public abstract void addScreen();
  
    public Phone produce() {
        return phone;
    }
}