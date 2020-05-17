package com.design.behavior.observer.observableimpl;

import com.design.behavior.observer.Observable;
import com.design.behavior.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 商家类
 * 用于通知用户涨价或降价
 */
public class Shop implements Observable {

	public List<Observer> observerList = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers(String message) {
		for (Observer observer : observerList) {
			observer.receive(message);
		}
	}
}
