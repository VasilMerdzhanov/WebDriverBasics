package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementTextTest extends AbstractChromeWebDriverTest{
	
//  @Test
//  public void setASpecificValueIntoTextElement() {
//	  driver.get("https://www.msn.com/en-xl/?AR=3");
//	  WebElement textElement = driver.findElement(By.id("q"));
//	  sleep(2);
//	  textElement.sendKeys("Lazi Buba Lazi");
//	  sleep(2);
//  }
  
//  @Test
//  public void writeAndReadValueFromTextArea() {
//	  driver.get("https://www.msn.com/en-xl/?AR=3");
//	  WebElement textElement = driver.findElement(By.id("q"));
//	  sleep(2);
//	  textElement.sendKeys("Lazi Buba Lazi");
//	  sleep(2);
//	  assertEquals(textElement.getAttribute("value"), "Lazi Buba Lazi");
//  }
  
  @Test
  public void writeAndReadValueFromTextArea2() {
	  driver.get("https://bulma.io/documentation/form/textarea/");
	  WebElement textArea = driver.findElement(By.className("is-info"));
	 
	  textArea.sendKeys("First Row");
	  textArea.sendKeys("\n");
	  textArea.sendKeys("Second Row");
	  
	  System.out.println(textArea.getAttribute("value"));
	  assertEquals(textArea.getAttribute("value"), "First Row\nSecond Row");
  }
}
