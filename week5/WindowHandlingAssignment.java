package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("guest");
        ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//enter userid and pass
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		Thread.sleep(1000);
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmsfa
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("SFA")).click();

		//click on contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//click on merge contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//click on from widget
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		//naviagte to from window
	    Set<String>ChildWindow=driver.getWindowHandles();
	    List<String>ListWindow=new ArrayList<String>(ChildWindow);
	    Thread.sleep(2000);
	    driver.switchTo().window(ListWindow.get(1));
	    //click on first contact
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='10717']")).click();
	    driver.switchTo().window(ListWindow.get(0));

	    //click on to widget
	    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	   //navigate to to widget window
	    Set<String>ToWindow=driver.getWindowHandles();
	    List<String>Window=new ArrayList<String>(ToWindow);
	    Thread.sleep(2000);
	    driver.switchTo().window(Window.get(1));
	    //click on sec contack
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='10718']")).click();
	    driver.switchTo().window(Window.get(0));
	    //click on merge button
	    driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    System.out.println(driver.getTitle());
	    
	  	
		
	}

}
