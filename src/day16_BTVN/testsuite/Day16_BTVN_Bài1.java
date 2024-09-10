package automation.testsuite;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day14_BTVN_EditPageFactory;
import automation.page.LoginPage;

public class Day16_BTVN_Bài1 extends CommonBase{
	LoginPage login;
	Day14_BTVN_EditPageFactory editFactory;
	@BeforeMethod
	public void openChorme()
	{
		driver = initChromeDriver(CT_PageURLs.URL_ALADA);
	}
	@Test
	public void updatePassword()
	{
		click(By.xpath("//a[text()='Đăng Nhập']"));
		login = new LoginPage(driver);
		login.LoginFunction("linhvd10@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
		click(By.xpath("//div[@class='avatar2']"));
		click(By.xpath("//a[normalize-space()='Chỉnh sửa thông tin']"));
		editFactory = new Day14_BTVN_EditPageFactory(driver);
		editFactory.EditFunction("123456", "12345678", "12345678");
		waitAlertPeresent();
		driver.switchTo().alert().accept();
	}
}
