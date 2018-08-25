package com.imooc.proxyPattern.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.imooc.proxyPattern.Car;
import com.imooc.proxyPattern.Moveable;

public class Test {
	/**
	 * JDK动态代理测试类
	 * @param args
	 */
	public static void main(String[] args) {
		Car  car = new Car();
		InvocationHandler h =new TimerHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader 类加载器
		 * interfaces 接口
		 * h invocationHandle 
		 * 
		 * 
		 * 动态代理实现思路
		 * 实现功能: 通过Proxy 的newProxyInstance返回代理对象
		 * 1/ 声明一段远吗(动态代理产生)
		 * 2/ 编译源码  (JDKCompiler api),产生新的类(代理类)
		 * 3 / 将这个类load到内存当中,产生一个新的对象(代理对象)
		 * 4 return 代理对象
		 */
		Moveable mm = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), 
				cls.getInterfaces(), h);

		System.out.println("代理类的名字 "+mm.getClass().getName());
		mm.move();

	}

}
