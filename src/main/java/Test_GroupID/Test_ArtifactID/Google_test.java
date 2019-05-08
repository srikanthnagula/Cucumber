package Test_GroupID.Test_ArtifactID;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_test {
	public static void main(String[] args) throws InterruptedException {
	
System.setProperty( "webdriver.chrome.driver","D:\\Work\\Automation_Downloads\\chromedriver\\chromedriver.exe");
//System.setProperty( "webdriver.gecko.driver","D:\\Work\\Automation_Downloads\\geckodriver\\geckodriver.exe");
WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();

driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
//driver.manage().deleteAllCookies();
driver.manage().window().maximize();
String BaseUrl="http://www.google.com";
driver.get(BaseUrl);
driver.findElement(By.id("fsettl")).click();
driver.findElement(By.id("dk2qOd")).click();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//driver.switchTo().frame("google-feedback-submit-frame");

driver.switchTo().frame("google-feedback-wizard");
driver.findElement(By.xpath("//button[@aria-label ='CANCEL')]")).click();

//driver.findElement(By.xpath("//*label[text()='Describe your issue or share your ideas']")).sendKeys("Testing");





	}

}
