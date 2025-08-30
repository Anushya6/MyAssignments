package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("byjus");
		//enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anushya");
		//enter last name
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Periyasamy");
		//enter frst name local
		driver.findElement(By.xpath("(//input[@type='text'])[33]")).sendKeys("selviii");
		//enter dept name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		//enter description
		driver.findElement(By.name("description")).sendKeys("good skill set");
		//enter mail address
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("sivaselviperiyasamy@gmail.com");
		//select state
		WebElement stateDD = driver.findElement(By.xpath("//select [@name='generalStateProvinceGeoId']"));
		Select select=new Select(stateDD);
		select.selectByVisibleText("Florida");
		//click submit button
		driver.findElement(By.className("smallSubmit")).click();
		//click edit button
		driver.findElement(By.className("subMenuButton")).click();
		//edit description
		WebElement edit = driver.findElement(By.xpath("//textarea[@name='description']"));
		edit.clear();
		//enter impo note
		driver.findElement(By.name("importantNote")).sendKeys("good job");
		//click update 
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		//title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//close window
		driver.close();
		
		
		

		
		

	}

}
