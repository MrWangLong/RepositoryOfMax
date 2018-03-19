package com.jkx.designmodel.observer;

/**
 * 
 * 观察者的实现：图形观察者
 * @author jkx
 *
 */
public class GraphObserver implements Observer {
    

	/**
	 * 观察对象发生变化，以图形形式打印观察对象的number属性
	 */
	@Override
	public void update(NumberGenerator numberGenerator) {
	 int number = numberGenerator.getNumber();
	 
	 for(int i = 0;i < number;i++){
		 System.out.print("#");
	 }
	 System.out.println();
	}



}
