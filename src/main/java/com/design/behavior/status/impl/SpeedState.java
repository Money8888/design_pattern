package com.design.behavior.status.impl;

import com.design.behavior.status.State;

/**
 * 加速状态
 */
public class SpeedState extends State {
	@Override
	public void play() {
		System.out.println("正在处于加速播放状态");
	}
}
