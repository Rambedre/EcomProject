package com.TestCases;

import org.testng.annotations.Test;

import com.BaseClass.EcomBase;
import com.ObjRepo.productsPageClass;

public class ProductPageTetsCases extends EcomBase{
	
	
	@Test(priority = 1)
	public void Seacrhproduct() throws InterruptedException {
		productsPageClass PPC = new productsPageClass(Driver);
		PPC.Catlog();
		PPC.Products();
		Thread.sleep(2000);
		PPC.productdetails(proname);
		PPC.category(Category);
		PPC.searchbtnclk();
	}
}
