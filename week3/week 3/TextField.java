package week3.day2.assignment;

public class TextField extends WebElement {
    
	public void getText() {
		
		System.out.println("Print the test");
	}
	
	public static void main(String[] args) {
		TextField tf = new TextField();
		tf.click();
		tf.setText();
		tf.getText();
		
		
	}
}
