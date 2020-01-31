package selenium.quickbooks.signin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuickbooksSigninTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/soumajit/Downloads/chromedriver_linux64/chromedriver");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://c34.qbo.intuit.com/qbo34/login?&useNeo=true&region=GB\"\n");
	    
	    //accepting cookies
	    
	    System.out.println(driver.manage().getCookies());
	    driver.findElement(By.xpath("(//td[@class='cookieCloseAction'])")).click();
	  
	    
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("(//input[@id='ius-userid'])")).sendKeys("seleniumsignuptest@mailinator.com");

	driver.findElement(By.xpath("(//input[@id='ius-password'])")).sendKeys("9883739884Sr@");
	JavascriptExecutor js1=(JavascriptExecutor) driver;
	
	js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	driver.findElement(By.xpath("(//button[@id='ius-sign-in-submit-btn'])")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("(//input[@id='ius-verified-user-update-btn-submit'])")).click();
	
	
	
	

	}

}
