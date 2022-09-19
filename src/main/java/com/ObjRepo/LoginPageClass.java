package com.ObjRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	
	
	public LoginPageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[text()='Admin area demo']")
	private WebElement text1;
	
	public WebElement txt1() {
		WebElement txt = text1;
		return txt;
	}
	
	@FindBy(xpath = "//strong[text()='Welcome, please sign in!']") 
	private WebElement text2;
	
	public WebElement txt2() {
		WebElement txt = text2;
		return txt;
	}
	
	@FindBy(id = "Email")
	private WebElement Loginbox;
	
	@FindBy(id ="Password")
	private WebElement passwbox;
	
	public void cleartabs() {
		Loginbox.clear();
		passwbox.clear();
	}
	
	public void entercred(String uname, String passw) {
		Loginbox.sendKeys(uname);
		passwbox.sendKeys(passw);
	}
	
	@FindBy(xpath = "//label[text()='Remember me?']")
	private WebElement text3;
	
	public WebElement txt3() {
		WebElement txt = text3;
		return txt;
	}
	
	@FindBy(id = "RememberMe")
	private WebElement chkbox;
	
	public WebElement cbox() {
		WebElement box =chkbox;
		return box;
	}
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement signinbtn;
	
	public WebElement clkbtn() {
		WebElement btn = signinbtn;
		return btn;
	}
	
	public void login() {
		signinbtn.click();
	}
}
