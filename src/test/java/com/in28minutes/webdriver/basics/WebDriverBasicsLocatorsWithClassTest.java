package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithClassTest extends AbstractChromeWebDriverTest{
	
	@Test
	public void testGetInformationAboutClass() {
		driver.get("https://www.msn.com/en-xl/");
		WebElement classElement = driver.findElement(By.className("logohover"));
		assertEquals(classElement.getText(),"");
	}
	
	@Test
	public void testClassElement() {
		driver.get("https://www.msn.com/en-xl/");
		List<WebElement> classElements = driver.findElements(By.className("stripenav"));
		for(WebElement element: classElements) {
		System.out.println(element.getText());
		}
	}
}
