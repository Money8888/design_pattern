package com.design.structure.bridge.shapeimpl;

import com.design.structure.bridge.Shape;

public class Round extends Shape {
    @Override
    public void getDesc() {
        System.out.println(getColor().getDesc() + "圆形");
    }
}