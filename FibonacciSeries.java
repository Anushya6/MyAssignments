package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=8, firstNum=0, secondNum=1;
		int nextNum;
		for (int i = 1; i <=n; i++) {
			System.out.println(firstNum);
			nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
		}

	}

}
