package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInMyntra {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		//click on search bar and type bags
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("bags",Keys.ENTER);
		//clcik on men
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[1]")).click();
		Thread.sleep(2000);
		//laptop bag
		driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[3]")).click();
		//no of bag result
		 String text = driver.findElement(By.xpath("(//div[@class=' row-base'])[2]")).getText();
		 System.out.println(text);
		 //list of brand name
		 Thread.sleep(2000);
		 List<WebElement> brand = driver.findElements(By.xpath("(//h3[@class='product-brand'])"));
		 //list of bag name
		 Thread.sleep(2000);
		
		 List<WebElement> name = driver.findElements(By.xpath("(//h4[@class='product-product'])"));
		 
		 for (WebElement webElement : name) {
			 String text2 = webElement.getText();
			 System.out.println("Product Name :"+text2);
			
		}

		 for (WebElement webElement1 : brand) {
			 String text3 = webElement1.getText();
			 System.out.println("Brand Name :"+text3);
			
			 
			
		}
			
		}
		}
		 
		 
		 
		
		 
		 
		 
		 
		 
	

	



