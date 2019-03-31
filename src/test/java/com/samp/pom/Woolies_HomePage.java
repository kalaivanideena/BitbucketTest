package com.samp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Woolies_HomePage {

	static WebDriver Driver;
	
	@FindBy(xpath="//div[@id='header-panel']/wow-header/wow-category-header/div/nav/a[2]")
	private WebElement fruits;

	public WebElement getFruits() {
		return fruits;
	}
	
}
