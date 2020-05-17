package com.design.behavior.strategy.impl;

import com.design.behavior.strategy.Strategy;

public class WorkOvertimeStrategy implements Strategy {
    @Override
    public void execute() {
        System.out.println("奖励加班");
    }
}