package week3.day2.assignment2;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Enter your username");
	}
    public void enterPassword() {
    	System.out.println("Enter your Password");
    }
    public static void main(String[] args) {
    	LoginTestData lt = new LoginTestData();
    	lt.enterCredentials();
    	lt.enterPassword();
    	lt.enterUsername();
    	lt.navigateToHomePage();
		
	}
}

