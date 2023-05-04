package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithXPathSelectorTest extends AbstractChromeWebDriverTest{
	
	@Test
	public void testXPathSelectorForTableId() {
		driver.get("https://dequeuniversity.com/library/aria/table-sortable");
		//$x("//*[@id='overview']/div[2]/div[1]/table/thead/tr/th[2]/button")
		WebElement headerBrowser = driver.findElement(By.xpath("//*[@id='overview']/div[2]/div[1]/table/thead/tr/th[2]/button"));
		headerBrowser.click();
		//$x("//*[@id='overview']/div[2]/div[1]/table/tbody/tr[1]/td[1]")
		WebElement firstRow = driver.findElement(By.xpath("//*[@id='overview']/div[2]/div[1]/table/tbody/tr[1]/td[1]"));
		assertEquals(firstRow.getText(),"Caitlin");
	}
}
