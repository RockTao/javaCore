package chapter18.subsection6;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
	public static void main(String[] args)
			throws IOException {
		StringReader in = new StringReader(
				BufferedInputFile.read("/home/soft/eclipse/eclipseWorkSpace/Basic_JavaCore/src/chapter18/subsection6/MemoryInput.java"));
		int c;
		while((c = in.read()) != -1)
			System.out.print((char)c);
	}
} 