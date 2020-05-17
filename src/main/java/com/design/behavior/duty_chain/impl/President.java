package com.design.behavior.duty_chain.impl;

import com.design.behavior.duty_chain.ApplyOrder;
import com.design.behavior.duty_chain.Leader;

/**
 * 总经理类
 */
public class President extends Leader {

	@Override
	public void approval(ApplyOrder order) {
		System.out.println(order.getTitle() + "总经理审核通过");
	}
}
