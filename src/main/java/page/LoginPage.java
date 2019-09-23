package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']")
	WebElement backgroundColorBlue;

	@FindBy(how = How.CSS, using = "body[style='background-color: white;']")
	WebElement backgroundWhite;

	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")
	WebElement ButtonSkyBlue;

	@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']")
	WebElement ButtonWhite;

	// Methods to interact with the elements

	public void clickblueButton() throws InterruptedException {

		ButtonSkyBlue.click();

	}

	public void clickwhiteButton() {

		ButtonWhite.click();

	}

	public void closewebsite() {

		driver.close();
		driver.quit();
	};

}