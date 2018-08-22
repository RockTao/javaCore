package com.imooc.strategyPattern.Impl;

import com.imooc.strategyPattern.FlyingStragety;

public class FlyWithWin implements FlyingStragety {

	@Override
	public void performFly() {
		System.out.println("振翅高飞");
	}

}
