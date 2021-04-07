package learningPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SampleUIComponents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		// If drop-down is static, then use 'Select'Class and built-in functions.
		/* Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		currency.selectByIndex(3);;
		System.out.println("Select Currency is: "+currency.getFirstSelectedOption().getText());*/
		
		//For drop-downs which are not static
		driver.findElement(By.id("divpaxinfo")).click();;
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();		
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']/option[4]")).click();;
		//for (int i=1;i<5;i++)
		//driver.findElement(By.id("hrefIncAdt")).click();
		String adultSelected = driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).getText();
		Assert.assertEquals(adultSelected, "4 Adults");
		
		//Dynamic Drop-downs
	//  //a[@value='MAA']  - Xpath for chennai

	//  //a[@value='BLR'] - xpath for Benglore

	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();	- Dynamic changing drop-down which as 2 matching nodes.
	
	//Parent Child relation xpath: Syntax : <Parent xpath><space><Child xpath>
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	/*Auto Suggestive Drop-down
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(3000);
	List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement option :options)
	{
		if(option.getText().equalsIgnoreCase("India"))
		{
			option.click();
			break;
		}
	}
	 */
	
	}

}
