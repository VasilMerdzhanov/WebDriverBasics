package com.in28minutes.webdriver.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithTagTest extends AbstractChromeWebDriverTest{
	@Test
	public void getDetailsAboutATag() {
		driver.get("https://www.abv.bg/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for(WebElement element: elements) {
		System.out.println(element.getAttribute("class"));//fl
		System.out.println(element.getAttribute("href"));//https://chrome.google.com/webstore/detail/abv-notifier/glkfpmcniebkbeakjdpobddpjghbapec
		sleep(1);
		}
	}
}
