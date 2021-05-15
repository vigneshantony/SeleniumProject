package com.pom.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomcreate {

	public WebDriver driver;
	public Pomcreate(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	
	}
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement sign;
	public WebElement getSign() {
		return sign;
	}
	
	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement mail;
	public WebElement getMail() {
		return mail;
	}
	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement checkin;
	public WebElement getCheckin() {
		return checkin;
	}
	
	
	
}
