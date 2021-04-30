package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepository.RediffLoginPage;

public class RediffLoginTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();

		RediffLoginPage rlp = new RediffLoginPage(driver);
		rlp.clickSigninLink().click();
		rlp.enterUserName().sendKeys("test");
		rlp.enterPassword().sendKeys("test");
		rlp.clickSigninbtn().click();

	}
}
