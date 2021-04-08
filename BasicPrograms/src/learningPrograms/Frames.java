package learningPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();

	}

}
