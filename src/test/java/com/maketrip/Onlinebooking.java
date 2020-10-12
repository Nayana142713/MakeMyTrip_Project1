package com.maketrip;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Onlinebooking {
	
	static WebDriver driver;
	
	
	 @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "F:\\Selinium\\new version\\chromedriver.exe");
			WebDriver driver =new ChromeDriver() ;
			driver.manage().window().maximize();
			 driver.get("https://www.makemytrip.com");
	  }
	 
	 
	 
  @Test
  public void Test() throws InterruptedException {
	  
	 // driver.get("https://www.makemytrip.com");
		//Thread.sleep(2000);
	   // driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]/i")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[6]")).click();
		
		
		WebElement input=driver.findElement(By.id("username"));
		input.sendKeys("lechukarthika95@gmail.com");
		//Thread.sleep(6000);
		
		WebElement Continue=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
		Continue.click();
		
		WebDriverWait wait =new WebDriverWait (driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=password]")));
		
		
		WebElement inputpassword=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	    inputpassword.sendKeys("Sep@1234");
		
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button"));
		signin.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='   menu_Hotels ']/a")));
		
		//WebElement HotelBuild=driver.findElement((By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[1]")));
		WebElement Hotel=driver.findElement((By.xpath("//li[@class='   menu_Hotels ']/a")));
		Hotel.click();
		
		WebElement city=driver.findElement(By.id("city"));
		city.click();
		Thread.sleep(2000);
			
		WebElement displaymessage=driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-2\"]/div/div/div/p[1]"));
		displaymessage.click();
		
		WebElement Checkindate=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]"));
		Checkindate.click();
		
		WebElement Checkoutdate=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[1]"));
		Checkoutdate.click();
		
		WebElement room=driver.findElement(By.id("guest"));
		room.click();
		
		WebElement addroom=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/button[1]"));
		addroom.click();
		
		WebElement guest=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[3]"));
		guest.click();
		
		WebElement apply=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div/div[4]/div[1]/div[2]/button[2]"));
		apply.click();
		
		WebElement search=driver.findElement(By.id("hsw_search_button"));
		search.click();	
		Thread.sleep(6000);
		
		 WebElement survey1=driver.findElement(By.xpath("//*[@id=\"survey-close-div\"]"));
	     survey1.click();
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		WebElement slider =driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_price_per_night\"]/div[2]/div[2]/div/span[1]/div"));
		//wait.until(ExpectedConditions.elementToBeClickable(slider));
		action.moveToElement(slider).click().dragAndDropBy(slider, +50, 0).build().perform();
		//Thread.sleep(5000);
			

		Actions loca = new Actions(driver);
		//WebElement select=driver.findElement(By.xpath("//*[@id=\"_Hlisting_area\"]/div[3]/div[1]/div/p/span"));
	    // select.click();
		WebElement locality=driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_locality\"]/div/div[1]/ul/li[1]/span/label"));
		loca.moveToElement(locality);
		loca.click().perform();
		Thread.sleep(6000);
		
				
      // String parent = driver.getWindowHandle();
		
		//Set<String> pops=driver.getWindowHandles();
		//{
			//Iterator<String> it =pops.iterator();
			//while (it.hasNext()) {
				//String popupHandle=it.next().toString();
				//if(!popupHandle.contains(parent))
				//{
				//	driver.switchTo().window(popupHandle);
				//	System.out.println("Pop up Title: "+ driver.switchTo().window(popupHandle).getTitle());
				//	driver.close();
				//}
			//}
		//}
		//driver.switchTo().alert().sendKeys("no");
		
		 WebElement survey=driver.findElement(By.xpath("//*[@id=\"survey-close-div\"]"));
	     survey.click();
	    // driver.findElement(By.xpath("//*[@id=\"surveyResponseFormId\"]/fieldset/div[2]/button")).click();
		 Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"survey-close-div\"]/i")).click();
		// Thread.sleep(3000);
		
		Actions star = new Actions(driver);
		WebElement stars=driver.findElement(By.xpath("//*[@id=\"hlistpg_fr_star_category\"]/ul/li[3]/span[1]/label"));
		star.moveToElement(stars);
		star.click().perform();
		Thread.sleep(2000);
		
			
		WebElement selectedhotel=driver.findElement(By.id("htl_id_seo_20160331155040970"));
		selectedhotel.click();	
		
		String parent1 = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.xpath("//*[@id=\"detpg_headerright_book_now\"]")).click() ;
		
		//Traveller Info
		
		Select select =new Select(driver.findElement(By.id("title")));
		select.selectByVisibleText("Ms");
		driver.findElement(By.id("fName")).sendKeys("Nayana");
		driver.findElement(By.id("lName")).sendKeys("Manoharan");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/a"));
		
		driver.findElement(By.id("CC_tab")).click();
		Thread.sleep(3000);
		
		WebElement cardno=driver.findElement(By.id("PAYMENT_cardNumber"));
		cardno.sendKeys("574896123451567");
		WebElement cardname=driver.findElement(By.id("PAYMENT_nameOnCard"));
		cardname.sendKeys("Nayana Manoharan");
		Select month = new Select(driver.findElement(By.id("PAYMENT_expiryMonth")));
		month.selectByValue("12");
		Select Year = new Select(driver.findElement(By.id("PAYMENT_expiryYear")));
		Year.selectByValue("2022");
		driver.findElement(By.id("PAYMENT_cvv")).sendKeys("321");
		driver.findElement(By.id("//*[@id=\"widgetPayBtn\"]/span")).click();		
		
}

  
  @AfterMethod
  public void afterMethod() {
  }

 

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
