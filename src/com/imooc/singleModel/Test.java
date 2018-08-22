package com.imooc.singleModel;

public class Test {

	
	public static void main(String[] args) {
		
		
//		恶汉模式
			singleton s1= singleton.getInstance();
			singleton s2 = singleton.getInstance();
			System.out.println(s1.equals(s2));
			if(s1 == s2)
			{
				System.out.println("s1 和s2 是一个实例");
			}
			else
			{
				System.out.println("s1 和s2 不是一个实例-------");
			}
			
			
			//2、懒汉模式
			Singleton_2 s3 = Singleton_2.getInstance();
			Singleton_2 s4= Singleton_2.getInstance();
			if(s3 == s4)
			{
				System.out.println("s3 和s4是一个实例");
			}
			else
			{
				System.out.println("s3 和s4 不是一个实例-------");
			}
			
			

	}
}
