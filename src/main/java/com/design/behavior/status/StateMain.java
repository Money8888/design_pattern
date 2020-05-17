package com.design.behavior.status;

/**
 * 状态模式的启动类
 */
public class StateMain {
	public static void main(String[] args) {
		Player player = new Player();
		player.play();
		player.pause();
		player.speed();
		player.close();
	}
}
