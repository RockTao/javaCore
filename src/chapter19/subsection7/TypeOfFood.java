package chapter19.subsection7;

import chapter19.subsection7.Food.Appetizer;
import chapter19.subsection7.Food.Coffee;
import chapter19.subsection7.Food.Dessert;
import chapter19.subsection7.Food.MainCourse;

public class TypeOfFood {
	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
		food = MainCourse.LASAGNE;
		food = Dessert.GELATO;
		food = Coffee.CAPPUCCINO;
	}
} 