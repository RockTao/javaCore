package chapter9.subsection3;

public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	public Waveform process(Waveform input) { return input; }
} ///:~cla