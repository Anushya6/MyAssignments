package testngPractise;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcase.CommonIntegration;

public class BasicClass {
	public ChromeDriver driver;
	public String excelFileName;
	
@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return CommonIntegration.readData(excelFileName);
		
	}	
@Parameters({"url","username","password"})
@BeforeMethod
	public void preCondition(String url,String uName,String pwd) {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("guest");
	    driver= new ChromeDriver(options);	
		driver.manage().window().maximize();

		driver.get(url);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		//login
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
	}
@AfterMethod
	public void postCondition() {
		driver.close();

	}
}



