package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automationtask {


	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/home/sumit/Downloads/chromedriver_linux64//chromedriver");
		
		WebDriver driver =new ChromeDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		WebElement lnk=driver.findElement(By.linkText("This is a link"));
		
		lnk.click();
		
		driver.navigate().back();
		
//		WebElement text=
		driver.findElement(By.id("fname")).sendKeys("Harsita");
		
		driver.findElement(By.id("idOfButton")).click();
		
		driver.findElement(By.id("male")).click();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@value='Automation']")).click();
		
		driver.findElement(By.id("manual")).click();
		
		WebElement elementLocator = driver.findElement(By.id("dblClkBtn"));
		
		actions.doubleClick(elementLocator).perform();
		
;
		
		driver.switchTo( ).alert( ).accept();
		
		driver.findElement(By.xpath("//button[contains(text(),'Generate Alert Box')]")).click();
		
		driver.switchTo( ).alert( ).accept();
		
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//button[contains(text(),'Generate Confirm Box')]")).click();
		
		driver.switchTo( ).alert( ).dismiss();
		
			
	}

}
