package collectionconcept;

import java.util.ArrayList;

public class Arraylistconcept {
	
	public static void main (String args[])throws Exception {
		
		ArrayList<Object> man = new ArrayList <Object>();
		
		man.add("nice");
		man.add(77);
		man.add('e');
		man.add(false);
		
		System.out.println(man.size());
		
		for (Object h: man) {
			
			System.out.println(h);
		}
	}

}
