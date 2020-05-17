package com.design.behavior.mediator.impl;

import com.design.behavior.mediator.Mediator;
import com.design.behavior.mediator.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者的子类
 * 具体的房屋中介
 * 将卖方的出售消息广播给所有人
 */
public class HouseMediator extends Mediator {

	private List<Person> personList = new ArrayList<>();

	@Override
	public void register(Person person) {
		if(!personList.contains(person)){
			personList.add(person);
			person.setMediator(this);
		}
	}

	@Override
	public void send(String from, String message) {
		System.out.println(from + "发送消息: " + message);
		for (Person person : personList) {
			String name = person.getName();
			// 如果用户不是发消息的人
			if(!name.equals(from)){
				// 所有用户接受消息
				person.receive(message);
			}
		}
	}
}
