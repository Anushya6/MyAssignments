package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/kk");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//click on more
		WebElement more = driver.findElement(By.xpath("//span[text()='More']"));
		Actions act = new Actions(driver);
		act.moveToElement(more).perform();
		//click on crypto
		driver.findElement(By.xpath("//a[@aria-label='Finance: Crypto']")).click();
		//get the crypto names
		List<WebElement> cryptoName = driver.findElements(By.xpath("//table[@class='yf-1m4mc7b bd']/tbody/tr/td[2]"));
		for (WebElement list : cryptoName) {
			System.out.println(list.getText());	
		}
		
		
		
		

	}

}
