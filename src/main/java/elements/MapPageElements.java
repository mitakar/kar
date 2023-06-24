package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class MapPageElements extends Common {
	
	
	public MapPageElements(WebDriver driver) {
		super(driver);
		
	}


	@FindBy(xpath="//a[@title='Google apps']")
	public WebElement googleMap_H;
	
	@FindBy(name="app") 
	public WebElement f;
	
	//@FindBy(name="q")
	//public WebElement mapSearch;
	
	
	@FindBy(xpath="//a[@href='https://www.youtube.com']") 
	public WebElement youTube;

}
