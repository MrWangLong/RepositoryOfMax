package com.jkx.designmodel.observer;

public class Main {
 public static void main(String[] args) {
	//实例化观察对象对象
	NumberGenerator generator = new RandomNumberGenerator();
	//实例化数字观察者对象
	Observer digitObserver = new DigitObserver();
	//实例化图形观察者对象
	Observer graphObserver = new GraphObserver();
	//在观察对象中注册数字观察者
	generator.addObserver(digitObserver);
	//在观察对象中注册图形观察者
	generator.addObserver(graphObserver);
	//在观察对象执行方法
	generator.excute();
}
}
