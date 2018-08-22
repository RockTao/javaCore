package com.imooc.strategyPattern;


import com.imooc.strategyPattern.Impl.FlyNoWay;

/**
 * 新增橡胶鸭
 * @author root
 *
 */
public class RubberDuck  extends Duck{
	
	public  RubberDuck() {
		super();
		super.setFlyingStragety(new  FlyNoWay());
	}
	
	@Override
	public void display() {
		System.out.println("我是橡胶呀，不会飞行------");
	}
	
	public  void quack() {
		System.out.println("瑟瑟色额色色----");
	}

}
