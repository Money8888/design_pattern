package com.design.structure.bridge;

import com.design.structure.bridge.colorimpl.Blue;
import com.design.structure.bridge.colorimpl.Red;
import com.design.structure.bridge.shapeimpl.Round;
import com.design.structure.bridge.shapeimpl.Square;

/**
 * 桥模式
 * 一个图形的形状和颜色进行分离，从而可以通过组合来实现的不同的效果
 */
public class BridgeMain {
	public static void main(String[] args) {
		// 实现颜色与形状的自由组合，多对多

		Square square = new Square();
		square.setColor(new Red());
		square.getDesc();

		Round round1 = new Round();
		round1.setColor(new Red());
		round1.getDesc();

		Round round2 = new Round();
		round2.setColor(new Blue());
		round2.getDesc();
	}
}
