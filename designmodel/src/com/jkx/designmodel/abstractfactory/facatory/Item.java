package com.jkx.designmodel.abstractfactory.facatory;

/**
 * 
 * @author jkx
 *抽象的零件：Item类
 *
 */
public abstract class Item {
	protected String caption;

	public Item(String caption) {
		
		this.caption = caption;
	}

	public abstract String makeHTML();
}
