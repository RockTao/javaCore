package chapter4;


/**
 * Java初始化顺序（静态变量、静态初始化块、实例变量、实例初始化块、构造方法）
 * @author root
 *
 */
/**
 * 1.1、一个类中的初始化顺序
类内容（静态变量、静态初始化块） => 实例内容（变量、初始化块、构造器）
 * @author root
 * 1.2、两个具有继承关系类的初始化顺序
父类的（静态变量、静态初始化块）=> 子类的（静态变量、静态初始化块）=> 父类的（变量、初始化块、构造器）=> 子类的（变量、初始化块、构造器）
 *
 */
public class test1 {
	
	
	  public test1() {
	        System.out.println("Constructor test1.");
	    }

	    {
	        System.out.println("Instance Block test1.");
	    }
	    static {
	        System.out.println("Static Block  test1.");
	    }

	    public static void main(String[] args) {
	        new test1();/*
	                 * Static Block A. Instance Block A. Constructor A.
	                 */
	    }

}


class B extends test1{
    public B() {
        System.out.println("Constructor B.");
    }

    {
        System.out.println("Instance Block B.");
    }
    static {
        System.out.println("Static Block B.");
    }

    public static void main(String[] args) {
        new test1	();
        /*
                 * Static Block A. Static Block B. Instance Block A. Constructor A.
                 */
        System.out.println();
        new B();/*
                 * Instance Block A. Constructor A. Instance Block B. Constructor B.
                 */// 静态成员和静态初始化块只会执行一次。
    }
}

