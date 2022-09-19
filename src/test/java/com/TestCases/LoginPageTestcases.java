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
		String ExpectedTxt = "Admin area demo";
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
	
	
}
