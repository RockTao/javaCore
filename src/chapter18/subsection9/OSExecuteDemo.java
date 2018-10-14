package chapter18.subsection9;

public class OSExecuteDemo {
	public static void main(String[] args) {
		OSExecute.command("/home/soft/eclipse/eclipseWorkSpace/Basic_JavaCore/src/chapter18/subsection9/javap OSExecuteDemo");
	}
} /* Output:
	Compiled from "OSExecuteDemo.java"
	public class OSExecuteDemo extends java.lang.Object{
	    public OSExecuteDemo();
	    public static void main(java.lang.String[]);
	}
*/