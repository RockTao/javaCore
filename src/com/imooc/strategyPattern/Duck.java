package com.imooc.strategyPattern;

public abstract class Duck {
	
	/**
	 * 鸭子的叫声，通用行为，由超类实现
	 */
	public void quack() {
		
		System.out.println("嘎嘎嘎");
	}
	
	/**
	 * 显示鸭子的外观，
	 * 鸭子的外观各不相同，声明为abstract ，由子类实现
	 */
	public  abstract void display() ;
	
	

//--------------------------------
	private FlyingStragety flyingStragety;
	
	public void setFlyingStragety(FlyingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}
	public void fly() {
		flyingStragety.performFly();
	}
	
		
}
