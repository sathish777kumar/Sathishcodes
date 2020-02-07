package collectionconcept;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setconcept {
	
	public static void main (String args[]) {
		
		Set <String> ant = new HashSet <String> ();
		
		ant.add("apple");
		ant.add("battle");
		ant.add("cattle");
		ant.add("cattle");
		ant.add("eattle");
		
		System.out.println(ant.size());
		
		for (String d: ant) {
			
			System.out.println(d);
		}
	}

}
