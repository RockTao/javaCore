package com.imooc.proxyPattern;


public class Client {
	
	public static void main(String[] args) throws Exception {
		
//		Car car =new Car();
//		car.move();
		//使用及集成方式
//		Moveable moveable= new Car2();
//		moveable.move();
//		
//		//使用聚合方式实现
//		Car  car= new Car();
//		Moveable m= new CarTimeProxy(car);
//		m.move();
		
//		
//		Car car = new Car();
//		CarTimeProxy ctp= new CarTimeProxy(car);
//		CarLogProxy clp = new CarLogProxy(ctp);
//		clp.move();
		Proxy.newProxyInstance(Moveable.class);
	}

}
