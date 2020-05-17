package com.design.structure.bridge.shapeimpl;

import com.design.structure.bridge.Color;
import com.design.structure.bridge.Shape;

public class Square extends Shape {
    @Override
    public void getDesc() {
		Color color = getColor();
		System.out.println(getColor().getDesc() + "正方形");
    }
}