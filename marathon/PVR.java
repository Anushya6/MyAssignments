package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVR {

	public static void main(String[] args) throws InterruptedException {

		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.pvrcinemas.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.navigate().refresh();
		
	    driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")).click();
	    driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();
	    
		//click on cinemas
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		//sel cinema
		driver.findElement(By.xpath("//span[text()='INOX Chennai Citi Centre,Dr. R. K. Salai Chennai']")).click();
		
		//sel tmrw
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='MADHARAASI'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='12:00 PM']")).click();
		
		//click submit button
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn']")).click();
		//accept terms and con
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//click any one seat
		driver.findElement(By.xpath("//span[@id='CL.Club|N:15']")).click();
		//click proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//seat info
		String text = driver.findElement(By.className("select-seat-number")).getText();
		System.out.println(text);
		//grand total
		String text2 = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println(text2);
		//clcik proceed and continue
		driver.findElement(By.className("fb-added-btndesk")).click();
		//close popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
	
	}

}
