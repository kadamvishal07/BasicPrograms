package learningPrograms;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebdriverScope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// Find out all the links on the page
		int totalLinksCount = driver.findElements(By.tagName("a")).size();
		System.out.println("total links on page: " + totalLinksCount);

		// Find all links in footer
		WebElement footerLink = driver.findElement(By.id("gf-BIG"));
		int foooterLinksCount = footerLink.findElements(By.tagName("a")).size();
		System.out.println("total links on footer: " + foooterLinksCount);

		// Find all links in footer's first column
		WebElement columnLink = footerLink.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));
		int footerFirstColumnCount = footerLink.findElements(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul")).size();
		System.out.println("total links on footer: " + footerFirstColumnCount);
		
		//Click all links and open them in new window
		for (int i = 1 ; i <= footerFirstColumnCount; i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnLink.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
		}
		
		//Get title of all windows which were opened
		Set<String> wHandles = driver.getWindowHandles();
		Iterator<String> it = wHandles.iterator();
		
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
