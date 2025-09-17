package week5.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		
		   
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.bigbasket.com/");
				driver.manage().window().maximize();
				driver.navigate().refresh();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//clcik on shop by category
				driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']")).click();
				Thread.sleep(2000);
				//mouse over food grain
				WebElement grocery = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
				Actions act = new Actions(driver);
				act.moveToElement(grocery).perform();
				Thread.sleep(2000);
				//mouse over rice products
				WebElement rice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
				act.moveToElement(rice).perform();
				Thread.sleep(2000);
				//click on boiled steam rice
				driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
				//click on filter bb royal
				WebElement brand = driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
				act.scrollToElement(brand).perform();
				brand.click();
				Thread.sleep(2000);
				//scroll up to the page
				//click on tamil ponni boiled rice
				WebElement rice1 = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
				act.scrollToElement(rice1);
				rice1.click();
				//navigate to next window
				Set<String> childWindow = driver.getWindowHandles();
			    List<String>ListWindow=new ArrayList<String>(childWindow);
			    driver.switchTo().window(ListWindow.get(1));
			    //select 5 kg bag
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//span[text()='5 kg']")).click();
			    //price
			    String price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
			    System.out.println(price);
			    //click add to basket
			    driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
			    
	}

}
