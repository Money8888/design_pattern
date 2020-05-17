package com.design.structure.facade;

/**
 * 下单系统
 * 包含安全检查，支付，物流等子系统功能
 * 用户不需要了解安全检查，支付和物流的实现细节
 * 给用户提供的外观门面
 */
public class OrderService {

	private EnvInspectionService inspectionService = new EnvInspectionService();
	private AccountService accountService = new AccountService();
	private LogisticsService logisticsService = new LogisticsService();

	public void order(Phone phone){
		if(inspectionService.evInspection()){
			if(accountService.balanceCheck()){
				System.out.println("支付成功");
				logisticsService.ship(phone);
			}
		}
	}
}
