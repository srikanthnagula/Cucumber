package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^User is already on Login page$")
	public void User_already_on_Login_Page() {
		System.setProperty( "webdriver.chrome.driver","D:\\Work\\Automation_Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
	}
	
	@When("^Title of login page is Free CRM$")
	public void Title_of_login_page_is_Free_CRM() {
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("#1 Free CRM software in the Cloud FreeCRM",  Title);
	}
	
	@Then("^User Clicks on Login Button$")
	public void User_Clicks_on_Login_Button() {
		driver.findElement(By.xpath("//a[contains(@href,'ui.freecrm')]")).click();
		
	}
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void User_enters_username_and_Password(String username, String password) {
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^User clicks on Login$")
	public void User_clicks_on_Login() {
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
	}

	@Then("^Title of Homepage is CRM$")
	public void Title_of_Homepage_is_CRM() {
		String title=driver.getTitle();
		System.out.println("Title after login is : "+ title);
		Assert.assertEquals("CRM", title);
		
	}

	@Then("^User moved to new contact page$")
	public void user_moved_to_new_contact_page() {
		 
		//driver.navigate().to("https://ui.freecrm.com/contacts/new");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.name("email")).sendKeys("srikanth04@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("India123$");
		//driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
		//driver.switchTo().frame(driver.findElement(By.cssSelector("Twitter settings iframe']")));
		WebElement Contacts = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		WebElement NewContact = driver.findElement(By.xpath("//*[contains(text(),'Contacts/new')]"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Contacts);
		js.executeScript("arguments[0].click();", NewContact);
		//driver.findElement(By.xpath("//div[@id='dashboard-toolbar']")).click();		
		//div[@id='dashboard-toolbar']//a[@href='/contacts/new']/button
	}
	
	
	@Then ("^User enters Contact details \"(.*)\" and \"(.*)\" and \"(.*)\"")
	public void User_Enters_contact_details(String Firstname, String Lastname, String Position) {
		driver.findElement(By.name("first_name")).sendKeys(Firstname);
		driver.findElement(By.name("last_name")).sendKeys(Lastname);
		driver.findElement(By.name("position")).sendKeys(Position);
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	    
	@Then("^Close the browser$")
	public void Close_the_Browser() {
	driver.quit();
	}

}
