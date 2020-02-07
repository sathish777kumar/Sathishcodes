package collectionconcept;

import java.util.LinkedList;
import java.util.List;

public class Listconcept {
	
	public static void main (String args[]) {
		
		List <String> ger = new LinkedList <String>();
		
		ger.add("Taj mahal");
		ger.add("Pyramid");
		ger.add("Eiffel tower");
	    ger.add("Empire State");
	    ger.add("Taj mahal");
	    
	    System.out.println(ger.size());
	    
	    for (String d: ger) {
	    	
	    	System.out.println(d
	    			);
	    }
}
}  