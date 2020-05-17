package com.design.behavior.status;

/**
 * 状态类
 * 播放器，有播放状态，关闭状态，暂停状态，加速播放状态
 * 四种状态间可以相互转换
 * 但存在一定的限制，比如在关闭或者暂停状态下，都不能加速视频
 */
public class State {

	private Player player;

	public void setPlayer(Player player) {
		this.player = player;
	}

	/* 定义四种状态 */
	public void play(){
		player.setState(Player.PLAY_STATE);
	}

	public void pause(){
		player.setState(Player.PAUSE_STATE);
	}

	public void close(){
		player.setState(Player.CLOSE_STATE);
	}

	public void speed(){
		player.setState(Player.SPEED_STATE);
	}

}
