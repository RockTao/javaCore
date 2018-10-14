package chapter18.subsection6;

import java.io.*;
import java.io.IOException;

public class BasicFileOutput {
	static String file = "BasicFileOutput.out";
	public static void main(String[] args)
			throws IOException {
		BufferedReader in = new BufferedReader(
				new StringReader(
						BufferedInputFile.read("/home/soft/eclipse/eclipseWorkSpace/Basic_JavaCore/src/chapter18/subsection6/BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null )
			out.println(lineCount++ + ": " + s);
		out.close();
		// Show the stored file:
		System.out.println(BufferedInputFile.read(file));
	}
}