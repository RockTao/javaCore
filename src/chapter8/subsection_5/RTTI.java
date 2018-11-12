package chapter8.subsection5;

class Usefur{
	public void f() {}
	public void g() {}
}

class MoreUseful extends Usefur {
	public void f() {}
	public void g() {}
	public void v() {}
	public void u() {}
	public void w() {}
}
public class RTTI {

	public static void main(String[] args) {
		Usefur[] x = {
				new  Usefur(),
				new MoreUseful()
		};
		x[0].f();
		x[1].g();
	}

}
