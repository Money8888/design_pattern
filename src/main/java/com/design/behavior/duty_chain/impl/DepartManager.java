package com.design.behavior.duty_chain.impl;

import com.design.behavior.duty_chain.ApplyOrder;
import com.design.behavior.duty_chain.Leader;

/**
 * 部门经理类
 */
public class DepartManager extends Leader {

	@Override
	public void approval(ApplyOrder order) {
		System.out.println(order.getTitle() + "被部门经理审核通过");
		if(order.getDayNum() >= 5){
			leader.approval(order);
		}
	}
}
