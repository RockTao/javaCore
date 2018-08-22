package com.imooc.singleModel;


/**
 * 懒汉模式
 * 区别:恶汉模式的特点是加载类时比较慢，当运行是获取实例比较块   线程安全的
 * 
 * 		懒汉模式在加载类时比较块，但运行是获取对象的速度比较慢   线程不安全的
 * 	
 * @author root
 *
 */
public class Singleton_2 
{
	
	//1.将构造方法私有化，不容许外部直接创建对象实例
	private  Singleton_2() {
		
	}
	//2 、创建类的唯一实例   使用private static 修饰
	private static Singleton_2 instance;
	
	//3、提供一个用于获取实例的方法，使用public static 修饰
	public static Singleton_2 getInstance() {
		if(instance == null)
		{
			instance = new Singleton_2();
		}
		return instance;
		
	}
	

}
