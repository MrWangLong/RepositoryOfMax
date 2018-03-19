package com.jkx.designmodel.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * 数字创造器
 * 注册观察者
 * 成员变量number发生变化，通知所有注册在内的观察者
 * @author jkx
 *
 */
public abstract class NumberGenerator {
	/**
	 * 注册在内的观察者集合
	 */
   private List<Observer> observers = new ArrayList<>();
   
   /**
    * 注册观察者
    * @param observer：观察者
    */
   public void addObserver(Observer observer){
	   
	   observers.add(observer);
   }
   
   /**
    * 取关观察者
    * @param observer：观察者
    */
   public void deleteObserver(Observer observer){
	   
	   observers.remove(observer);
   }
   
   /**
    * 获取成员变量number
    * @return
    */
   public abstract int getNumber();
   
   /**
    * 执行方法
    */
   public abstract void excute();
   
   /**
    * 通知所有已经注册的观察者
    */
   public void notifyObservers(){
	   Iterator<Observer> iterator = observers.iterator();
	   
	   while (iterator.hasNext()) {
		Observer observer = (Observer) iterator.next();
		
		observer.update(this);
	}
   }
}
