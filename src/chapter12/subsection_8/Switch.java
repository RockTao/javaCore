package chapter12.subsection_8;


public class Switch {
	private boolean state = false;
	public boolean read() { return state; }
	public void on() { state = true; System.out.println(this); }
	public void off() { state = false; System.out.println(this); }
	public String toString() { return state ? "on" : "off"; }
}