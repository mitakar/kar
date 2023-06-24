package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoogleApp {
	public WebDriver driver = null;
	@Test
	public void win() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		
		WebElement search=driver.findElement(By.name("q"));
		search.click();
		
		WebElement googleApp = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		googleApp.click();
		
		WebElement frame = driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		
		WebElement googleMap = driver.findElement(By.xpath("//a[@href='https://maps.google.com/']"));
		googleMap.click();
		WebElement googleMapSearch = driver.findElement(By.name("q"));
		googleMapSearch.sendKeys("Broomall,PA");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		WebElement googleMapApp = driver.findElement(By.xpath("//a[@title='Google apps']"));
		googleMapApp.click();
		
		frame = driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		WebElement news = driver.findElement(By.xpath("//a[@href='https://news.google.com']"));
		//news.click();
		actions.click(news);
		WebElement s = driver.findElement(By.xpath("//input[@type='text']"));
		
		s.sendKeys("LatestNews,PA");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement googleMapApp1 = driver.findElement(By.xpath("//a[@title='Google apps']"));
		googleMapApp1.click();
		frame = driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement youtube = driver.findElement(By.xpath("//a[@href='https://www.youtube.com\']"));
		//youtube.click();
		Thread.sleep(4000);
		 actions.click(youtube);
		driver.findElement(By.id("search-input")).sendKeys("Bangla Book");
		Thread.sleep(2000);
	  
	    
	    Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement googleMapApp2 = driver.findElement(By.xpath("//a[@title='Google apps']"));
		googleMapApp2.click();
		frame = driver.findElement(By.name("app"));
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		WebElement photos = driver.findElement(By.xpath("//a[@href='https://photos.google.com/']"));
		Thread.sleep(2000);
		actions.click(photos).build().perform();
		Thread.sleep(4000);
	}
	
}
