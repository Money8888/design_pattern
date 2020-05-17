package com.design.structure.adapter;

import com.design.structure.adapter.impl.ChargerAdapter;

/**
 * 适配器类主类
 */
public class AdapterMain {
	public static void main(String[] args) {
		// 左父(规格接口)右子(转换器适配器)
		Standards standards = new ChargerAdapter();
		standards.input220();
		standards.output5V();
	}
}
