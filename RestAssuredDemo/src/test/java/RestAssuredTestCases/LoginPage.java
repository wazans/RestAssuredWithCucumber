package RestAssuredTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//1 . Create driver driver object
	WebDriver ldriver;
	//2 . Public Constructor - To make object and then access methods ||  from your class's methods.
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//3. WebElement
	@FindBy(name="uid")
	WebElement txtUserName;
	
	//WebElement txtUserName=driver.findElementByname("uid");
	
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	//4.Actions
	public void SetUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
	}
	
	public void SetPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		
	}
	
	public void ClickSubmit()
	{
		
		btnLogin.click();
	}
}
