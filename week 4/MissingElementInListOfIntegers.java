package week4.day1;

import java.util.HashSet;
import java.util.Set;

public class MissingElementInListOfIntegers {

	public static void main(String[] args) {
		
		int[] num= {1, 2, 3, 4, 10, 6, 8};
		Set<Integer>set=new HashSet<Integer>();
		Set<Integer>set2=new HashSet<Integer>();
		
		for (int n : num) {
			set.add(n);
			for (int i = 1; i <=10; i++) {
				set2.add(i);	
				if (set.contains(i)) {
					set2.remove(i);
					
					
					
				}
			
			}
			
			
			
		}
		for (Integer integer : set2) {
			System.out.print(integer+" ");
			
		}
 
		}
	
	
		
		
	

		
						
				
			
		

	}


	

