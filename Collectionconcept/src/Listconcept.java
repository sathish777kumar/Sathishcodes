import java.util.LinkedList;
import java.util.List;


public class Listconcept {
	
public static void main (String args[]) throws Exception {
		
		
		
		List<String> desk = new LinkedList<String>();
		
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
