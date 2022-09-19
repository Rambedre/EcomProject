package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.BaseClass.EcomBase;
import com.ObjRepo.HomePageClass;
import com.ObjRepo.LogoutPageClasss;
import com.ObjRepo.productsPageClass;

public class DasbBoardTC1 extends EcomBase{
	
	@Test(priority = 1)
	public void ProfilenName() {
		HomePageClass dash = new HomePageClass(Driver);
		
		String expectedText = "John Smith";
		String Actualtxt = dash.ProName().getText();
		Assert.assertEquals(Actualtxt, expectedText);
		
	}
	
	@Test(priority = 2)
	public void pagename() {
		HomePageClass dash = new HomePageClass(Driver);
		SoftAssert soft = new SoftAssert();
		
		String Actual = "Dashboard";
		String Expected = dash.Dasboard().getText();
		soft.assertEquals(Actual, Expected);
		soft.assertAll();
	}
	
	@Test(priority = 3)
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
	
	
	
	
	
}
