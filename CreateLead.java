package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
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
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anushya");
		//enter last name
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Periyasamy");
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("byjus");
		//click create lead
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

		driver.close();
	}

}
