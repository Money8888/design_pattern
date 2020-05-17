package com.design.structure.flyweight.impl;

import com.design.structure.flyweight.PowerPoint;

public class SciencePPT extends PowerPoint {
    public SciencePPT(String copyright) {
        super(copyright);
    }
    @Override
    public void create() {
        System.out.println("科技类PPT模板");
    }
}