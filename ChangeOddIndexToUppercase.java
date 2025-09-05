package week3.day1.assignment;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] value = test.toCharArray();
		for (int i = 0; i < value.length; i++) {
			if (i%2==1) {
				value[i]=Character.toUpperCase(value[i]);
				
			}
			System.out.print(value[i]);
				
			}
		
			
		}
		

	}

