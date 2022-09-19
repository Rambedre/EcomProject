package com.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	
	
	public HomePageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='brand-link navbar-dark']")
	private WebElement logo;
	
	public WebElement Logo() {
		WebElement mainLogo = logo;
		return mainLogo;
	}
	
	@FindBy(xpath = "//a[text()='John Smith']")
	private WebElement ProfileName;
	
	public WebElement ProName() {
		WebElement name = ProfileName;
		return name;
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-book']/..//p")
	private WebElement Catalog;
	
	public void Catlog(){
		Catalog.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-shopping-cart']/..//p")
	private WebElement cart;
	
	public void Cart() {
		cart.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon far fa-user']/..//p")
	private WebElement Customers;
	
	public void Customers() {
		Customers.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-tags']/..//p")
	private WebElement promotions;
	
	public void Proms() {
		promotions.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-cubes']/..//p")
	private WebElement CM;
	
	public void ContentManagement() {
		CM.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-cogs']/..//p")
	private WebElement Config;
	
	public void Configurations() {
		Config.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-cube']/..//p")
	private WebElement Sys;
	
	public void system() {
		Sys.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-chart-line']/..//p")
	private WebElement Report;
	
	public void reports() {
		Report.click();
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-question-circle']/..//p")
	private WebElement Hlp;
	
	public void help() {
		Hlp.click();
	}
	
	@FindBy(xpath = "//div[@class='content-header']")
	private WebElement Dash;
	
	public WebElement Dasboard() {
		WebElement ele = Dash;
		return ele;
	}
}
