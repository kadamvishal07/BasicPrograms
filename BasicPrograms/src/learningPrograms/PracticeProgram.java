package learningPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Title is: "+ driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("test@email.com");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.xpath("//form[@data-testid='royal_login_form']/div/button[@data-testid='royal_login_button']")).click();
		//driver.close();
		//*[text()='test']
	}

}
