package com.jkx.designmodel.iterator;

public class Main
{
	public static void main(String[] args)
	{
	  //书架	
	  BookShelf bookShelf = new BookShelf(3);
	  //书
	  Book book1 = new Book("《厚黑学》"); 
	  Book book2 = new Book("《大话设计模式》"); 
	  Book book3 = new Book("《深入java虚拟机》");
	  //将书放入书架
	  bookShelf.appendBook(book1);
	  bookShelf.appendBook(book2);
	  bookShelf.appendBook(book3);
	  //获取其自身提供的迭代器
	  Iterator iterator = bookShelf.iterator();
	  //遍历迭代
	  while (iterator.hasNext())
	{
		System.out.println(iterator.next());
		
	}  
    
	}
}
