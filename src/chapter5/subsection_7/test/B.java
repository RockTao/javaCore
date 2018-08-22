package chapter5.subsection_7.test;


class B extends A {
	public B() {
		System.out.println("Constructor B.");
	}

	{
		System.out.println("非静态代码块  Instance Block B.");
	}
	static {
		System.out.println("静态代码块Static Block B.");
	}

	public static void main(String[] args) {
//		new A();
		/*
		 * Static Block A. Static Block B. Instance Block A. Constructor A.
		 */
		System.out.println();
		new B();/*
		 * Instance Block A. Constructor A. Instance Block B. Constructor B.
		 */// 静态成员和静态初始化块只会执行一次。
	}
}