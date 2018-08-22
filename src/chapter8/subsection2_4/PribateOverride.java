package chapter8.subsection2_4;

public class PribateOverride {
	private void f() {
		System.out.println("private f()");
	}

	public static void main(String[] args) {
		PribateOverride po= new  Derived();
		po.f();
	}

}
