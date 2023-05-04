package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithCssSelectorTest extends AbstractChromeWebDriverTest{
	
//	@Test
//	public void testCssSelectorForTables() {
//		driver.get("https://www.theguardian.com/football/tables");
//		WebElement browserRow1 = driver.findElement(By.cssSelector("#article > div > div > div.content__main-column > div:nth-child(4) > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5)"));
//		assertEquals(browserRow1.getText(),"3");
//	}
	
//	$$("#overview > div.example > div.deque-table-sortable-group > table > thead > tr > th:nth-child(2) > button")
//	[button.sortableColumnLabel]0: button.sortableColumnLabellength: 1[[Prototype]]: Array(0)
//	$$("#overview > div.example > div.deque-table-sortable-group > table > tbody > tr:nth-child(1) > td:nth-child(2)")
//	[td]
	
	@Test
	public void testCssSelectorForSortingAndCheckingFirstRow() {
		driver.get("https://dequeuniversity.com/library/aria/table-sortable");
		
		WebElement headerBrowser = driver.findElement(By.cssSelector("#overview > div.example > div.deque-table-sortable-group > table > thead > tr > th:nth-child(2) > button"));
		headerBrowser.click();
		
		WebElement firstRow = driver.findElement(By.cssSelector("#overview > div.example > div.deque-table-sortable-group > table > tbody > tr:nth-child(1) > td:nth-child(2)"));
		assertEquals(firstRow.getText(),"Caitlin");
	}
}
