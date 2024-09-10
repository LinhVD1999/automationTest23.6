package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_BTVN_Bài3 extends CommonBase{
	@BeforeMethod
	public void openChorme()
	{
		driver = initChromeDriver(CT_PageURLs.URL_GURU99);
	}

	@Test
	public void verifyAlertMessage()
	{
		click(By.xpath("//a[normalize-space()='Selenium']"));
		click(By.xpath("//a[normalize-space()='Delete Customer Form']"));
		WebElement txtCusId = driver.findElement(By.name("cusid"));
		txtCusId.sendKeys("111");
		click(By.xpath("//input[@name='submit']"));
		waitAlertPeresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Do you really want to delete this Customer?");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}
}
