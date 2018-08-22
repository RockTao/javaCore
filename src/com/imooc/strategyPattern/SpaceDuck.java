package com.imooc.strategyPattern;

import com.imooc.strategyPattern.Impl.FlyWithRocket;

public class SpaceDuck extends Duck {

	public SpaceDuck() {
		super();
		super.setFlyingStragety(new FlyWithRocket());
	}

	@Override
	public void display() {
		System.out.println("太空呀鸭子啊～～～～～～～～～～～～～～～");
	}
	
	public  void quack() {
		System.out.println("----太空鸭子呼叫地球---");
	}

}
