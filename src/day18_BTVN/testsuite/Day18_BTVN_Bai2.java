package automation.testsuite;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day18_BTVN_Bai2 extends CommonBase {
	@BeforeMethod
	@Parameters("browser")
	public void openChorme(@Optional("firefox") String browser)
	{
		setupDriver(browser);
		driver.get(CT_PageURLs.URL_BEPANTOAN);
		//driver = initChromeDriver(CT_PageURLs.URL_BEPANTOAN);
	}
	
	@Test
	public void handleMessenger()
	{
		click(By.xpath("(//span[text()='Chat với chúng tôi'])[1]"));
		pause(3000);
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String window:windows) {
			if(!mainWindow.equals(windows)) {
				driver.switchTo().window(window);
			}
		}
		pause(5000);
		assertTrue(isElementVisibility(By.xpath("//h2[text()='Kết nối với những người bạn yêu quý.']")));
	}
	
	@AfterMethod
	public void closeChrome()
	{
		driver.close();
	}
}
