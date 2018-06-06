package com.jkx.designmodel.template;

public class StringDisplay extends AbstractDisplay
{  
	private String string;
	
	private int length;

	public StringDisplay(String string) {
		this.string = string;
		this.length = string.getBytes().length;
	}

	@Override
	public void open()
	{
		printLine();

	}

	@Override
	public void print()
	{
		System.out.println("|" + string + "|");

	}

	@Override
	public void close()
	{
		printLine();

	}
	
	//自定义打印行符号方法
	private void printLine() {
		for (int i = 0; i <= length + 1; i++)
		{
			System.out.print("+");
		}
		System.out.println();
	}

}
