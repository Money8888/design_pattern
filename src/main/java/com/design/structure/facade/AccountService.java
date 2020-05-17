package com.design.structure.facade;

/**
 * 支付子系统
 */
public class AccountService {
    public boolean balanceCheck() {
        System.out.println("账户余额校验...");
        return true;
    }
}