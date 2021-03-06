package com.jkx.designmodel.prototype;

import com.jkx.designmodel.prototype.framework.Product;

public class UnderlinePen implements Product
{
    //装饰的符号
	private char ulchar;
	
	
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}

	@Override
	public void use(String str)
	{
		int length = str.getBytes().length;
		System.out.println("\"" + str + "\"");
		System.out.print(" ");
		for (int i = 0; i < length; i++)
		{
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone()
	{
	Product product = null;
	try
	{
		product = (Product) clone();
	} catch (CloneNotSupportedException e)
	{
		e.printStackTrace();
	}
		return product;
	}

}
