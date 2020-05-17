package com.design.behavior.visitor.archiveimpl;

import com.design.behavior.visitor.Archive;
import com.design.behavior.visitor.Visitor;

/**
 * 私密档案
 */
public class SecretArchive implements Archive {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
