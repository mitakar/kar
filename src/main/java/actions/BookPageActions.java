package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import common.Common;
import elements.BookPageElements;

public class BookPageActions extends BookPageElements {

	
	public BookPageActions(WebDriver driver) {
		super(driver);	
	}
	public  void addToBook() throws InterruptedException {
		
		Set<String>listofWinId = driver.getWindowHandles();
		Iterator<String>it = listofWinId.iterator();
		
		String mainwin = it.next();
		String wind1 = it.next();
		String wind2 =it.next();
		
		driver.switchTo().window(mainwin);
		googlMap.sendKeys("Broomall,PA");
		Thread.sleep(5000);
		//googlMap.clear();
		//googlMap.sendKeys("JacksonVill");
		ClearAndFillText(googlMap, "JacksonVill");
		Thread.sleep(5000);
		
		driver.switchTo().window(wind1);
		Thread.sleep(5000);
		bookSearch.sendKeys("TomAndJerry");
		Thread.sleep(5000);
		//bookSearch.clear();
		//bookSearch.sendKeys("Gitangoli");
		ClearAndFillText(bookSearch, "Gitangoli");
		
		driver.switchTo().window(wind2);
		Thread.sleep(5000);
		youTubeSearch.sendKeys("BanglaNatok");
		Thread.sleep(5000);
		//youTubeSearch.clear();
		//youTubeSearch.sendKeys("BanglaSong");
		ClearAndFillText(youTubeSearch, "BanglaSong");
	}
}
