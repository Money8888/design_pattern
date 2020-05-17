package com.design.structure.flyweight;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * 通过工厂模式来进行创建和共享
 */
public class PPTFactory {

	private Map<String, PowerPoint> hashMap = new HashMap<>();

	public PowerPoint getPPT(Class<? extends PowerPoint> pptClass){
		try {
			String name = pptClass.getName();
			if(hashMap.keySet().contains(name)){
				return hashMap.get(name);
			}
			// 通过反射创建ppt实例
			Constructor<?> constructor = Class.forName(name).getConstructor(String.class);
			PowerPoint powerPoint = (PowerPoint) constructor.newInstance("PPT工厂版本");
			hashMap.put(name, powerPoint);
			return powerPoint;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
