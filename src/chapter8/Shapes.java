package chapter8;

import java.util.Random;

public class Shapes {

	private static  RndomShpeGenertor gen= new RndomShpeGenertor();
	public static void main(String[] args) {
		Shape[] s= new Shape[9];
		for(int i=0 ; i < s.length ; i++) 
			s[i] =gen.next();
		for(Shape shp : s)
			shp.draw();

	}
}
