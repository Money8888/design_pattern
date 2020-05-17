package com.design.behavior.duty_chain;

/**
 * 领导类
 */
public abstract class Leader {

	protected Leader leader;

	// 责任链模式的核心：其需要持有一个后继者
	public Leader setNextLeader(Leader leader){
		this.leader = leader;
		return leader;
	}

	// 批准申请单方法
	public abstract void approval(ApplyOrder order);

}
