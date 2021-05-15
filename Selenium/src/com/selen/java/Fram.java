package com.selen.java;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fram {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vignesh\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btn.click();
		
		try {
			WebElement day = driver.findElement(By.id("day"));
			Select s = new Select(day);
			s.selectByIndex(25);
			
		} catch (NoSuchElementException e) {

			System.out.println("handled NoSuchExceptionFound");
		
		}
		
		
		

		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("4");
		
		
           WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2015");
		
		
	}
	
	
	
	
	

}
