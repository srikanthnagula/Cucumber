package StepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefinition {
WebDriver driver;
	
	@Given("^User is in new Deals login page$")
	public void User_is_in_New_Deals_Login_Page() {
		System.setProperty( "webdriver.chrome.driver","D:\\Work\\Automation_Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/deals/new");
	}
	
	@When("^User enters Username and Password$")
	public void User_enters_Username_and_Password(DataTable credentials) {
		List<List<String>> data=credentials.raw();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		
	}
	
	@Then("^User click on login button$")
	public void User_click_on_Login_Button() {
		driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
	}
	
	@Then("^User enters deal details$")
	public void User_enters_deal_Details(DataTable Dealdata) {
		List<List<String>> DealValues = Dealdata.raw();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='title']")).sendKeys(DealValues.get(0).get(0));;
	driver.findElement(By.xpath("//input[@name='amount']")).sendKeys(DealValues.get(0).get(1));
	driver.findElement(By.xpath("//input[@name='probability']")).sendKeys(DealValues.get(0).get(2));
	driver.findElement(By.xpath("//input[@name='commission']")).sendKeys(DealValues.get(0).get(3));
	driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	
	}
	
}
