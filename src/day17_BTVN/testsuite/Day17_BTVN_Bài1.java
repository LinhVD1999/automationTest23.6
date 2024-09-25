package automation.testsuite;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day17_BTVN_Bài1 extends CommonBase{
	@BeforeMethod
	public void openChrome()
	{
		driver = initChromeDriver(CT_PageURLs.URL_MEDIAMART);
	}
	

	@Test
	public void handleIframeMessenger()
	{
		scrollToElement(By.xpath("//div[@class='widget-preview--body']"));
		WebElement btnTinNhan = getElementPresentDOM(By.xpath("//div[@class='widget-preview--body']"));
		driver.switchTo().frame(btnTinNhan);
		click(By.xpath("//div[text()='Gửi tin nhắn']"));
		assertTrue(isElementVisibility(By.xpath("//div[text()='Gửi tin nhắn']")));
	}
	
	@Test
	public void handleIframeZalo()
	{
		waitAlertPeresent();
		scrollToElement(By.xpath("//div[@class='logo']"));
		WebElement btnZalo = getElementPresentDOM(By.xpath("//div[@class='logo']"));
		driver.switchTo().frame(btnZalo);
		click(By.xpath("//div[@class='logo']"));
	}
}

