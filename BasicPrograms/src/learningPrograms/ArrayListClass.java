package learningPrograms;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		//these items are needed to add in cart
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot" };
		
		//Get all the items in List of webelements
		List<WebElement> listOfAllProducts = driver.findElements(By.xpath("//h4[@class='product-name']"));
		// print list of items on website
		for (int k = 0; k < listOfAllProducts.size(); k++) {
			System.out.println(listOfAllProducts.get(k).getText());
		}
		
		//change array to ArrayList, so that we can use Contains() functions for search
		List itemsNeededList = Arrays.asList(itemsNeeded);

		for (int i = 0; i < listOfAllProducts.size(); i++) {
			String[] product = listOfAllProducts.get(i).getText().split(" ");

			if (itemsNeededList.contains(product[0])) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}

	}

}
