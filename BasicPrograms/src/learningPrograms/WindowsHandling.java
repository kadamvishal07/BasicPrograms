package learningPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//getWindowHandles will give you set of string and you need itterate over it
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		String parentId = it.next();
		String ChildId = it.next();
		
		//Use SwitchTo() for switching over the Child window and grab the text mentor@rahulshettyacademy.com
		driver.switchTo().window(ChildId);
		String username = driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4].trim();

		//Now switch back to parent window and paste the text in Username field
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(username);;
	}

}
