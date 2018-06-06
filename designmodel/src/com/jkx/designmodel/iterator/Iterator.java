package com.jkx.designmodel.iterator;

/**
 * 迭代器接口
 * @author jkx
 *
 */
public interface Iterator
{  
   //是否还有下一个元素	
   public  abstract boolean hasNext();
   //返回下一个元素
   public abstract Object next();
}
