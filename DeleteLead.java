package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
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
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//click on phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//enter ph num
		driver.findElement(By.name("phoneNumber")).sendKeys("8870977955");
		//click find lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//capture lead idc
		WebElement firstresult = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		 String text = firstresult.getText();
		//click delete button
		System.out.println(text);
	    firstresult.click();
	    
		driver.findElement(By.linkText("Delete")).click();
		//click find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//enter id
		driver.findElement(By.name("id")).sendKeys(text);

		//click find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String text2 = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text2);
		driver.close();
		

	
	
		 
		
	}

}
