package com.design.create.singleton;

/**
 * 枚举式单例
 * 既能保证不被序列化、反射等破坏单例还能保证线程安全
 */
public enum  EnumInstance {
	INSTANCE;

	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public static EnumInstance getInstance(){
		return INSTANCE;
	}
}
