package com.imooc.proxyPattern.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class TimerHandler implements InvocationHandler {
	public TimerHandler(Object target) {
		super();
		this.target = target;
	}
	private Object target;

	/*参数  proxy  被代理对象
	 *   method  被代理对象的方法
	 *   args   方法的参数
	 *   
	 *   返回值是 object方法的返回值
	 * (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶了");

		method.invoke(target);
		long endTimer = System.currentTimeMillis();
		System.out.println("汽车行驶结束 。。。。。。汽车行驶时间"+ (endTimer- startTime) +"毫秒");

		return null;
	}


	

}
