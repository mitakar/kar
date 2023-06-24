package common;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Common {
	
	public WebDriver driver = null;
	public Common(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clear( WebElement element ) throws InterruptedException {
		element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(5000);
		element.sendKeys(Keys.BACK_SPACE);
		
	}
	public void ClearAndFillText(WebElement element ,String text) {
		element.clear();
		element.sendKeys(text);
	}
	/*public void windowHandles(WebElement element) {
		Set<String>listofWinId = driver.getWindowHandles();
		Iterator<String>it = listofWinId.iterator();
		String mainwin = it.next();
		String wind1 = it.next();
		String wind2 =it.next();
	//}*/
}
