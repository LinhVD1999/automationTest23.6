package automation.testsuite;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_RadioButton extends CommonBase{
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASYS2);
	}
	@Test
	public void case1_CheckDefaultValue()
	{
		WebElement rdoMale1 = driver.findElement(By.xpath("//input[@name='gender' and @value='Male']"));
		assertFalse(rdoMale1.isSelected());
		
		WebElement rdoMale2 = driver.findElement(By.xpath("//input[@name='gender' and @value='Female']"));
		assertFalse(rdoMale2.isSelected());
	}
	@Test
	public void case2_CheckRadioSuccessfully()
	{
		WebElement age0To5 = driver.findElement(By.xpath("//input[@value='0 - 5']"));
		if(age0To5.isSelected())
		{
			age0To5.click();
			assertTrue(age0To5.isSelected());
		}
		
		WebElement age5To15 = driver.findElement(By.xpath("//input[@value='5 - 15']"));
		if(age5To15.isSelected())
		{
			age5To15.click();
			assertTrue(age5To15.isSelected());
			assertFalse(age0To5.isSelected());
		}
		
		WebElement age15To50 = driver.findElement(By.xpath("//input[@value='15 - 50']"));
		if(age5To15.isSelected())
		{
			age5To15.click();
			assertTrue(age15To50.isSelected());
			assertFalse(age5To15.isSelected());
			assertFalse(age0To5.isSelected());
		}
	}
}
