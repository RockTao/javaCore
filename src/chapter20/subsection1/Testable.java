package chapter20.subsection1;

import org.junit.Test;

public class Testable {
	public void execute() {
		System.out.println("Executing..");
	}
	@Test 
	void testExecute() { execute(); }
} 