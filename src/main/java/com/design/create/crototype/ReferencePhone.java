package com.design.create.crototype;

import java.util.Date;

/**
 * 当对象中有引用数据类型的成员变量时，需要考虑深拷贝与浅拷贝
 */
public class ReferencePhone implements Cloneable{

	private String type;
	private Date produceTime;

	public ReferencePhone(String type, Date produceTime) {
		System.out.println("构造方法被调用");
		this.type = type;
		this.produceTime = produceTime;
	}

	public void call(){
		System.out.println(type + "拨打电话");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone方法被调用");
		ReferencePhone referencePhone = (ReferencePhone)super.clone();
		// 进行引用类型的深拷贝
		referencePhone.produceTime = (Date) referencePhone.produceTime.clone();
		return referencePhone;
	}
}
