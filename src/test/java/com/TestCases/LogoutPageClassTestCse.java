package com.TestCases;

import org.testng.annotations.Test;

import com.BaseClass.EcomBase;
import com.ObjRepo.LogoutPageClasss;

public class LogoutPageClassTestCse extends EcomBase{
	
	
	@Test(priority = 1)
	public void logout() {
		LogoutPageClasss LPC = new LogoutPageClasss(Driver);
		LPC.Logoutclk();
	}
}
