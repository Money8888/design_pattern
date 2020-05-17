package com.design.behavior.mediator;

/**
 * 中介者抽象类
 *
 */
public abstract class Mediator {

	public abstract void register(Person person);

	public abstract void send(String from, String message);
}
