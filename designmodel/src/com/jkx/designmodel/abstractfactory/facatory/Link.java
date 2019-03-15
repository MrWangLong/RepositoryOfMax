package com.jkx.designmodel.abstractfactory.facatory;

/**
 * 
 * @author jkx
 *抽象的零件：Link类
 *
 */
public abstract class Link extends Item {

	protected String url;

	public Link(String caption, String url) {
		super(caption);

		this.url = url;
	}

}
