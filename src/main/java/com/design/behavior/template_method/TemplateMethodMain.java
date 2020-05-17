package com.design.behavior.template_method;

import com.design.behavior.template_method.impl.OlderPhone;
import com.design.behavior.template_method.impl.SmartPhone;

/**
 * 模板方法的启动类
 */
public class TemplateMethodMain {

	public static void main(String[] args) {
		OlderPhone olderPhone = new OlderPhone();
		olderPhone.assembling();

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.assembling();
	}
}
