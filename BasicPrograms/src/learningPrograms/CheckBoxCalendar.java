package learningPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		//Checkbox
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
		//find number of check box present
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		

	}

}
