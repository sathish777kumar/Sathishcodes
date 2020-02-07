package collectionconcept;

public class Arrayconcept {
	
	public static void main (String args[]) throws Exception {
		
		
		int a[] = new int [5];
		
		a[0]=5;
		a[1]=15;
		a[2]=25;
		a[3]=35;
		a[4]=45;
		
		System.out.println(a.length);
		
		for (int g: a){
			
						
			System.out.println(g);
		}
	}

}
