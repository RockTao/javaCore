package chapter8.subsection3_2;


class Characteristic{
	private String s;
	 Characteristic(String s) {
		this.s = s ;
		System.out.println("Creating Characteristic " + s);
	}
	protected void dispose() {
		System.out.println("disposing Characteristic " + s);
	}
}


class Description{
	private String s;
	 Description(String s) {
		this.s = s ;
		System.out.println("Creating Description " + s);
	}
	protected void dispose() {
		System.out.println("disposing Description " + s);
	}
}


class LivingCreqture{
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Bse living  creature");
	
	 LivingCreqture() {
		System.out.println(" LivingCreqture " );
	}
	protected void dispose() {
		System.out.println("disposing LivingCreqture " );
		p.dispose();
		t.dispose();
	}
}

class Animal extends LivingCreqture{
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not vegetables");
	Animal() {
		System.out.println(" Animal " );

		}
	protected void dispose() {
		System.out.println("Animal LivingCreqture " );
		p.dispose();
		t.dispose();
		super.dispose();
	}

}



class Amphibian extends Animal{
	private Characteristic p = new Characteristic("can livi in water");
	private Description t = new Description("Both water and lander ");
	Amphibian() {
		System.out.println(" Amphibian " );

		}
	protected void dispose() {
		System.out.println("Amphibian dispose " );
		p.dispose();
		t.dispose();
		super.dispose();
	}

}
public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs ");
	public Frog() {System.out.println("FROG()");}
	protected void dispose() {
		System.out.println("Frog dispose " );
		p.dispose();
		t.dispose();
		super.dispose();
	}
	public static void main(String[] args) {
		Frog frog= new Frog();
		System.out.println("Bye");
		frog.dispose();
	}
	

}
