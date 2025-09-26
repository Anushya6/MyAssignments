package testngPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Salesforce extends BasicClass  {
	
	@Test

	public  void Learn() throws InterruptedException {
//		driver.findElement(By.xpath("//a[text()='Remind Me Later']")).click();

        driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		//click on view all
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		//click on legal entities
		WebElement legalEntities = driver.findElement(By.xpath("//p[contains(text(),'Legal Entities')]"));
		Actions act = new Actions(driver);
		act.scrollToElement(legalEntities).perform();
		legalEntities.click();
		//click on new legal entities
		driver.findElement(By.xpath("//div[@title='New']")).click();
		//enter company name
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		///description
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("Salesforce");
		//select active
		driver.findElement(By.xpath("//span[@part='input-button-value']")).click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		//click save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		//print the alert msg
		String text = driver.findElement(By.xpath("//div[@data-name='Name']")).getText();
		System.out.println(text);
	}
    
  
}

