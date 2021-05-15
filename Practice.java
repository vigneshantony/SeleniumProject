package com.selen.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vignesh\\eclipse-workspace\\Selenium\\Drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement mail = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[1]"));
		mail.sendKeys("vicky123@gmail.com");
		
		WebElement create = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		create.click();
		
		Thread.sleep(5000);
		
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"id_gender1\"][1]"));
		gender.click();
		
		WebElement fname = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		fname.sendKeys("vignesh");
		
		WebElement lname = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		lname.sendKeys("antony");
		
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		password.sendKeys("123456");
		
		
		WebElement date = driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select s = new Select(date);
		s.selectByValue("11");
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select s1 = new Select(month);		
		s1.selectByIndex(5);
		
		WebElement year = driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select s2 = new Select(year);
		s2.selectByValue("2010");
		
		Thread.sleep(5000);
		WebElement option = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
		option.click();
		
		WebElement fstname = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		fstname.sendKeys("vicky");
		
		WebElement scdname = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		scdname.sendKeys("antony");
		
		WebElement cmp = driver.findElement(By.xpath("//*[@id=\"company\"]"));
		cmp.sendKeys("infotech");
		
		WebElement add = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		add.sendKeys("no 17 jayalakshmi street , ashok nagar , near infotech, po box no. 600061");
		
		WebElement add2 = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
		add2.sendKeys("apartment no 15, block 12");
		
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("new jersey");
		
		WebElement state = driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		Select st = new Select(state);
		st.selectByIndex(4);
		
		WebElement code = driver.findElement(By.xpath("//*[@id=\"postcode\"]"));
		code.sendKeys("00000");
		
		WebElement country = driver.findElement(By.xpath("//*[@id=\"id_country\"]"));
		Select ct = new Select(country);
		ct.selectByIndex(1);
		
		WebElement additional = driver.findElement(By.xpath("//*[@id=\"other\"]"));
		additional.sendKeys("no specification");
		
		WebElement hphone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		hphone.sendKeys("9003037796");
		
		WebElement pphone = driver.findElement(By.xpath("//*[@id=\"phone_mobile\"]"));
		pphone.sendKeys("9940874870");
		
		WebElement reference = driver.findElement(By.xpath("//*[@id=\"alias\"]"));
		reference.sendKeys("no specificity");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		button.click();
		
		
	}
	
	
	

}
