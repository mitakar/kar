package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import actions.HomePageActions;
import actions.MapPageActions;
import actions.YouTubePageActions;
import common.Common;
import actions.BookPageActions;

public class BaseTest {
	
	public WebDriver driver = null;
	public HomePageActions homePageActions=null;
	public Common common = null;
	@BeforeClass
	public void main() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		homePageActions = new HomePageActions(driver);
		common = new Common(driver);
	}
	@AfterClass
	public void last() {
		driver.quit();
	}
}
