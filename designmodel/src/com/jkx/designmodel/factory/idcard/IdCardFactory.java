package com.jkx.designmodel.factory.idcard;

import java.util.ArrayList;
import java.util.List;

import com.jkx.designmodel.factory.framework.Factory;
import com.jkx.designmodel.factory.framework.Product;

/**
 * IdCard工厂类
 * @author jkx
 *
 */
public class IdCardFactory extends Factory
{
    //所有者们
	private List<String> owners = new ArrayList<>();
	
	@Override
	public Product createProduct(String owner)
	{
		 
		return new IdCard(owner);
	}

	@Override
	public void registerProduct(Product product)
	{
		
		owners.add(((IdCard)product).getOwner());  
	}
    
	//获取所有者们
	public List<String> getOwners()
	{
	
		return owners;
	}
}
