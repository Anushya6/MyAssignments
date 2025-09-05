package week3.day2.assignment;

public class CheckBoxButton extends Button {
	
	public void clickCheckButton() {
		
		System.out.println("click on the check button");
	}
public static void main(String[] args) {
	
	CheckBoxButton cb = new CheckBoxButton();
	cb.click();
	cb.setText();
	cb.submit();
	cb.clickCheckButton();
	
}
}
