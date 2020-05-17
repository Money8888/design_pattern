package com.design.behavior.duty_chain;

import com.design.behavior.duty_chain.impl.DepartManager;
import com.design.behavior.duty_chain.impl.GroupLeader;
import com.design.behavior.duty_chain.impl.President;

/**
 * 责任链模式的启动类
 * 类似于链表，一级一级向上递增
 */
public class DutyChainMain {
	public static void main(String[] args) {

		GroupLeader groupLeader = new GroupLeader();
		DepartManager departManager = new DepartManager();
		President president = new President();

		// 设置责任链，一级一级向上递增
		groupLeader.setNextLeader(departManager).setNextLeader(president);
		// 上一级
//		DepartManager leader = (DepartManager) groupLeader.setNextLeader(departManager);
//		President leader1 = (President)leader.setNextLeader(president);
		groupLeader.approval(new ApplyOrder("事假", 10));
		departManager.approval(new ApplyOrder("病假", 2));
	}
}
