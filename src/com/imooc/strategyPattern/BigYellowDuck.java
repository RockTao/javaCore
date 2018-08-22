package com.imooc.strategyPattern;

import com.imooc.strategyPattern.Impl.FlyNoWay;

public class BigYellowDuck extends Duck {

	public BigYellowDuck() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我圣体很大，我是大黄鸭");
	}
	public  void quack() {
		System.out.println("----大黄鸭不会叫啊----");
	}

}
