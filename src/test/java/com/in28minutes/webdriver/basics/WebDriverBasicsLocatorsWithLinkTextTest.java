package com.in28minutes.webdriver.basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithLinkTextTest extends AbstractChromeWebDriverTest{
	/**@Test
	public void getAustralasiaLinkAndClickIt() {
		driver.get("https://www.msn.com/en-xl/");
		WebElement link = driver.findElement(By.linkText("AUSTRALASIA"));
		System.out.println(link.getAttribute("href")); //
		link.click();
		System.out.println(driver.getCurrentUrl()); //
		
	} **/
	/**@Test
	public void getAsiaLinkAndClickIt() {
		driver.get("https://www.msn.com/en-xl/");
		WebElement link = driver.findElement(By.linkText("ASIA"));
		System.out.println(link.getAttribute("href")); //https://www.msn.com/en-xl/asia
		link.click();
		System.out.println(driver.getCurrentUrl()); //https://www.msn.com/en-xl/asia
	}
	**/
	@Test
	public void getEuropeLinkAndClickIt() {
		driver.get("https://www.msn.com/en-xl/");
		WebElement link = driver.findElement(By.linkText("EUROPE"));
		System.out.println(link.getAttribute("href"));//https://www.msn.com/en-xl/europe
		link.click();
		System.out.println(driver.getCurrentUrl());//https://www.msn.com/en-xl/europe
	}
}
