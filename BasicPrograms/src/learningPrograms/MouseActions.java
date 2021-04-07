package learningPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement moveToSignIn = driver.findElement(By.id("nav-link-accountList"));
		WebElement moveToSearchBox = driver.findElement(By.cssSelector("[id=twotabsearchtextbox]"));
		
		//Mouseover the signIn button
		Actions a = new Actions(driver);
		a.moveToElement(moveToSignIn).build().perform();
		
		//Click on Search box  and enter "HELLO" in capital //Composite Actions
		a.moveToElement(moveToSearchBox).click().keyDown(Keys.SHIFT).sendKeys("Hello").build().perform();

	}

}
