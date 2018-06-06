package com.jkx.designmodel.template;

public class Main
{
 public static void main(String[] args)
{
	//多态获取具体实例  
	AbstractDisplay charDisplay = new CharDisplay('s');
	AbstractDisplay stringDisplay = new StringDisplay("Linux");
	//调用各自的展示方法
	charDisplay.display();
	stringDisplay.display();
}
}
