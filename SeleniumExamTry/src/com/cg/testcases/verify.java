package com.cg.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cg.loginPage.LoginPage;



public class verify {

	 WebDriver driver;
	 LoginPage obj;

	static String driverpath ="C:\\Users\\marroy\\Desktop\\chromedriver_win32";
	@BeforeTest

	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver",driverpath+"\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("file:///C:/Users/marroy/Desktop/Training%20Material/Module-04/SampleProject_VV%20AT%20M4/VV%20AT%20M4_MPT%20Sample%20Que/login.html");
		driver.manage().window().maximize();
		}
	@Test
	public void VerifyLogin() throws InterruptedException
	{
		obj= new LoginPage(driver);
		PageFactory.initElements(driver,obj);
		//String pageTitle =obj.getLoginPageTitle();
		//Assert.assertEquals(pageTitle," Paper Submission for International Journal");
		obj.clickheretoKnow();
		Thread.sleep(1000);
		//obj.backtoclick();
		//Thread.sleep(1000);
		obj.LoginPageOnwebsite("","");//"Nikhitha","nikki@gamil.com","9878786868","Hyderabad","Telangana","Satellites","Nikki","1","Capgemini","Analyst");
	}
		
		
	@Test
	public void VerifyRegistrationForm() throws InterruptedException{
		driver.navigate().to("file:///C:/Users/marroy/Desktop/Training%20Material/Module-04/SampleProject_VV%20AT%20M4/VV%20AT%20M4_MPT%20Sample%20Que/registration.html");
		obj = new LoginPage(driver);
		PageFactory.initElements(driver,obj);
		//String PageTitle= obj.RPageOnwebsite().toString();
 		//Assert.assertEquals(PageTitle,"Capgemini International Research Journal");
 		//System.out.println(":"+PageTitle);
 		obj.RPageOnwebsite("Nikhitha","nikki@gamil.com","9878786868","Hyderabad","Telangana","Satellites","Nikki","1","Capgemini","Analyst");
 		Thread.sleep(1000);
	}
	/*@Test
	public void check_the_heading_of_the_page() 
	{
		String strheading = driver.findElement(By.xpath(".//*[@id='mainCnt']/div/div/h3")).getText();
		if(strheading.contentEquals(" Paper Submission for International Journal")) {
			System.out.println("******" +"Heading Matched");
		}
		else	{	System.out.println("******" + "Heading Not Matched"); 	}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}*/
	@Test
	public void chkLogin() throws InterruptedException  {
		/***** Blank userName *******/
		obj.typeUserName("");
		Thread.sleep(1000);
		obj.Clicklogin();
		Thread.sleep(1000);
		String strmsg = driver.findElement(By.id("userErrMsg")).getText();
		if(strmsg.contentEquals("* Please enter userName.")) {
			System.out.println("******" +"Alert Matched");
		}
		else	{	System.out.println("******" + "Alert Not Matched"); 	}
		
		/***** Correct userName *******/
		Thread.sleep(1000);
		obj.typeUserName("vrl");
		Thread.sleep(1000);
		/***** Blank psswrod *******/
		obj.typePassword("");
		Thread.sleep(1000);
		obj.Clicklogin();
		Thread.sleep(1000);
		String strpmsg = driver.findElement(By.id("pwdErrMsg")).getText();
		if(strpmsg.contentEquals("* Please enter password.")) {
			System.out.println("******" +"Alert Matched");
		}
		else	{	System.out.println("******" + "Alert Not Matched"); 	}
		
		
		/***** Correct Password *******/
		Thread.sleep(1000);
		obj.typePassword("vrl1234");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		obj.Clicklogin();
		//driver.close();
		//driver.navigate().to("file:///C:/Users/marroy/Desktop/Training%20Material/Module-04/SampleProject_VV%20AT%20M4/VV%20AT%20M4_MPT%20Sample%20Que/registration.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.close();
	}

	/*/@Test
	public void check_the_heading_of_the_register_page() 
	{
		String strheading = driver.findElement(By.xpath("html/body/div/h2")).getText();
		if(strheading.contentEquals("Paper Submissions for"\"Capgemini International Research Journal\"")
				{
			System.out.println("******" +"Heading Matched");
		}
		else	{	System.out.println("******" + "Heading Not Matched"); 	}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}
	*/
	/*@AfterTest
	 public void CloseBrowser()
	 {
		 driver.quit();
		 
	 }*/
}


/*@Test
public void chkIncorrectCredentials() throws Throwable {
	obj.setPfuname("cg");
	objhlpg.setPfpwd("capg1234");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	objhlpg.setPflogin();
	String alertMessage = driver.switchTo().alert().getText();
    driver.switchTo().alert().accept();
    System.out.println("******" + alertMessage);
}*/

