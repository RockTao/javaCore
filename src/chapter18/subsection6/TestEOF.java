package chapter18.subsection6;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {
	public static void main(String[] args)
			throws IOException {
		DataInputStream in = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream("/home/soft/eclipse/eclipseWorkSpace/Basic_JavaCore/src/chapter18/subsection6/TestEOF.java")));
		while(in.available() != 0)
			System.out.print((char)in.readByte());
	}
}