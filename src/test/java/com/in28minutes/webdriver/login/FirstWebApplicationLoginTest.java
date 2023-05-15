package com.in28minutes.webdriver.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FirstWebApplicationLoginTest extends AbstractChromeWebDriverTest{
  @Test
  public void login() {
	  driver.get("https://www.abv.bg/");
	  
	  WebElement nameElement = driver.findElement(By.name("username"));
	  nameElement.sendKeys("****");
	  
	  WebElement passwordElement = driver.findElement(By.id("password"));
	  passwordElement.sendKeys("******");
	  
	  WebElement submitElement = driver.findElement(By.id("loginBut"));
	  submitElement.click();
	  
	  sleep(2);
  }
}
