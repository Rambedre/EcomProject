package com.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.BaseClass.EcomBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportsClass implements ITestListener{
	ExtentSparkReporter htmlreproter;
	ExtentReports reports;
	ExtentTest test;
	ReadConfig read = new ReadConfig();
	
	public void reportConfig() {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		String reportName = "Batch42Framework-" + timestamp + ".html";
		htmlreproter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + reportName);

		reports = new ExtentReports();
		reports.attachReporter(htmlreproter);

		reports.setSystemInfo("Machine:", "Dell");
		reports.setSystemInfo("OS", "windows 10");
		reports.setSystemInfo("browser:", read.browsername());
		reports.setSystemInfo("username:", "Ram Bedre");

		// configuration to change look and feel of report
		htmlreproter.config().setDocumentTitle("This is reports of Batch42 ");
		htmlreproter.config().setReportName("Reports of Batch42 Framework Project");
		htmlreproter.config().setTheme(Theme.STANDARD);
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Name of test method started:" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Name of test method sucessfully executed:" + result.getName());
		test = reports.createTest(result.getName());
		test.log(Status.PASS,
				MarkupHelper.createLabel("Name of the passed test case is: " + result.getName(), ExtentColor.GREEN));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot TS = (TakesScreenshot)EcomBase.Driver;
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss").format(new Date());
		File src = TS.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Sai\\eclipse-workspace\\Ecommercedemo2\\Screenshot\\Error"+timestamp+".jpg");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of test method skipped:" + result.getName() );  		

		test = reports.createTest(result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of the skip test case is: " + result.getName() ,ExtentColor.YELLOW));
	}

	@Override
	public void onStart(ITestContext context) {
		reportConfig();
		System.out.println("On Start method invoked....");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finished method invoked....");
		reports.flush(); // it is mandatory to call flush method to ensure information is written to the
							// started reporter.
	}
	
	
	
}
