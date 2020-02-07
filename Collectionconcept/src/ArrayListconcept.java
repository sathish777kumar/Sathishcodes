import java.util.ArrayList;


public class ArrayListconcept {
	
	public static void main (String args[]) throws Exception {
		
		ArrayList<Object> test = new ArrayList<Object>();
		
		test.add(123);
		test.add('g');
		test.add("trew");
		test.add(true);
		
		System.out.println(test.size());
		
		for (Object s: test){
			
			System.out.println(s);
		}
		
		
		
	}

}
