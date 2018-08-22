package com.imooc.strategyPattern;

public class DuckTest {

	public static void main(String[] args) {
		System.out.println("------测试鸭子的程序");
		Duck duck=null;
//		duck= new MallardDuck();
//		 duck= new ReadHeadDuck();
//		duck= new	 RubberDuck();
//		duck = new BigYellowDuck();
		 duck = new SpaceDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("----------测试完毕");
	}

}
