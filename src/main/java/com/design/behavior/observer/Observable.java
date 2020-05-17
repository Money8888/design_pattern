package com.design.behavior.observer;

/**
 * 被观察者接口
 */
public interface Observable {

	// 接收观察者
	public void addObserver(Observer observer);

	// 移除观察者
	public void removeObserver(Observer observer);

	// 通知观察者
	void notifyObservers(String message);
}
