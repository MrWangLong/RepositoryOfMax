package com.jkx.designmodel.iterator;

public class BookShelfIterator implements Iterator
{
    //书架
	private BookShelf bookShelf;
	//当前遍历索引
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		
		this.bookShelf = bookShelf;
		index = 0;
	}

	@Override
	public boolean hasNext()
	{
		
		if(index < bookShelf.getLength()) {
			
			return true;
		}else {
			
			return false;
		} 
	}

	@Override
	public Object next()
	{
		Book book = bookShelf.getBookAt(index);
		index ++;
		return book;
	}

}
