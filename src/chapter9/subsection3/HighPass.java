package chapter9.subsection3;

public class HighPass extends Filter {
	  double cutoff;
	  public HighPass(double cutoff) { this.cutoff = cutoff; }
	  public Waveform process(Waveform input) { return input; }
	} ///:~