package week4.day2;

public class LoginPage extends BasePage {
	
		public void performCommonTasks() {
			System.out.println("Login has done successfully");
			
		
		
	}
		public static void main(String[] args) {
			LoginPage lp = new LoginPage();
			lp.clickElement();
			lp.enterText();
			lp.findElement();
			lp.performCommonTasks();
				
				
		}
	
	    
	}


