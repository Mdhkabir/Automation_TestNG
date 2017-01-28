package TestPackege;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GmailLogin {
	
	//public static void main(String[] args) throws InterruptedException {
	public WebDriver driver; 
		
		@Test
		public void main() throws InterruptedException{
			
	String baseDIRPath = System.getProperty("user.dir");
	String FirefoxServerPath = baseDIRPath + "\\Utilities\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driverr", FirefoxServerPath);
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.google.com");

	
	
	//open up the Firefox Browser
	
	System.out.println(driver.getCurrentUrl());
	driver.getTitle();
	driver.manage().window().maximize();
	
	//driver.navigate().to("http://www.example.com");
	
	// click on sign in button
	WebElement SignInButton = driver.findElement(By.xpath("//*[@id='gb_70']"));
	SignInButton.click();
	Thread.sleep(2000);
	
	WebElement pageTitle = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1"));
	System.out.println(pageTitle.getText());
	String title = pageTitle.getText();
	Assert.assertEquals("One account. All of Google.", title);
	
	
	//Assert.assertTrue("Text not found!", bodyText.contains(text));
	
	
	
	/*if (pageTitle.equals(title)){
		System.out.println("validation is valid");
	}else{
		System.out.println("validation is not valid");
	}
	*/

	driver.findElement(By.xpath("//*[@id='Email']")).clear();
	
	
	//user typed username
	WebElement UserName = driver.findElement(By.xpath("//*[@id='Email']"));
	UserName.sendKeys("remoteituniversity");
	Thread.sleep(2000);
	
	//user click on next button
	WebElement NextButton = driver.findElement(By.xpath("//*[@id='next']"));
	NextButton.click();
	Thread.sleep(2000);
	
	//user typed Password
	WebElement Password = driver.findElement(By.xpath("//*[@id='Passwd']"));
	Password.sendKeys("01715479713");
	Thread.sleep(2000);
	
	//user click on next LoggedIn
	WebElement LoggedIn = driver.findElement(By.xpath("//*[@id='signIn']"));
	LoggedIn.click();
	Thread.sleep(2000);
			
	//user click on next LoggedIn
	WebElement Gmail = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a"));
	Gmail.click();
	Thread.sleep(10000);		
	
	driver.close();
	driver.quit();
	
	
	
	
	}
	

}
