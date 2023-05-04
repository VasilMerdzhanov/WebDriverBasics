package com.in28minutes.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class WebDriverBasicsLocatorsWithNameTest extends AbstractChromeWebDriverTest {
	
	/**  @Test
	  public void f() {
	  
	  
	  //get the login page http://..]
	  driver.get("https://www.livescore.com/en/");
	  
	  //assert*(get) the title
	  assertEquals("LiveScore | Live Football Scores, Fixtures & Results",
			  driver.getTitle()); 
  }
	**/ 
	  @Test
	  public void testGetInformationAboutName() {
		 driver.get("https://www.abv.bg/");
		 WebElement nameElement = driver.findElement(By.name("username"));
		 System.out.println(nameElement.getTagName()); //input
		 System.out.println(nameElement.getAttribute("type")); //text
		 System.out.println(nameElement.getAttribute("value")); //EMPTY
	  }
	  
	@Test
	 public void testGetInformationAboutPassword() {
		driver.get("https://www.abv.bg/");
		WebElement nameElementPass = driver.findElement(By.name("password"));
		System.out.println(nameElementPass.getTagName()); //input
		System.out.println(nameElementPass.getAttribute("type")); //password
		System.out.println(nameElementPass.getAttribute("value")); //EMPTY
	}
	@Test
	 public void testGetInformationAboutSubmitButton() {
		driver.get("https://www.abv.bg/");
		WebElement submitElement = driver.findElement(By.id("loginBut"));
		System.out.println(submitElement.getTagName()); //input
		System.out.println(submitElement.getAttribute("type")); //submit
		System.out.println(submitElement.getAttribute("value")); //EMPTY
	  }
}
