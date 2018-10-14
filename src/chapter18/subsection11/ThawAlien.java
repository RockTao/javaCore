package chapter18.subsection11;

import java.io.*;

public class ThawAlien {
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(new File("/home/soft/eclipse/eclipseWorkSpace/Basic_JavaCore/", "X.file")));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass());
	}
} 	