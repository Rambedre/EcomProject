package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BaseClass.EcomBase;
import com.ObjRepo.HomePageClass;
import com.ObjRepo.LoginPageClass;
import com.ObjRepo.LogoutPageClasss;
import com.ObjRepo.productsPageClass;
import com.UtilityClass.ReportsClass;


@Listeners(ReportsClass.class)
public class LoginPageTestcases extends EcomBase{
	
	
	@Test(priority = 1)
	public void HeadChk() {
		Driver.get(URl);
		LoginPageClass LPC = new LoginPageClass(Driver);
		SoftAssert soft = new SoftAssert();
		String ExpectedTxt = "Adminarea demo";
		String ActualTxt = LPC.txt1().getText();
		soft.assertEquals(ActualTxt, ExpectedTxt);
		soft.assertAll();
	}
	
	@Test(priority = 2)
	public void Wlcchk() {
		LoginPageClass LPC = new LoginPageClass(Driver);
		SoftAssert soft = new SoftAssert();
		String Expectedtxt = "Welcome, please sign in!";
		String Actualtxt = LPC.txt2().getText();
		soft.assertEquals(Actualtxt, Expectedtxt);
		soft.assertAll();
	}
	
	@Test(priority = 3)
	public void txt3() {
		LoginPageClass LPC = new LoginPageClass(Driver);
		SoftAssert soft = new SoftAssert();
		String expectedtxt = "Remember me?";
		String Actualtxt = LPC.txt3().getText();
		soft.assertEquals(Actualtxt, expectedtxt);
		soft.assertAll();
	}
	
	@Test(priority = 4)
	public void ckhbox() {
		LoginPageClass LPC = new LoginPageClass(Driver);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(LPC.cbox().isDisplayed());
	}
	
	@Test(priority = 5)
	public void login() {
		LoginPageClass LPC = new LoginPageClass(Driver);
		Assert.assertTrue(LPC.clkbtn().isDisplayed());
		Assert.assertTrue(LPC.cbox().isEnabled());
		LPC.cleartabs();
		LPC.entercred(uname, passw);
		LPC.login();
		
	}
	
	@Test(priority = 6)
	public void ProfilenName() {
		HomePageClass dash = new HomePageClass(Driver);
		
		String expectedText = "John Smith";
		String Actualtxt = dash.ProName().getText();
		Assert.assertEquals(Actualtxt, expectedText);
		
	}
	
	@Test(priority = 7)
	public void pagename() {
		HomePageClass dash = new HomePageClass(Driver);
		SoftAssert soft = new SoftAssert();
		
		String Actual = "Dashboard";
		String Expected = dash.Dasboard().getText();
		soft.assertEquals(Actual, Expected);
		soft.assertAll();
	}
	
	@Test(priority = 8)
	public void optionschk() throws InterruptedException {
		HomePageClass dash = new HomePageClass(Driver);
		dash.Catlog();
		Thread.sleep(1000);
		dash.Cart();
		Thread.sleep(1000);
		dash.Customers();
		Thread.sleep(1000);
		dash.Proms();
		Thread.sleep(1000);
		dash.ContentManagement();
		Thread.sleep(1000);
		dash.Configurations();
		Thread.sleep(1000);
		dash.system();
		Thread.sleep(1000);
		dash.reports();
		Thread.sleep(1000);
		dash.help();
	}
	
	@Test(priority = 9)
	public void Seacrhproduct() {
		productsPageClass PPC = new productsPageClass(Driver);
		PPC.Catlog();
		PPC.Products();
		PPC.productdetails(proname);
		PPC.category(Category);
		PPC.searchbtnclk();
	}
	
	@Test(priority = 10)
	public void logout() {
		LogoutPageClasss LPC = new LogoutPageClasss(Driver);
		LPC.Logoutclk();
	}
}
