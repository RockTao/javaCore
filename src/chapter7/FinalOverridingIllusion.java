package chapter7;
/**
 * page 144
 * @author root
 *
 */
class  withFinals{
	private final void f() {
		System.out.println("withFinals.f()");
	}
	private void g() {
		System.out.print("withFinals.g()");
	}
}
class OverridingPrivate extends withFinals{
	
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	private void g() {
		System.out.print("OverridingPrivate.g()");
	}
}
class OverridingPrivate2 extends OverridingPrivate{
	
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	public void g() {
		System.out.print("OverridingPrivate2.g()");
	}
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
    	OverridingPrivate2 op2= new OverridingPrivate2();
    	op2.f();
    	op2.g();
    	
    	
    	
    }

}
