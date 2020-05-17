package com.design.behavior.observer;

import com.design.behavior.observer.observableimpl.Shop;
import com.design.behavior.observer.observerimpl.User;

/**
 * 观察者模式启动类
 */
public class ObserverMain {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.addObserver(new User("p1"));
		shop.addObserver(new User("p2"));
		shop.addObserver(new User("p3"));
		shop.notifyObservers("促销啦");
	}
}
