import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nominet {

	public static void main(String[] args) {
		//open Chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Type URL
		driver.get("https://www.nominet.uk/lookup/");
		//Select lookup text box and type a domain name
		driver.findElement(By.id("rdapLookup")).sendKeys("monster.wales");
		//Search
		driver.findElement(By.id("gtm-rdap-click")).click(); 
	}
}
