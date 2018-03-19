package com.jkx.designmodel.observer;

/**
 * 
 * 观察者
 * @author jkx
 *
 */
public interface Observer {
	
	/**
	 * 数字创造器
	 * 观察对象发生改变时，通过调用观察者update方法来更新操作
	 * @param numberGenerator
	 */
    public void update(NumberGenerator numberGenerator);
}
