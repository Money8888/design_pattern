package com.design.behavior.strategy.impl;

import com.design.behavior.strategy.Strategy;

/**
 * 策略的接口实现类
 *
 */
public class TravelStrategy implements Strategy {
	@Override
	public void execute() {
		System.out.println("集体旅游");
	}
}
