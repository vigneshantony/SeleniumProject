package com.selen.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	
		
		 public static void main(String[] args) throws InterruptedException  {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\vignesh\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		 
				driver.get("http://demo.automationtesting.in/Alerts.html");
				
				WebElement simple = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
				simple.click();
				
				Alert a = driver.switchTo().alert();
				Thread.sleep(2000);
		        a.accept();
				
				
		
	}
	
	
}
