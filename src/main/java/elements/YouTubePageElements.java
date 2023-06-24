package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class YouTubePageElements extends Common{


	public YouTubePageElements(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//a[@title='Google apps']") 
	public WebElement mapApp;
	
	@FindBy(name="app") 
	public WebElement f;
	
	@FindBy(xpath="//a[@href='https://books.google.com/']") 
	public WebElement book;
	
}
	
	
	
