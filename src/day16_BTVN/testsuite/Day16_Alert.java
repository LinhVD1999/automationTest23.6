package automation.testsuite;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_Alert extends CommonBase{
	@BeforeMethod
	public void openChorme()
	{
		driver = initChromeDriver(CT_PageURLs.URL_AUTOMATIONTESTING);
	}
	
	@Test(priority = 1)
	public void verifyAlertMessage()
	{
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[@class='btn btn-info']"));
		waitAlertPeresent();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Please enter your name");
	}
	
	@Test(priority = 2)
	public void pressOkAlert()
	{
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[@class='btn btn-info']"));
		waitAlertPeresent();
		driver.switchTo().alert().sendKeys("Class 23.06");
		driver.switchTo().alert().accept();
		WebElement hellolabel = getElementPresentDOM(By.id("demo1"));
		assertEquals(hellolabel.getText(), "Hello Class 23.06 How are you today");
	}
	@Test(priority = 3)
	public void pressCancelAlert()
	{
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[@class='btn btn-info']"));
		waitAlertPeresent();
		driver.switchTo().alert().sendKeys("Class 23.06");
		pause(5000);
		driver.switchTo().alert().dismiss();
		assertFalse(isElementVisibility(By.id("demo1")));
		//WebElement hellolabel = getElementPresentDOM(By.id("demo1"));
		//assertEquals(hellolabel.getText(), null);
	}
}
