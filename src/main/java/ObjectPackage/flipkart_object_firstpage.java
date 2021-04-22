package ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.flipkart_base;

public class flipkart_object_firstpage extends flipkart_base{

	public flipkart_object_firstpage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	public WebElement getuser()
	{
		return username;
	}
	public WebElement getpass() {
		return password;
	}
	public WebElement getlogin()
	{
		return login;
	}
	
}
	