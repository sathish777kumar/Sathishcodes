package Sorting;

public class Bubblesort {
	
		static int a[] = {1,3,4,5,2};
		
		static int b[] = {2,4,3,1,5};
		
		static int i;
		
		public static void bubble (int[] c) throws Exception {
			
			boolean sorted = true;
			
			while (sorted){
				
				sorted = false;	
			
			for (int i=0;i<c.length-1;i++) {
				
				if (c[i]>c[i+1]) {
					
					int temp;
											
						
					temp = c[i];
					
					c[i]=c[i+1];
					
					c[i+1]=temp;
					
					sorted=true;
					
				}			
					
					
					}
			}
		}

		public static void main (String args[]) throws Exception {
			
			bubble(a);
			
			for (i=0;i<a.length;i++)
			
			System.out.println(a[i]);

}
}
