package com.design.structure.flyweight.impl;

import com.design.structure.flyweight.PowerPoint;

public class ArtPPT extends PowerPoint {
    public ArtPPT(String copyright) {
        super(copyright);
    }
    @Override
    public void create() {
        System.out.println("艺术类PPT模板");
    }
}