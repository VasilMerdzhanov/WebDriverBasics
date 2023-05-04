package com.in28minutes.webdriver.basics.form;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FromElementRadioButtonTest extends AbstractChromeWebDriverTest{
	
  
//	@Test
//	public void readFromARadioButton() {
//		driver.get("https://coreui.io/docs/forms/checks-radios/");
//
//		List<WebElement> options = driver.findElements(By.name("flexRadioDefault"));
//		for(WebElement option:options) {
//			System.out.println(option.getAttribute("value") + " " + option.isSelected());
//		}
//	}
	
//	@Test
//	public void readFromARadioButtonWithAFrameworkMethod() {
//		driver.get("https://coreui.io/docs/forms/checks-radios/");
//		
//		System.out.println(getSelectedRadioButtonValue("exampleRadios"));
//		System.out.println(getSelectedRadioButtonValue("flexRadioDefault"));
//	}

	@Test
	public void setValueForRadioButton() {
		driver.get("https://coreui.io/docs/forms/checks-radios/");
		List<WebElement> options = driver.findElements(By.name("exampleRadios"));
		
		for(WebElement option:options) {
			if(option.getAttribute("value").equals("option2")) {
				option.click();
			}
		}
		sleep(4);
	}
	
	@Test
	public void setValueForRadioButtonWithAFrameworkMethod() {
		driver.get("https://coreui.io/docs/forms/checks-radios/");
		setRadioButtonToValue("exampleRadios", "option2");
		
	}

	private void setRadioButtonToValue(String radioButtonName, String valueToSelect) {
		List<WebElement> options = driver.findElements(By.name(radioButtonName));
		for(WebElement option:options) {
			if(option.getAttribute("value").equals(valueToSelect)) {
				option.click();
			}
		}
	}
	
	private String getSelectedRadioButtonValue(String name) {
		
		List<WebElement> options = driver.findElements(By.name(name));
		
		for(WebElement option:options) {
			if(option.isSelected()) {
				return option.getAttribute("value");
			}
		}
		
		return null;
	}
}
