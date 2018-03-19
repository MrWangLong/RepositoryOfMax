package com.jkx.designmodel.observer;

/**
 * 
 * 观察者的实现：数字观察者
 * @author jkx
 *
 */
public class DigitObserver implements Observer {
    
	/**
	 * 观察对象发生变化，以数字形式打印观察对象的number属性
	 */
	@Override
	public void update(NumberGenerator numberGenerator) {
	
	 System.out.println(numberGenerator.getNumber());	
	}



}
