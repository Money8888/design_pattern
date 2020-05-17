package com.design.behavior.visitor;

import com.design.behavior.visitor.archiveimpl.PublicArchive;
import com.design.behavior.visitor.archiveimpl.SecretArchive;

/**
 * 访问者接口
 * 重载
 */
public interface Visitor {

	public void visit(PublicArchive publicArchive);
	public void visit(SecretArchive secretArchive);
}
