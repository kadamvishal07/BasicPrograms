package learningPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Programs {

	public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------------
		//Write a program to reverse the number. Int number = 12345
		int number = 12345;
		int temp;
		for (int i= 0; i<5; i++) {
			temp = number%10;
			number = number/10;
			System.out.print(temp);
		}
//------------------------------------------------------------------------------------------------------------------------
		//Write a program to demonstrate right-click using selenium
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in//");
		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.id("nav-logo-sprites"))).build().perform();
//---------------------------------------------------------------------------------------------------------------------------	
		//Write a program  to scroll in selenium until an element is found
		WebElement aboutUs = driver.findElement(By.xpath("//li[@class='nav_first']/a[contains(text(),'About Us')]"));
		System.out.println(aboutUs.isDisplayed());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",aboutUs);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	}
//---------------------------------------------------------------------------------------------------------------------------
	

}

//Test Class outisde class
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		
	}
}
