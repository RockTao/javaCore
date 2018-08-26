package chapter7.subsection_9;

/**
 * 继承和类的初始化
 * @author root
 * date: Aug 26, 2018 10:16:03 AM.<br/>
 */
class Insect{
	private int i=9;
	protected int j;
	public Insect() {

		System.out.println("i = "+ i+ " j ="+ j);
		j = 39;
	}
	private static  int x2 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}

public class Beetle extends Insect {
	private int  k =printInit("Beetle.k  initalized ");
	public Beetle() {
		System.out.println("k= "+ k);
		System.out.println("j= "+ j);

	}
	private static  int x2 = printInit("static Beetle.x2 initialized");
	public static void main(String[] args) {
		System.out.println("Beetle  constructor");
		Beetle  beetle = new Beetle();
	}

}
