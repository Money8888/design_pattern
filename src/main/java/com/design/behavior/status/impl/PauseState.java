package com.design.behavior.status.impl;

import com.design.behavior.status.State;

public class PauseState extends State {
	@Override
	public void speed() {
		System.out.println("暂停状态下不支持加速");
	}
}
