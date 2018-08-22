package chapter9.subsection4;


interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
class ActionCharacter{
	public void fight() {}
}
class Hreo extends ActionCharacter implements CanFight,CanFly,CanSwim{
	public void swim() {}
	public void fly() {
		
	}
}
public class Adventure {
	public static void  t(CanFight x) {x.fight(); }
	public static void  u(CanSwim x) {x.swim(); }
	public static void  v(CanFly x) {x.fly();}
	public static void  w(ActionCharacter x) {x.fight(); }

	
	public static void main(String[] args) {
		Hreo hreo = new Hreo();
		t(hreo);
		u(hreo);
		v(hreo);
		w(hreo);
		
	}

}
