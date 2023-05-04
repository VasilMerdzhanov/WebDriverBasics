package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsPerformanceTest extends AbstractChromeWebDriverTest{
	
	@Test
	public void testCssSelectorForMultipleTableId() {
		driver.get("https://dequeuniversity.com/library/aria/table-sortable");
		//#overview > div.example > div.deque-table-sortable-group > table > tbody > tr:nth-child(1) > td:nth-child(2)
		WebElement tableTBody = driver.findElement(
				By.cssSelector("#overview > div.example > div.deque-table-sortable-group > table > tbody"));
		WebElement browserRow1 = 
				tableTBody.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)"));
		WebElement browserRow2 = 
				tableTBody.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)"));
		WebElement browserRow3 = 
				tableTBody.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)"));
		assertEquals(browserRow1.getText(),"Myk");
		assertEquals(browserRow2.getText(),"Hannah");
		assertEquals(browserRow3.getText(),"Salim");
	}
}
