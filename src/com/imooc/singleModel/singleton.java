package com.imooc.singleModel;


/**
 * 单例模式
 * 应用场合:y有些对象只要有一个就够了，
 * 作用:保证这个应用程序中有且只有一个
 * 类型  恶汉模式  懒汉模式
 * @author root
 *
 */
/**
 * 恶汉模式   
 * @author root
 *
 */
public class singleton {
	//1.将构造方法私有化，不容许外部直接创建对象实例
	private singleton() {	}
	
	//2 、创建类的唯一实例   使用private static 修饰
	static  singleton instance = new singleton();
	//3、 t提供一个用于获取实例的方法
	public static singleton getInstance() {
		return instance;
	}
	
	
}
