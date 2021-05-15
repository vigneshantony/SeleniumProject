package com.base_class.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;
	
	 public static  WebDriver BrowserLaunch(String Browser) {

		 if (Browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver", 
					 "C:\\Users\\vignesh\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
				
		}else {
			System.out.println("invalid");
		}
		 
		 driver.manage().window().maximize();
		 
		 return driver;
		 
	}
	
	public static void launchurl(String Url) {
     driver.get(Url);
		
	}
	
	public static void Touch(WebElement element) {
     element.click();
		
	}
	
	public static void enterinput(WebElement element , String str) {
     element.sendKeys(str);
	}
	
	public static String currenturl() {
		String currentUrl=null;
		currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
	    return currentUrl;
	}
	
     public static String getTitle() {
    	 String title = null;
      title = driver.getTitle();
      return title; 
	}
	
	public static void navigateto(String url) {

		driver.navigate().to(url);
		
	}
	
	public static void navigateforward() {

		driver.navigate().forward();
	}
	
	public static void navigateback() {

		driver.navigate().back();
	}
	
	public static void navigaterefresh() {

		driver.navigate().refresh();
	}
	
	public static void getText(WebElement  element) {
     System.out.println(element.getText());
	}
	
	public static void takescreenshot() throws IOException {
     TakesScreenshot ts = (TakesScreenshot)driver;
     File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\vignesh\\eclipse-workspace\\Selenium\\Screenshot//vignesh.png");
		FileUtils.copyFile(source, destination);
	}
	
	 public static void movetoaction(WebElement element) {
      Actions ac = new Actions(driver);
		 ac.moveToElement(element).build().perform();
	}
	
	 public static void clickonaction(WebElement element) {
      Actions ac2 = new Actions(driver);
		 ac2.click(element).build().perform();
		 
	}
	 public static void doubleclickaction(WebElement element) {
      Actions ac3 = new Actions(driver);
	 ac3.doubleClick(element).build().perform();	 
	 }
	 
	 public static void rightclickaction(WebElement element ) {
     Actions ac4 = new Actions(driver);
     ac4.contextClick(element).build().perform();
	}
	 
	 public static void close() {
     driver.close();
	}
	 
	 public static void quit() {
     driver.quit();
	}
	 
	 public static void dropdown(WebElement element , String str) {
     
		 Select s = new Select(element);
	     s.selectByValue(str);
	 }
	 
	 
	 
	 
}	
	
	
		
		
		
	
	
	
	


