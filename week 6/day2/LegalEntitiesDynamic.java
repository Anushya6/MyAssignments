package testngPractise;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LegalEntitiesDynamic extends ChildClass {
	@Test(dataProvider="Excel")

	public void learn(String Name) {
	
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
	//click on leagl entity name
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(Name);
	//company name
	driver.findElement(By.xpath("//button[text()='Save']")).click();

}

@DataProvider(name="Excel")
	public String[][] data() throws IOException {
		String[][] dynamic = Integration.dynamic();
		return dynamic;
	}		
	
}


