package com.jkx.designmodel.abstractfactory.facatory;

import java.util.ArrayList;

/**
 * 
 * @author jkx
 *抽象的零件：Tray
 *
 */
public abstract class Tray extends Item {
	
	protected ArrayList<Item> tray = new ArrayList<>();

	public Tray(String caption) {
		super(caption);
		
	}
	
	public void add(Item item){
		
		tray.add(item);
	}
  

}
