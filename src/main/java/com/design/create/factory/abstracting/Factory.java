package com.design.create.factory.abstracting;

import com.design.create.factory.Charger;
import com.design.create.factory.Phone;

/**
 * 抽象工厂
 * 用于对两种相互依赖的类分别生成对象
 */
public interface Factory {
	Phone producePhone();
	Charger produceCharger();
}
