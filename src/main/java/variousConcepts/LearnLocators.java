package variousConcepts;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver",
				"driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void testLocator() {
		driver.findElement(By.name("firstname")).sendKeys("Bachir");
		driver.findElement(By.name("lastname")).sendKeys("Chitou");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\15012\\Downloads\\Diversity Power Point Final.pptx");
	    driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	    driver.navigate().back();
	    driver.findElement(By.partialLinkText("Product")).click();
	    
//	    driver.findElement(By.cssSelector("input#exp-3")).click();
//	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ade");
	}
}
			