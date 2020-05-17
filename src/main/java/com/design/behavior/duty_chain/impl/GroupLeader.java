package com.design.behavior.duty_chain.impl;

import com.design.behavior.duty_chain.ApplyOrder;
import com.design.behavior.duty_chain.Leader;

/**
 * 组长类
 */
public class GroupLeader extends Leader {

	@Override
	public void approval(ApplyOrder order) {
		System.out.println(order.getTitle() + " 被组长审批通过");
		// 若请假天数大于3则需要被比组长更大级别的领导审核，把审核转给leader
		if(order.getDayNum() >= 3){
			leader.approval(order);
		}
	}


}
