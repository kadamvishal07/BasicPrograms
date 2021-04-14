package learningPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();

		// Click on Calendar Picker
		driver.findElement(By.id("travel_date")).click();

		// Select Month 'May'
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("May")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();

		}
		
		// Collect list of all dates from picker in List fomMonth
		List<WebElement> fromMonth = driver.findElements(By.cssSelector(".day"));

		// itterate over the list and compare the text "21" with the item in list
		for (int i = 0; i < fromMonth.size(); i++) {
			String text = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if (text.equals("21")) {
				driver.findElements(By.cssSelector(".day")).get(i).click();
				System.out.println(" " + driver.findElements(By.cssSelector(".day")).get(i).getText());
				break;
			}
		}

	}

}
