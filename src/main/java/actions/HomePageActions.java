package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import elements.HomePageElements;

public class HomePageActions extends HomePageElements {
	
	public HomePageActions(WebDriver driver) {
		super(driver);
		
	}
	public MapPageActions addToHome() throws InterruptedException {
		Actions actions = new Actions(driver);
		
		googleApp_H.click();
		Thread.sleep(3000);
		
		driver.switchTo().frame(f);
		Thread.sleep(3000);
		googlMap.click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		return new MapPageActions(driver);
	}
}
