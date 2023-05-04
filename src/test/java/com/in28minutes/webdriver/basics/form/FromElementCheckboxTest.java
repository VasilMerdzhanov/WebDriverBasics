package com.in28minutes.webdriver.basics.form;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FromElementCheckboxTest extends AbstractChromeWebDriverTest{
	
  
  @Test
  public void readFromACheckbox() {
	  driver.get("https://coreui.io/docs/forms/checks-radios/");
	  
	  WebElement checkElement = driver.findElement(By.id("flexCheckDefault"));
	  System.out.println(checkElement.isSelected());//false
	  assertFalse(checkElement.isSelected());
	  
	  WebElement checkElement2 = driver.findElement(By.id("flexCheckChecked"));
	  System.out.println(checkElement2.isSelected());//true
	  assertTrue(checkElement2.isSelected());
	  
  }
//  	@Test
//  	public void setAValueIntoCheckBoxElement() {
//	  driver.get("https://coreui.io/docs/forms/checks-radios/");
//	  
//	  WebElement checkElement = driver.findElement(By.className("form-check-label"));
//	  sleep(4);
//	  System.out.println(checkElement.isSelected());//false
//	  checkElement.click();
//	  sleep(4);
//  }

  	@Test
  	public void checkACheckBox() {
	  driver.get("https://coreui.io/docs/forms/checks-radios/");
	  
	  checkACheckBox("form-check-label");
	  checkACheckBox("form-check-label");
	  
	  sleep(3);
  	}
  	
  	@Test
  	public void unCheckACheckBox() {
	  driver.get("https://coreui.io/docs/forms/checks-radios/");
	  
	  unCheckACheckBox("form-check-label");
	  unCheckACheckBox("form-check-label");
	  sleep(3);
  	}
  	
  	private void checkACheckBox(String checkBoxName) {
  		WebElement checkElement = driver.findElement(By.className(checkBoxName));
  		boolean currentValue = checkElement.isSelected();
  		
  		if(currentValue == false) {
		  checkElement.click();
  		}
  	}
  	
	private void unCheckACheckBox(String checkBoxName) {
  		WebElement checkElement = driver.findElement(By.className(checkBoxName));
  		boolean currentValue = checkElement.isSelected();
  		
  		if(currentValue == true) {
		  checkElement.click();
  		}
  	}
}
