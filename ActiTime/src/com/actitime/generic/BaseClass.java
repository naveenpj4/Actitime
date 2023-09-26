package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	
public static WebDriver driver;

	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void Login() throws IOException
	{
		Reporter.log("Login",true);
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage lp=new LoginPage(driver);
		lp.setLogin(un, pw);
	}
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout",true);
		HomePage hp = new HomePage(driver);
		hp.setLogout();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
		driver.close();
	}
}
