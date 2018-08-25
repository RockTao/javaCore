package com.imooc.proxyPattern.cglib;

public class Client {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		Train train=(Train) proxy.getProxy(Train.class);
		train.move();
	}

}
