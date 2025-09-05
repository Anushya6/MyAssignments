package week3.day1.assignment;

public class FindMissingNumbersOnArray {

	public static void main(String[] args) {
		
     
		int num1[]= {1,4,3,2,8,6,7};
		int sum1=0;
	
		for (int i = 0; i < num1.length; i++) {
			sum1=sum1+num1[i];
	
		}
		System.out.println("sum of elements="+sum1);
		int sum2=0;
		for (int i = 1; i <=8; i++) {
			sum2=sum2+i;
			
		}
		System.out.println("sum of range in array ="+sum2);
		System.out.println("missing element is:"+(sum2-sum1));
		
	}
	

}
