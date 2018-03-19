package com.jkx.designmodel.adapter;

/**
 * 使用继承的适配器
 * 适配需求接口和实际处理类完成业务
 * 注意：我们将PrintBanner类的实例保存在Print类型的变量中，在Main类中，我们使用Print接口（即调用PrintWeak,PrintStrong方法来进行编程）
 * 就Main类而言，Banner类以及showWithParen、showWithAster、方法被完全隐藏起来了
 * 这就好像笔记本电脑只要12伏电压就能正常工作，但它并不知道这12伏的电压是由适配器将220伏电压转换而来的
 * @author jkx
 *
 */
public class PrintBanner extends Banner implements IPrint {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
