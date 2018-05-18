package com.jkx.designmodel.factory.idcard;

import com.jkx.designmodel.factory.framework.Product;

/**
 * IdCard类
 * @author jkx
 *
 */
public class IdCard extends Product
{
    //所有者
	private String owner;
	
	
	
	public IdCard(String owner) {
		System.out.println("正在制作" + owner + "的Id卡...");
		
		
		this.owner = owner;
	}

	@Override
	public void use()
	{
		
		System.out.println("正在使用" + owner + "的Id卡...");
	}

	//获取所有者
	public String getOwner()
	{
		
		return owner;
	}
}
