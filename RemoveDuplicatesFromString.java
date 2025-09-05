package week3.day1.assignment;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String text = "We learn java as a part of java sessions in java week1";
		text = text.toLowerCase();
		String[] split = text.split(" ");
		System.out.print(text);
		System.out.println(" ");
		
	    int count=0;
		for (int i = 0; i < split.length; i++) {
			for (int j = i+1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					split[j]=" ";
					count++;
						
				}
				
				
			}
			
			
				
			
				}
		
				/*
				 * for (int i = 0; i < split.length; i++) { System.out.print(split[i]+" ");
				 * 
				 * 
				 * } System.out.println();
				 */
		if (count>0) {
			System.out.println("duplicate has been removed from text: "+count);
			System.out.println(String.join(" ", split));
			System.out.println(count);
		}else {
			System.out.println("no duplicates found");
		}
		     
			}
		
	}
	
		
	


          