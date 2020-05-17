package com.design.behavior.template_method;

/**
 * 抽象父类
 * 手机类
 * @author 86188
 */
public abstract class Phone {

	// 具体方法
	private void addCamera() {
		System.out.println("组装摄像头");
	}

	private void addBattery() {
		System.out.println("安装电池");
	}

	private void addNFC() {
		System.out.println("增加NFC功能");
	}

	// 钩子方法，判断是否需要NFC
	public abstract boolean needAddNFC();

	// 抽象方法
	public abstract void packaged();

	// 模板方法，装备手机零件
	public void assembling(){
		addCamera();
		addBattery();
		if(needAddNFC()){
			addNFC();
		}
		packaged();
	}
}
