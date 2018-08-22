package com.imooc.strategyPattern.Impl;

import com.imooc.strategyPattern.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("用火箭飞行--------****");
	}

}
