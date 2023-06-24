package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import actions.BookPageActions;
import actions.MapPageActions;
import actions.YouTubePageActions;

public class MainTest extends BaseTest{
	
	MapPageActions mapPageActions = null;
	YouTubePageActions youTubePageActions=null;
	BookPageActions bookPageActions= null;
	
	@Test
	public void google() throws InterruptedException {
		
		mapPageActions = homePageActions.addToHome();
		
		Assert.assertEquals(driver.getTitle(), "Google Maps");
	}
	@Test(dependsOnMethods = "google")
	public void youTube() throws InterruptedException {
		youTubePageActions = mapPageActions.addToMap();
	}
	
	@Test(dependsOnMethods = "youTube")
	public void book() throws InterruptedException {
		bookPageActions = youTubePageActions.addToYouTube();
		
	}
	  @Test(dependsOnMethods = "book")
	public void books() throws InterruptedException {
	bookPageActions.addToBook();
	}
}
