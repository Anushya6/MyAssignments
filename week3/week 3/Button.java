package week3.day2.assignment;

public class Button extends WebElement {
	public void submit() {
		System.out.println("click on submit button");
		
	
	}
   public static void main(String[] args) {
	   Button bu = new Button();
	   bu.click();
	   bu.setText();
	   bu.submit();
	   
	
}
}
