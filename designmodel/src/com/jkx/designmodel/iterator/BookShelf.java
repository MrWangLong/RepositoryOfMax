package com.jkx.designmodel.iterator;

import java.util.Arrays;

/**
 * 书架
 * 
 * @author jkx
 *
 */
public class BookShelf
{
	// 书架上的书
	private Book[] books;
	// 书的索引
	private int last = 0;

	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
    //获取指定位置的书
	public Book getBookAt(int index) {
		
		return this.books[index];
	}
	//放书到书架上
	public void appendBook(Book book) {
		
		this.books[last] = book;
		last++;
	}
	//获取书的总数量
	public int getLength() {
		
		return last;
	}
	//书迭代
	public Iterator iterator() {
		
		return new BookShelfIterator(this);
	}
	@Override
	public String toString()
	{
		return "BookShelf [books=" + Arrays.toString(books) + ", last=" + last + "]";
	}
	
	
}
