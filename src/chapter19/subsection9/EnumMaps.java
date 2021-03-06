package chapter19.subsection9;

import java.util.*;

import chapter19.subsection8.AlarmPoints;

import static chapter19.subsection8.AlarmPoints.*;


interface Command { void action(); }

public class EnumMaps {
	public static void main(String[] args) {
		EnumMap<AlarmPoints,Command> em =
				new EnumMap<AlarmPoints,Command>(AlarmPoints.class);
		em.put(KITCHEN, new Command() {
			public void action() { System.out.println("Kitchen fire!"); }
		});
		em.put(BATHROOM, new Command() {
			public void action() { System.out.println("Bathroom alert!"); }
		});
		for(Map.Entry<AlarmPoints,Command> e : em.entrySet()) {
			System.out.println(e.getKey() + ": ");
			e.getValue().action();
		}
		try { // If there's no value for a particular key:
			em.get(UTILITY).action();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}