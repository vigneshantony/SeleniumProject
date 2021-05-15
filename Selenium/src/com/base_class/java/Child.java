package com.base_class.java;

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

public class Child extends Base{
	
	public static void main(String[] args) throws InterruptedException, IOException  {
		

		BrowserLaunch("chrome");
		
		launchurl("http://automationpractice.com/index.php");
		
		
	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
	Touch(sign);
	
	WebElement mail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	enterinput(mail,"vicky123@gmail.com");
	
	WebElement pasword = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
	enterinput(pasword,"123456");
	
	WebElement in = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
	Touch(in);
	
	
	WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
	Actions act = new Actions(driver);
	act.moveToElement(women).build().perform();
	
	
	WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
	Actions a = new Actions(driver);
	a.moveToElement(tshirt).click().build().perform();
	
	Thread.sleep(4000);
	
	WebElement cart = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
	Actions at= new Actions(driver);
	at.moveToElement(cart).click().build().perform();
	
	
	
	
	WebElement add = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
	Touch(add);
	
	Thread.sleep(2000);
	
	WebElement check = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
	Touch(check);	
	WebElement next = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
	Touch(next);
	
	WebElement next1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
	Touch(next1);
	
	WebElement dot = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
	Touch(dot);
	
	WebElement last = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
	Touch(last);
	
	
	WebElement pay = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
	Touch(pay);
	
	
	WebElement lasting = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
	Touch(lasting);
	
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\vignesh\\eclipse-workspace\\Selenium\\Screenshot.png");
	
	FileUtils.copyFile(source, destination);

}
}