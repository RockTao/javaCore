package chapter5.subsection_7.test;

class A {
    public A() {
        System.out.println("基类构造函数Constructor A.");
    }

    {
        System.out.println("基类非静态代码块Instance Block A.");
    }
    static {
        System.out.println("基类静态代码块Static Block A.");
    }

    public static void main(String[] args) {
        new A();            
    }
}