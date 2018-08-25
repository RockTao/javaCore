	package com.imooc.proxyPattern;
public class  $Proxy0 implements com.imooc.proxyPattern.Moveable{
	public Proxy0(com.imooc.proxyPattern.Moveable m) {
			super();
		this.m = m;
		}
	private com.imooc.proxyPattern.Moveable m;
@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶了");
		m.move();
		long endTimer = System.currentTimeMillis();
	System.out.println("汽车行驶结束 。。。。。。汽车行驶时间"+ (endTimer- startTime) +"毫秒");
	}
}