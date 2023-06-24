package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class HomePageElements extends Common{
	
	
	public HomePageElements(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[@aria-label='Google apps']") 
	public WebElement googleApp_H;
	
	@FindBy(name="app") 
	public WebElement f;
	
	@FindBy(xpath="//a[@href='https://maps.google.com/']") 
	public WebElement googlMap;
	
}
