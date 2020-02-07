package pack3;

import java.util.HashSet;
import java.util.Set;

public class removalofduplicatesinstring {
	
	public static void main (String args[]) throws Exception {
		
		String input = "new version java version new java";
		
		String [] words = input.split(" ");
		
		Set<String> tesr = new HashSet<String>();
		
	for(String s : words){
			tesr.add(s);
		}
		
		//System.out.println(tesr.size());
		
		for (String qw : tesr) {
			
			System.out.println(qw);
		}
		
			/*
		for (int i=0; i<words.length;i++) {
			
			if (words[i]!=null) {
				
				for (int j=i+1; j<words.length;j++) {
					
					if(words[i].equals(words[j])) {
						
						words[j]=null;
					}
					
				}
			}
		}
					
					for (int k=0; k<words.length;k++) {
						
						if (words[k]!=null) {
							
							System.out.println(words[k]);
						}
					
				
			
		}
		*/
		
	}

}
