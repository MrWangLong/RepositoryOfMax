package com.jkx.designmodel.singleton;

/**
 * 
 * 单例模式：懒汉式
 * @author jkx
 *
 */
public class Singleton {
	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (singleton == null) {

			singleton = new Singleton();
		}

		return singleton;
	}

}
