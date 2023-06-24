package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.Common;

public class BookPageElements extends Common{
	
	public BookPageElements(WebDriver driver) {
	super(driver);
	}
	@FindBy(name="q")
	public WebElement googlMap;
	
	@FindBy(id ="oc-search-input")
	public WebElement bookSearch;
	
	@FindBy(name="search_query")
	public WebElement youTubeSearch;
	
}
