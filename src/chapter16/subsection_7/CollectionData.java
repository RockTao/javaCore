package chapter16.subsection_7;

import java.util.ArrayList;

import chapter16.subsection_6.Generator;

public class CollectionData<T> extends ArrayList<T> {
	  public CollectionData(Generator<T> gen, int quantity) {
	    for(int i = 0; i < quantity; i++)
	      add(gen.next());
	  }
	  // A generic convenience method:
	  public static <T> CollectionData<T>
	  list(Generator<T> gen, int quantity) {
	    return new CollectionData<T>(gen, quantity);
	  }
	} 