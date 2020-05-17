package com.design.structure.composite.impl;

import com.design.structure.composite.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类
 */
public class Folder extends Component {

	private List<Component> componentList = new ArrayList<>();

	// 子类构造方法
	public Folder(String name) {
		super(name);
	}

	// 添加文件
	@Override
	public void add(Component component) {
		componentList.add(component);
	}

	// 移除文件
	@Override
	public void remove(Component component) {
		componentList.remove(component);
	}

	// 输出文件名
	@Override
	public void print() {
		// 子类对象的get方法
		System.out.println(getName());
		componentList.forEach(x -> System.out.println("    " + x.getName()));
	}
}
