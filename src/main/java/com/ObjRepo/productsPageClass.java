package com.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class productsPageClass {
	
	
	public productsPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-book']/..//p")
	private WebElement Catalog;
	
	public void Catlog(){
		Catalog.click();
	}
	
	@FindBy(xpath = "//p[text()=' Products']")
	private WebElement prod;
	
	public void Products() {
		prod.click();
	}
	
	@FindBy(id="SearchProductName")
	private WebElement proname;
	
	public void productdetails(String Pname) {
		proname.sendKeys(Pname);
	}
	
	@FindBy(id = "SearchCategoryId")
	private WebElement cata;
	
	public void category(String category) {
		Select sel = new Select(cata);
		sel.selectByVisibleText(category);
	}
	
	@FindBy(id ="search-products")
	private WebElement Searchbtn;
	
	public void searchbtnclk() {
		Searchbtn.click();
	}
}
