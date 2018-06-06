package com.jkx.designmodel.factory.framework;

/**
 * 工厂类
 * @author jkx
 *
 */
public abstract class Factory
{
    //对外提供创建产品方法
	public final Product create(String owner) {
		Product product = createProduct(owner);
		
		registerProduct(product);
		
		return product;
	}
	//创建产品
	public abstract Product createProduct(String owner);
	//注册产品
	public abstract void registerProduct(Product product );
}
