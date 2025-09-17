package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClassAmazon {

	public static void main(String[] args) {
	    
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//click on continue shopping
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();

	 //search for oneplus 9 pro
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro",Keys.ENTER);
	//price of first one
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(text);
	//print the rating 	
		String rating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println(rating);
	//click on first text link
		driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")).click();
	//switch to next window
		Set<String> childWindow = driver.getWindowHandles();
	    List<String>ListWindow=new ArrayList<String>(childWindow);
	    driver.switchTo().window(ListWindow.get(1));
	//click on add to cart
	    driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	//sub total
	    String text2 = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	    System.out.println(text2);
	    

		
		
		

	}

}
