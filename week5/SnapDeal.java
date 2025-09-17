package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on men fashion
		driver.findElement(By.xpath("//span[@class='catText']")).click();
		//clcik on sports shoe
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		//count of sports shoe
		String count = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		System.out.println(count);
		//click on training shoe
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		//clcik pn sort by
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		//click on low to high
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		//sort price between 500-700
		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		from.clear();
		from.sendKeys("500",Keys.ENTER);
		WebElement to = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		to.clear();
		to.sendKeys("1000",Keys.ENTER);
		//click on go
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		//scroll down to cclor
		Thread.sleep(2000);

		WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.scrollToElement(color).perform();
		color.click();
		//mouse over on first result
		WebElement shoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(shoe).perform();
		//click on quickview
		driver.findElement(By.xpath("(//div[@supc='SDL537415017'])[2]")).click();
		//print price and discount
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Price: "+text);
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount:"+text2);
		
		
		

	}

}
