package selenium.quickbooks.signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {

	public static void main(String[] args) throws InterruptedException {
		
		//registering driver
		System.setProperty("webdriver.chrome.driver", "/home/soumajit/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver= new ChromeDriver();
        
        //putting the signup link
        driver.get("https://signup.quickbooks.intuit.com/?locale=en-gb&offerType=trial&bc=OBI-LL2&offerId=20016322");
        
        //maximize window
	driver.manage().window().maximize();
	
	//sign up page 
        driver.findElement(By.id("ius-email")).sendKeys("seleniumsignuptest@mailinator.com");
        driver.findElement(By.id("ius-first-name")).sendKeys("souma");
	driver.findElement(By.id("ius-last-name")).sendKeys("roy");
        driver.findElement(By.id("ius-mobile-phone")).sendKeys("07911123456");
	driver.findElement(By.id("ius-password")).sendKeys("9883739884Sr@");
	driver.findElement(By.id("ius-confirm-password")).sendKeys("9883739884Sr@");
	
	//scrolling webpage
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
	//clicking checkbox
	driver.findElement(By.xpath("(//label[@class='ius-checkbox-label'])[2]")).click();
	
	//clciking signup button
	driver.findElement(By.xpath("//button[@name='SignUp']")).click();
	
//implictly time waiting
	//firstpage of company creation
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//input[@id='ha-text-field-8']")).sendKeys("Selenium company");
	
	
  //selecting element form dropdown
	 WebElement dropDown = driver.findElement(By.xpath("(//button[@class='action-button no-connector ha-input'])[1]"));
	 dropDown.click();
	 driver.findElement(By.xpath("//ha-menu-item[@aria-label='Charity or association']")).click();
	 dropDown.click();
	 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	 Thread.sleep(1000);
	 
	 WebElement dropDown2 = driver.findElement(By.xpath("//button[@id='ha-select-target-16']"));
	 dropDown2.click();
	 js.executeScript("arguments[0].scrollIntoView();",dropDown2 );
	 driver.findElement(By.xpath("//ha-menu-item[@aria-label='1-2 years']")).click();
	 dropDown2.click();
	 
	 Thread.sleep(1000);
	 
	 
	 	 
	 WebElement dropDown3 = driver.findElement(By.xpath("//button[@id='ha-select-target-26']"));
	 dropDown3.click();
	 js.executeScript("arguments[0].scrollIntoView();",dropDown3 );
	 driver.findElement(By.xpath("//ha-menu-item[@aria-label='Professional Services – e.g. consultants, designers, tutors &amp; childminders']")).click();
	 dropDown3.click();
	 
	 Thread.sleep(1000);

	
	//clicking next button 
	 WebElement clik=driver.findElement(By.xpath("(//button[@class='ha-button step-flow-button ha-button-primary'])[1]"));
	 clik.click();
	
	

	 //implicit wait 
	 //2nd page of company creation
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	 
	Thread.sleep(2000);
	WebElement ele= driver.findElement(By.xpath( "(//div[@class='tileContent'])[1]"));
	 	 js.executeScript("arguments[0].scrollIntoView();",ele );
	 	 ele.click();
	 
	 	 Thread.sleep(1000);
	 WebElement next=driver.findElement(By.xpath("//button[@class='ha-button step-flow-button ha-button-primary']"));
	   js.executeScript("arguments[0].scrollIntoView();",next );
	 	 next.click();
		



	}

}