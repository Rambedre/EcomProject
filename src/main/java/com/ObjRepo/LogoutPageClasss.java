package com.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageClasss {
	
	
	public LogoutPageClasss(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public void Logoutclk() {
		logout.click();
	}
}
