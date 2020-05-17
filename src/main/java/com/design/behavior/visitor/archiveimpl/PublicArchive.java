package com.design.behavior.visitor.archiveimpl;

import com.design.behavior.visitor.Archive;
import com.design.behavior.visitor.Visitor;

/**
 * 公共开放档案
 */
public class PublicArchive implements Archive {
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
