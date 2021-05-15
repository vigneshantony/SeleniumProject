package com.pom.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomcreate1 {
	
	public WebDriver driver;
	public Pomcreate1(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	
	}

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement move;
	public WebElement getMove() {
		return move;
	}
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
	private WebElement tshirt;
	public WebElement getTshirt() {
		return tshirt;
	}
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5")
     private WebElement cart;
	public WebElement getCart() {
		return cart;
	}

}
