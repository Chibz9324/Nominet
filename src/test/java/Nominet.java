import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nominet {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nominet.uk/lookup/");
		driver.findElement(By.id("rdapLookup")).sendKeys("monster.wales");
		driver.findElement(By.id("gtm-rdap-click")).click();
		//^ Above navigates to the site to make a search query 
	}
}
