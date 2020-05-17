package com.design.behavior.strategy;

/**
 * 公司类
 */
public class Company {

	private Strategy strategy;

	public Company setStrategy(Strategy strategy) {
		this.strategy = strategy;
		return this;
	}

	public void execute(){
		strategy.execute();
	}
}
