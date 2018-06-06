package com.jkx.designmodel.observer;

import java.util.Random;

/**
 * 数字创造器的实现
 * @author jkx
 *
 */
public class RandomNumberGenerator extends NumberGenerator {
    
	
	private Random random = new Random();
	
	/**
	 * 监控的成员变量
	 */
	private int number;
	
	
	@Override
	public int getNumber() {
		
		return number;
	}

	@Override
	public void excute() {
        for(int i = 0;i < 5;i++){
        	number = random.nextInt(50);
        	
        	notifyObservers();
        }
		 
	}
	
	
}
