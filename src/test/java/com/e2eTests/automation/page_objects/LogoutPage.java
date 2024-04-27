package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement logout;
	

	public LogoutPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getLogout() {
		return logout;
	}

}