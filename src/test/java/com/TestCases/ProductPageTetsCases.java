package com.TestCases;

import org.testng.annotations.Test;

import com.BaseClass.EcomBase;
import com.ObjRepo.productsPageClass;

public class ProductPageTetsCases extends EcomBase{
	
	
	@Test(priority = 1)
	public void Seacrhproduct() {
		productsPageClass PPC = new productsPageClass(Driver);
		PPC.Catlog();
		PPC.Products();
		PPC.productdetails(proname);
		PPC.category(Category);
		PPC.searchbtnclk();
	}
}
