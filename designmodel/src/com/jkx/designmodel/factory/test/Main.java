package com.jkx.designmodel.factory.test;

import com.jkx.designmodel.factory.framework.Factory;
import com.jkx.designmodel.factory.framework.Product;
import com.jkx.designmodel.factory.idcard.IdCardFactory;

public class Main
{
public static void main(String[] args)
{
	Factory factory = new IdCardFactory();
	Product card1 = factory.create("张三");
	Product card2 = factory.create("李四");
	Product card3 =factory.create("王五");
	card1.use();
	card2.use();
	card3.use();
}
}
