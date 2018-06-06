package com.jkx.designmodel.prototype.framework;

import java.util.HashMap;

/**
 * 使用Product接口完成复制功能
 * @author jkx
 *
 */
public class Manager
{  
   //注册的Product实现类 	
   private HashMap< String, Product> showcase = new HashMap<>();
   //注册
   public void register(String name, Product product) {
	   
	   showcase.put(name, product);
   }
   //创建克隆
   public Product create(String name) {
	   
	   Product product = showcase.get(name);
	   
	   return product.createClone();
   };
}
