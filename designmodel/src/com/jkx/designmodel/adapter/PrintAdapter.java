package com.jkx.designmodel.adapter;

/**
 * 
 * 使用委托的适配器
 * 通过字段来调用这两个方法，这样形成了委托关系，当PrintAdapter类的printWeak、printStrong方法调用
 * 的时候，不是其本身进行处理，而是交给了其他实例(Banner类的实例)的showWithParen、showWithAster方法
 * @author jkx
 *
 */
public class PrintAdapter extends Print{
    
	private Banner banner;
     
	public PrintAdapter(String string) {

		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		
		banner.showWithParen();
	}

	@Override
	public void printStrong() {

		banner.showWithAster();
	}

}
