package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountDropDown {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver= new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmfsa link
		driver.findElement(By.partialLinkText("SFA")).click();
		//click on accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//click on create account
		driver.findElement(By.linkText("Create Account")).click();
		//enter account name
		driver.findElement(By.id("accountName")).sendKeys("Anushya");
		String text=driver.findElement(By.id("accountName")).getText();
		System.out.println("Account name:"+text);
		//enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//select industry
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select select=new Select(industryDD);
		select.selectByIndex(3);
		//select ownership
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select sel=new Select(ownershipDD);
		sel.selectByVisibleText("S-Corporation");
		//Select source
		WebElement sourceDD=driver.findElement(By.id("dataSourceId"));
		Select sel1=new Select(sourceDD);
		sel1.selectByValue("LEAD_EMPLOYEE");
		//select marketing campaign
		WebElement marketingCampaignDD=driver.findElement(By.id("marketingCampaignId"));
		Select sel2=new Select(marketingCampaignDD);
		sel2.selectByIndex(5);
		WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sel3=new Select(stateDD);
		sel3.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		

	}

}
