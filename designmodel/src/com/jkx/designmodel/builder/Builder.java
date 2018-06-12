package com.jkx.designmodel.builder;

/**
 * Builder抽象类
 * 
 * @author jkx
 *
 */
public abstract class Builder {
	// 填写标题
	public abstract void makeTitle(String title);
	// 编写内容
	public abstract void makeContent(String content);
	// 编写条目项目
	public abstract void makeItems(String[] items);
	// 关闭
	public abstract void close();
}
