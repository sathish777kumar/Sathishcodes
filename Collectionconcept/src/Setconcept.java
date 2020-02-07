import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Setconcept {

	public static void main (String args[]) throws Exception {
		
		/* HashSet
		
		Set<String> desk = new HashSet<String>();
		
		desk.add("Red");
		desk.add("Blue");
		desk.add("Green");
		desk.add("Yellow");
		desk.add("Red");
		
		System.out.println(desk.size());
		
		for(String r: desk){
			
			System.out.println(r);
		}
	}
	
	*/
		
Set<String> desk = new TreeSet<String>();
		
		desk.add("Red");
		desk.add("Blue");
		desk.add("Green");
		desk.add("Yellow");
		desk.add("Red");
		
		System.out.println(desk.size());
		
		for(String r: desk){
			
			System.out.println(r);
		}
	}
	
	
	
}
