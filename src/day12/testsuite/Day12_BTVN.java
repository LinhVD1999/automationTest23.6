package automation.testsuite;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_BTVN extends CommonBase{
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASYS4);
	}
	@Test
	public void case1_CheckRadioSuccessfully()
	{
		WebElement hostingyes = driver.findElement(By.xpath("//input[@value='yes']"));
		if(hostingyes.isSelected())
		{
			hostingyes.click();
			assertTrue(hostingyes.isSelected());
		}
		WebElement hostingno = driver.findElement(By.xpath("//input[@value='no']"));
		if(hostingno.isSelected())
		{
			hostingno.click();
			assertTrue(hostingno.isSelected());
			assertFalse(hostingyes.isSelected());
		}
	}
	@Test
	public void case2_Dropdownlistsize()
	{
		Select dropdownSate = new Select(driver.findElement(By.name("state")));
		//Case 1: kiem tra size cua dropdownlist la 52
		assertEquals(dropdownSate.getOptions().size(),52); 
	}
	@Test
	public void case3_Dropdownlistselect()
	{
		Select dropdownSate = new Select(driver.findElement(By.name("state")));
		//Case 2: chon Florida, kiem tra gia tri sau khi chon
		dropdownSate.selectByVisibleText("Florida");
		assertEquals(dropdownSate.getFirstSelectedOption().getText(),"Florida");	
	}
	@Test
	public void case4_Dropdownlistmultiple()
	{
		Select dropdownSate = new Select(driver.findElement(By.name("state")));
		assertFalse(dropdownSate.isMultiple());
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
