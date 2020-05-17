package com.design.structure.bridge;

/**
 * 图形的抽象和实现
 */
public abstract class Shape {

	private Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract void getDesc();
}
