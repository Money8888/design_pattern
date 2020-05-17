package com.design.structure.flyweight;

import com.design.structure.flyweight.impl.BusinessPPT;
import com.design.structure.flyweight.impl.SciencePPT;

/**
 * 享元模式启动类
 * 采用工厂模式创建类
 */
public class FlyweightMain {

	public static void main(String[] args) {
		// new一个工厂对象
		PPTFactory pptFactory = new PPTFactory();
		PowerPoint ppt1 = pptFactory.getPPT(BusinessPPT.class);
		ppt1.setTitle("工作汇报");
		System.out.println(ppt1);
		PowerPoint ppt2 = pptFactory.getPPT(BusinessPPT.class);
		ppt2.setTitle("检查验收");
		System.out.println(ppt2);
		PowerPoint ppt3 = pptFactory.getPPT(SciencePPT.class);
		ppt3.setTitle("科学检索");
		System.out.println(ppt3);
	}
}
