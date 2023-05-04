package com.in28minutes.webdriver.basics.form;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementSelectTest extends AbstractChromeWebDriverTest{
  
  @Test
  public void readValueOfSelectBox() {
	  driver.get("https://coreui.io/docs/forms/select/");
	  WebElement selectElement = driver.findElement(By.className("form-select"));
	  Select select = new Select(selectElement);
	  System.out.println(select.isMultiple());
	  System.out.println(select.getFirstSelectedOption().getText());
  }
  
  @Test
  public void readValueOfMultileSelectBox() {
	  driver.get("https://coreui.io/docs/forms/select/");
	  WebElement selectElement = driver.findElement(By.cssSelector("body > div.wrapper.flex-grow-1 > div.container-lg.my-md-4.flex-grow-1 > main > div.docs-content.ps-lg-4 > div:nth-child(12) > select"));
	  Select select = new Select(selectElement);
	  System.out.println(select.isMultiple());
	  System.out.println(select.getFirstSelectedOption().getText());
	  for (WebElement element : select.getAllSelectedOptions()) {
		System.out.println(element.getText());
	}  
  }
  
  @Test
  public void setValueIntoSelectBox() {
	  driver.get("https://coreui.io/docs/forms/select/");
	  WebElement selectElement = driver.findElement(By.className("form-select"));
	  Select select = new Select(selectElement);
	  select.selectByIndex(2);
	  sleep(4);
	  select.selectByValue("1");
	  sleep(4);
	  select.selectByVisibleText("Three");
	  sleep(4);
	  System.out.println(select.isMultiple());
	  System.out.println(select.getFirstSelectedOption().getText());
  }
  
  @Test
  public void setValueIntoMultipleSelectBox() {
	  driver.get("https://coreui.io/docs/forms/select/");
	  WebElement selectElement = driver.findElement(By.cssSelector("body > div.wrapper.flex-grow-1 > div.container-lg.my-md-4.flex-grow-1 > main > div.docs-content.ps-lg-4 > div:nth-child(12) > select"));
	  Select select = new Select(selectElement);
	  select.selectByIndex(2);
	  sleep(4);
	  select.selectByValue("1");
	  sleep(4); 
	  select.selectByVisibleText("Three");
	  sleep(4);
	  System.out.println(select.isMultiple());
	  System.out.println(select.getFirstSelectedOption().getText());
  }
}
