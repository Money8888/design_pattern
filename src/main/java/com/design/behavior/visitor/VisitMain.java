package com.design.behavior.visitor;

import com.design.behavior.visitor.archiveimpl.PublicArchive;
import com.design.behavior.visitor.archiveimpl.SecretArchive;
import com.design.behavior.visitor.visitimpl.DepartManager;
import com.design.behavior.visitor.visitimpl.President;

/**
 * 访问者模式启动类
 */
public class VisitMain {

	public static void main(String[] args) {
		Company company = new Company();
		company.add(new SecretArchive());
		company.add(new PublicArchive());

		company.accept(new DepartManager());
		company.accept(new President());
	}

}
