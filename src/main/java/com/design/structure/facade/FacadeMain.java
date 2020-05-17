package com.design.structure.facade;

/**
 * 外观模式的启动类
 */
public class FacadeMain {
	public static void main(String[] args) {
		// 只用new一个外观类即可实现订单发货逻辑
		Phone phone = new Phone("小米手机");
		OrderService orderService = new OrderService();
		orderService.order(phone);
	}
}
