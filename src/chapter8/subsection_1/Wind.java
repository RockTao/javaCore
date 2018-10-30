package chapter8.subsection_1;

public class Wind extends Instrument {
	// Redefine interface method:
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}