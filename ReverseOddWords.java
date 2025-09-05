package week3.day1.assignment;

public class ReverseOddWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String[] split = test.split(" ");
		for (int i=0;i<split.length; i++) {
			if(i%2==0) {
				System.out.print(split[i]);
				
			}
			
		     char[] charArray = split[i].toCharArray();
			for (int  j = charArray.length-1; j>=0 ;j--) {
				if(i%2==1) {
				System.out.print(charArray[j]);
				
			
					
				}
		
			}
			System.out.print(" ");

		}
	}
}


	


