package homework1;

import java.time.Duration;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"driver/chromedriver - Copy.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ade");
	}
}
