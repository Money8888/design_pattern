package com.design.behavior.status.impl;

import com.design.behavior.status.State;

/**
 * 关闭状态
 */
public class CloseState extends State {

	// 关闭状态下不能暂停
	@Override
	public void pause() {
		System.out.println("关闭状态下不能暂停");
	}

	@Override
	public void speed() {
		System.out.println("关闭状态下不能加速");
	}
}
