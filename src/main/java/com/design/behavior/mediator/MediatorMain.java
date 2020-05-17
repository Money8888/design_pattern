package com.design.behavior.mediator;

import com.design.behavior.mediator.impl.HouseMediator;

/**
 * 中介者模式启动类
 */
public class MediatorMain {

	public static void main(String[] args) {
		Mediator mediator = new HouseMediator();
		Person seller = new Person("卖方");
		Person seller2 = new Person("第三方");
		Person buyer = new Person("买方");

		// 注册
		mediator.register(seller);
		mediator.register(buyer);
		mediator.register(seller2);
		// 互发消息
		/*
		买方发送消息: 价格多少
		卖方收到消息:价格多少
		卖方发送消息: 10w
		买方收到消息:10w
		买方发送消息: 贵
		卖方收到消息:贵
		*/
		buyer.send("价格多少");
		seller.send("10w");
		buyer.send("贵");
	}
}
