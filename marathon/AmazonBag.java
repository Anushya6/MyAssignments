package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBag {
	public static void main(String[] args) throws InterruptedException {
		 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys",Keys.ENTER);
		//tot no of results
		Thread.sleep(2000);
		String result = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
		System.out.println(result);
		//select first 2 brands
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		//choose new arrivals in sort
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[2]")).click();
		driver.findElement(By.xpath("(//li[@class='a-dropdown-item a-declarative'])[5]")).click();
		//print frst result bag info
		
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']")).getText();
		String text2 = driver.findElement(By.xpath("//span[text()='3,140']")).getText();
		System.out.println(text);
		System.out.println(text2);
		//page titl
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
