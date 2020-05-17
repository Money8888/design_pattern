package com.design.behavior.visitor.visitimpl;

import com.design.behavior.visitor.Visitor;
import com.design.behavior.visitor.archiveimpl.PublicArchive;
import com.design.behavior.visitor.archiveimpl.SecretArchive;

/**
 * 总经理
 */
public class President implements Visitor {
	@Override
	public void visit(PublicArchive publicArchive) {
		System.out.println("所有公开档案");
	}

	@Override
	public void visit(SecretArchive secretArchive) {
		System.out.println("所有私密档案");
	}
}
