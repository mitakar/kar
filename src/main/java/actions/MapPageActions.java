package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import elements.MapPageElements;

public class MapPageActions extends MapPageElements {

	public MapPageActions(WebDriver driver) {
		super(driver);
		
	}
	public YouTubePageActions addToMap() throws InterruptedException {	
	
	googleMap_H.click();
	
	driver.switchTo().frame(f);
	Thread.sleep(3000);
	
	youTube.click();
    Thread.sleep(5000);
    
    driver.switchTo().defaultContent();
	Thread.sleep(5000);
	
	return new YouTubePageActions(driver);
	}
}
