package com.design.structure.adapter;

/**
 * 电源类
 */
public class PowerSupply {

	private final int output = 220;

	private final int input = 0;

	public int output220V() {
		System.out.println("电源电压：" + output);
		return output;
	}

	public int input0(){
		System.out.println("电源断开");
		return input;
	}
}
