package com.jkx.designmodel.iterator;

/**
 * 书
 * 
 * @author jkx
 *
 */
public class Book
{
	private String name;

	public Book(String name) {
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Book [name=" + name + "]";
	}

}
