package com.pom.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.base_class.java.Base;


public class Automation extends Base {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	BrowserLaunch("chrome");
	launchurl("http://automationpractice.com/index.php");
	
	Pomcreate pc = new Pomcreate(driver);
	Touch(pc.getSign());
	enterinput(pc.getMail(),"vicky123@gmail.com");
	
	enterinput(pc.getPass(),"123456");
	
	Touch(pc.getCheckin());
	
	Pomcreate1 pc1 = new Pomcreate1(driver);
	movetoaction(pc1.getMove());
	
	clickonaction(pc1.getTshirt());
	
	
	clickonaction(pc1.getCart());
	
	
	
	
	WebElement add = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	add.click();
	
	Thread.sleep(2000);
	
	WebElement check = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	check.click();
	
	WebElement next = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	next.click();
	
	WebElement next1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	next1.click();
	
	WebElement dot = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
	dot.click();
	
	WebElement last = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	last.click();
	
	
	WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
	pay.click();
	
	
	WebElement lasting = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
	lasting.click();
	
	
	takescreenshot();
	
	
	
	
	
	
	
	}
	

}
