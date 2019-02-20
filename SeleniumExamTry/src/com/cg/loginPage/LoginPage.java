package com.cg.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	WebDriver driver;
	public  LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}

	@FindBy(xpath=".//*[@id='mainCnt']/div/div/form/h3/a")
	WebElement clickhereknow;
	@FindBy(xpath="html/body/p/a")
	WebElement back;
	@FindBy(name="userName")
	WebElement Username;
	@FindBy(name="userPwd")
	WebElement Password;
	
	@FindBy(name="txtFN")
	WebElement FullName;

	@FindBy(name="Email")
	WebElement Email;

	@FindBy(name="Phone")
	WebElement MobileNo;

	@FindBy(name="gender")
	WebElement Gender;

	@FindBy(name="city")
	WebElement City;

	@FindBy(name="state")
	WebElement State;

	@FindBy(id="txtCardholderName")
	WebElement SubjectCategory;

	@FindBy(name="debit")
	WebElement PaperName;

	@FindBy(name="cvv")
	WebElement NoOfAuthors;

	@FindBy(name="month")
	WebElement CompanyName;

	@FindBy(name="year")
	WebElement Designation;

	@FindBy(id="btnPayment")
	WebElement ConfirmRegistration;
	
	
	 @FindBy(xpath=".//*[@id='mainCnt']/div/div/form/table/tbody/tr[4]/td[2]/input")
	WebElement login;

	 
	 public void clickheretoKnow() throws InterruptedException
		{
			clickhereknow.click();
			Thread.sleep(5000);
			back.click();
			//driver.navigate().back();
		}
	/* public void backtoclick()
		{
			back.click();		
			
		}*/
	public void typeUserName(String strNUname)
	{
		Username.sendKeys(strNUname);
	}
	public void typePassword(String strNPwd)
	{
		Password.sendKeys(strNPwd);
	}
	/*public void typeConfimrPassword(String strNConfirmPwd)
	{
		ConfirmPassword.sendKeys(strNConfirmPwd);
	}
	public void typeFirstName(String strNFname)
	{
		FirstName.sendKeys(strNFname);
	}		
	public void typeLastName(String strNLname)
	{
		LastName.sendKeys(strNLname);
	}	
	public void selectCity(String strNCityname)
	{
		Select drpcity = new Select(City);
		
		drpcity.selectByVisibleText(strNCityname);
		

	}	*/
	public void Clicklogin()
	{
		login.click();		

	}
	
	public void TypeFullName(String strFName)
	{
		FullName.sendKeys(strFName);
	}
	public void TypeEmail(String strEmail)
	{
		Email.sendKeys(strEmail);
	}
	public void TypeMobileNo(String strMno)
	{
		MobileNo.sendKeys(strMno);
	}
	public void Gender()
	{
		Gender.click();
	}
	public void SelectCity(String strCity)
	{
		Select drpCity=new Select(City);
		drpCity.selectByVisibleText(strCity);
	}
	public void SelectState(String strState)
	{
		Select drpState=new Select(State);
		drpState.selectByVisibleText(strState);
	}
	public void TypeSubjectCategory(String strSC)
	{
		SubjectCategory.sendKeys(strSC);
	}
	public void TypePaperName(String strPN)
	{
		PaperName.sendKeys(strPN);
	}
	public void TypeNoOfAuthors(String strAuthor)
	{
		NoOfAuthors.sendKeys(strAuthor);
	}
	public void TypeCompanyName(String strCN)
	{
		CompanyName.sendKeys(strCN);
	}
	public void TypeDesignation(String strDesg)
	{
		Designation.sendKeys(strDesg);
	}

	public void ClickSubmit()
	{
		ConfirmRegistration.click();
	}
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}	
	public void LoginPageOnwebsite (String strNUname,String strNPwd)//,String strFName,String strEmail,String strMno,String strCity,String strState,String strSC,String strPN,String strAuthor,String strCN,String strDesg) throws InterruptedException
	{
	
	//clickheretoKnow();
	typeUserName(strNUname);
	typePassword(strNPwd);
	Clicklogin();
	/*TypeFullName(strFName);
	TypeEmail(strEmail);
	TypeMobileNo(strMno);
	Gender.click();
	SelectCity(strCity);
	SelectState(strState);
	TypeSubjectCategory(strSC);
	TypePaperName(strPN);
	TypeNoOfAuthors(strAuthor);
	TypeCompanyName(strCN);
	TypeDesignation(strDesg);
	ClickSubmit();*/
	}
	public void RPageOnwebsite(String strFName,String strEmail,String strMno,String strCity,String strState,String strSC,String strPN,String strAuthor,String strCN,String strDesg) 
	{
		TypeFullName(strFName);
	TypeEmail(strEmail);
	TypeMobileNo(strMno);
	Gender.click();
	SelectCity(strCity);
	SelectState(strState);
	TypeSubjectCategory(strSC);
	TypePaperName(strPN);
	TypeNoOfAuthors(strAuthor);
	TypeCompanyName(strCN);
	TypeDesignation(strDesg);
	ClickSubmit();}
	
	}


