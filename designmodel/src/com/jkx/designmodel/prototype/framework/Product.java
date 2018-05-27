package com.jkx.designmodel.prototype.framework;

/**
 * 提供复制功能的接口
 * @author jkx
 *
 */
public interface Product extends Cloneable
{ 
  	
  public abstract void use(String str);
  
  //创建克隆
  public abstract Product createClone();
}
