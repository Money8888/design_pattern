package com.design.behavior.duty_chain;

/**
 * 申请单类
 */
public class ApplyOrder {

	// 标题
	private String title;

	// 请假天数
	private int dayNum;

	public ApplyOrder(String title, int dayNum) {
		this.title = title;
		this.dayNum = dayNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDayNum() {
		return dayNum;
	}

	public void setDayNum(int dayNum) {
		this.dayNum = dayNum;
	}
}
