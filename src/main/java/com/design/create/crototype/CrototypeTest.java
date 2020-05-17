package com.design.create.crototype;

import java.util.Date;

/**
 * 测试原型模式
 */
public class CrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		OrdinaryPhone ordinaryPhone = new OrdinaryPhone("小米");
		OrdinaryPhone clone = (OrdinaryPhone)ordinaryPhone.clone();
		ordinaryPhone.call();
		clone.call();

		ReferencePhone referencePhone = new ReferencePhone("华为", new Date());
		ReferencePhone referenceClone = (ReferencePhone)referencePhone.clone();
		referencePhone.call();
		referenceClone.call();

	}
}
