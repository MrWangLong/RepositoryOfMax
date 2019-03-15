package com.jkx.designmodel.abstractfactory.facatory;

/**
 * 
 * 抽象工厂类
 * @author jkx
 *
 */
public abstract class Factory {

	public static Factory getFactory(String className) {
		Factory factory = null;

		try {
			factory = (Factory) Class.forName(className).newInstance();
		} catch (ClassNotFoundException e) {
			System.err.println("没有找到 " + className + " 类。");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return factory;
	};

	public abstract Link createLink(String caption, String url);

	public abstract Tray createTray(String caption);

	public abstract Page createPage(String title, String author);
}
