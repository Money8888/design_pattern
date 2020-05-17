package com.design.behavior.observer;

/**
 * 观察者类
 */
public interface Observer {
	// 接收消息
    void receive(String message);
}