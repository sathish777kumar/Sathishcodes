package Sorting;

public class Selectionsort {
	
	public static void main (String args[])throws Exception {
		
		int temp;
		
		int a[]={5,3,4,2,1};
		
		int min, minIndex;
		
		for (int i=0;i<a.length-1;i++) {
			
			min =a[i];
			
			minIndex=i;
		
		
		for (int j=i+1;j<a.length;j++){
			
			if (min>a[j]){
				
				min = a[j];
				
				minIndex=j;
			}
		}
			
			temp=a[i];
			
			a[i]=a[minIndex];
			
			a[minIndex]=temp;
			
			
		}
		
		for (int i=0;i<a.length;i++)
			
			System.out.println(a[i]);
			
	}

}
