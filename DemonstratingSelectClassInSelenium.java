package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DemonstratingSelectClassInSelenium {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//click create new account
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		//enter first name
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Anuushya;");
		//enter surname
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Ramamoorthy");
		//enter mail id or ph num
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("anushyap1698@gmail.com");
		//enter new password
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[7]")).sendKeys("Chocolate*7");
		//select female
		driver.findElement(By.xpath("(//input[@id='sex'])[1]")).click();
		//dob
		WebElement dateDD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select =new Select(dateDD);
		select.selectByIndex(15);
		WebElement monthDD = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel=new Select(monthDD);
		sel.selectByContainsVisibleText("Oct");
		WebElement yearDD = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select sel2=new Select(yearDD);
        sel2.selectByValue("1998");
        //click sign up
        driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
        
		
		
		
		

	}

}
