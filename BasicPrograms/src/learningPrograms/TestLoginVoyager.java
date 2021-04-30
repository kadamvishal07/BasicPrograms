package learningPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLoginVoyager {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://ysiinvpqa/automationportal/pages/LoginAdvanced.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Username")).sendKeys("SankalpS");
		driver.findElement(By.id("Password_Text")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("Password"))).sendKeys("Yardi@123456");
		
		driver.findElement(By.name("cmdLogin1")).click();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		driver.switchTo().frame(frames.get(0));
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("//form/a[2]"))).click();
		driver.findElement(By.id("ysiLinkRescheduleBatch")).click();
		

	}

}
