package com.design.behavior.strategy;

import com.design.behavior.strategy.impl.BonusStrategy;
import com.design.behavior.strategy.impl.TravelStrategy;
import com.design.behavior.strategy.impl.WorkOvertimeStrategy;

/**
 * 策略模式启动类
 */
public class StrategyMain {
	public static void main(String[] args) {
		// 营业额
		int turnover = Integer.parseInt(args[0]);
		Company company = new Company();
		if (turnover > 1000) {
			company.setStrategy(new BonusStrategy()).execute();
		} else if (turnover > 100) {
			company.setStrategy(new TravelStrategy()).execute();
		} else {
			company.setStrategy(new WorkOvertimeStrategy()).execute();
		}
	}
}
