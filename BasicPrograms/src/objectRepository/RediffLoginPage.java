package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By signIn = By.xpath("//a[@class='signin']");
	By userName= By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By signInBtn = By.xpath("//input[@name='proceed']");
	
	public WebElement clickSigninLink()
	{
		return driver.findElement(signIn);
	}
	public WebElement enterUserName()
	{
		return driver.findElement(userName);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	public WebElement clickSigninbtn()
	{
		return driver.findElement(signInBtn);
	}
}
