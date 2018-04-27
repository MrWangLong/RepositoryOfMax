package com.jkx.designmodel.template;

/**
 * Templat 模板设计模式
 * @author jkx
 *
 */
public abstract class AbstractDisplay
{
 //打开	
 public abstract void open();
 //打印
 public abstract void print();
 //关闭
 public abstract void close();
 //展示
 public void display() {
	//调用打开 
	open();
	//调用打印 
	print();
	//调用关闭 
	close();
 }
}
