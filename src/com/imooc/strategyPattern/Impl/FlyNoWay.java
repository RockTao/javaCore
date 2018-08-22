package com.imooc.strategyPattern.Impl;

import com.imooc.strategyPattern.FlyingStragety;

public class FlyNoWay  implements FlyingStragety{

	@Override
	public void performFly() {
		System.out.println("我不会飞行---------");
	}

}
