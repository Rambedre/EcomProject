package com.BaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.UtilityClass.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomBase {
	
	
	public static  WebDriver Driver;
	
	ReadConfig read = new ReadConfig();
	public String URl = read.URL();
	public String uname = read.username();
	public String passw = read.password();
	public String proname = read.proname();
	public String Category = read.category();
	public String Testingtype1 = read.TestingType();
	public String Testingtype2 = read.TestType2();
	
	@Parameters({"browser"})
	@BeforeTest(alwaysRun = true)
	public void browserstart(@Optional ("chrome") String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
//			options.addArguments(Testingtype1);
			options.addArguments(Testingtype2);
			Driver = new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments(Testingtype1);
//			options.addArguments("incognito");
			Driver = new FirefoxDriver(options);
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments(Testingtype1);
//			options.addArguments("incognito");
			Driver= new EdgeDriver(options);
		}
		else {
			throw new RuntimeException("Invalid Browser Value");
		}
		
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterTest
	public void browserClaose() throws InterruptedException {
		Thread.sleep(3000);
		Driver.close();
	}
	
}
