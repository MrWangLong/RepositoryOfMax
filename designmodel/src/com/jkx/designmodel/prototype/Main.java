package com.jkx.designmodel.prototype;


import com.jkx.designmodel.prototype.framework.Manager;
import com.jkx.designmodel.prototype.framework.Product;

public class Main
{
  public static void main(String[] args)
{
	//准备
	Manager manager = new Manager();
	UnderlinePen upen = new UnderlinePen('~');
	MessageBox mbox = new MessageBox('*');
	MessageBox sbox = new MessageBox('/');
	manager.register("strong message", upen);
	manager.register("warning message", mbox);
	manager.register("slash message", sbox);
	//复制  
	Product p1 = manager.create("strong message");
	p1.use("More Stronger");
	Product p2 = manager.create("warning message");
	p2.use("More Warning");
	Product p3 = manager.create("slash message");
	p3.use("Slash Teenager");
}
}
