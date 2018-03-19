package com.jkx.designmodel.adapter;

public class Main {
   public static void main(String[] args) {
	IPrint print = new PrintBanner("Adapter");
	print.printWeak();
	print.printStrong();
	System.out.println("----------------------------------------------");
	Print print2 = new PrintAdapter("Banner");
	print2.printWeak();
	print2.printStrong();
}
}
