package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import elements.YouTubePageElements;

public class YouTubePageActions extends YouTubePageElements{

	public YouTubePageActions(WebDriver driver) {
		super(driver);
		
	}
	public BookPageActions addToYouTube() throws InterruptedException {
			
		mapApp.click();
		Thread.sleep(3000);
	
		driver.switchTo().frame(f);
		Thread.sleep(3000);
		book.click();
		
		driver.switchTo().defaultContent();
	
		
			
	return new BookPageActions(driver);
	}

}
