package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int num=100;
		int count=0;
		
		for (int i = 1; i <=num ; i++) {
			if (num%i==0) {
				
			}
			count++;
		}
		if (count==2) {
			System.out.println("It is a Prime number");
		} else {
            System.out.println("It is not a Prime number");
		}
	

	}

}
