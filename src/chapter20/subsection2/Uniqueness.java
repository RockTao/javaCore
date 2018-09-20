package chapter20.subsection2;

public @interface Uniqueness {
	Constraints constraints()
	default @Constraints(unique=true);
}