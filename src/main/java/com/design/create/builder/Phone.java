package com.design.create.builder;

/**
 * 产品类
 * 手机实体类
 */

public class Phone {
    /*处理器*/
    private String processor;
    /*摄像头*/
    private String camera;
    /*屏幕*/
    private String screen;

	public String getProcessor() {
		return processor;
	}

	@Override
	public String toString() {
		return "Phone{" +
			"processor='" + processor + '\'' +
			", camera='" + camera + '\'' +
			", screen='" + screen + '\'' +
			'}';
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}
}