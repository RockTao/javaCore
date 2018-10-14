package chapter18.subsection6;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

public class FormattedMemoryInput {
	public static void main(String[] args)
			throws IOException {
		try {
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read(
									"/home/soft/eclipse/eclipseWorkSpace/Basic_JavaCore/src/chapter18/subsection6/FormattedMemoryInput.java").getBytes()));
			while(true)
				System.out.print((char)in.readByte());
		} catch(EOFException e) {
			System.err.println("End of stream");
		}
	}
} 