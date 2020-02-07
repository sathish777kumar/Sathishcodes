package Sorting;

public class Insertionsort {
	
	public static void main (String args[]) throws Exception {
		
		int a[] = {5,4,3,2,1};
		
		int temp;
		
			
		for (int i=0;i<a.length-1;i++){
			
			if (a[i]>a[i+1]) {
				
				temp = a[i];
				a[i] = a[i+1];
			a[i+1] = temp;
						
			}
			
			
			
		}
	}

}
