package com.imooc.strategyPattern;

import com.imooc.strategyPattern.Impl.FlyWithWin;

public class ReadHeadDuck extends Duck {

	public ReadHeadDuck() {
		super();
		super.setFlyingStragety(new FlyWithWin());

	}

	@Override
	public void display() {
		System.out.println("我的头是红色的啊 的");
	}
}
