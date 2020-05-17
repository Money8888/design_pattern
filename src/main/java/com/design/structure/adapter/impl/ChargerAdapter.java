package com.design.structure.adapter.impl;

import com.design.structure.adapter.PowerSupply;
import com.design.structure.adapter.Standards;

/**
 * 适配器类
 * 需实现规格接口，并且是电源类的子类
 */
public class ChargerAdapter extends PowerSupply implements Standards {
	@Override
	public int output5V() {
		// 调用父类的方法
		int output = output220V();
		System.out.println("插上转换器，开始转换");
		// 实现转换器转换逻辑
		output = output / 44;
		System.out.println("转换成功，电源转换为:" + output);
		return output;
	}

	@Override
	public int input220() {
		int input = input0();
		System.out.println("插上插头开始充电");
		input = 220;
		System.out.println("充电中，电压为:" + input);
		return input;
	}
}
