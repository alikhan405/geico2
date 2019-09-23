package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps extends Testbase {
	
	//to make it global so don't need to create object in each method
	
	WebDriver driver;
	LoginPage loginpage;
	
	//to make it global so don't need to create object in each method
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
	}
	
	

	@Given("^User is already on website$")
	public void user_is_already_on_website() {
		
	}

	@When("^User click on Set Skyblue Background$")
	public void user_click_on_Set_Skyblue_Background() throws Exception {
		
		loginpage.clickblueButton();
		
		//ScreenShot taken for proof
		screenShot(driver, "c:\\ScreenShotFile");
	}

	@Then("^User is able to change background color to skyblue$")
	public void user_is_able_to_change_background_color_to_skyblue() {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("body[style='background-color: skyblue;']")));

	}

	@When("^User click on Set White Background$")
	public void user_click_on_Set_White_Background() throws Exception {
		
		loginpage.clickwhiteButton();
		
		//ScreenShot taken for proof
		
		screenShot(driver, "c:\\ScreenShotFile");
	}

	@Then("^User is able to change background color to White$")
	public void user_is_able_to_change_background_color_to_White() {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("body[style='background-color: white;']")));

	}

	@Then("^website closes after test is successfull$")
	public void website_closes_after_test_is_successfull() {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.closewebsite();

	}

}
