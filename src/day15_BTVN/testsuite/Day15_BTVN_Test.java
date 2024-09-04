package automation.testsuite;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day15_BTVN_Signup_PageFactory;
import automation.page.UpdatePassword_PageFactory_Day15;

public class Day15_BTVN_Test extends CommonBase{
	@BeforeMethod
	public void openFireFox()
	{
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	@Test
	public void SignupSuccessfully() throws InterruptedException
	{
		Day15_BTVN_Signup_PageFactory signup = new Day15_BTVN_Signup_PageFactory(driver);
		Thread.sleep(1000);
		signup.openTedu();
		signup.SignupFunction("Linh", "06/14/1999", "linhvd2@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//a[normalize-space()='TEDU']")).isDisplayed());
	}
	@Test
	public void updatePasswordSuccessfully() throws InterruptedException
	{
		UpdatePassword_PageFactory_Day15 updatePass = new UpdatePassword_PageFactory_Day15(driver);
		Day15_BTVN_Signup_PageFactory login = new Day15_BTVN_Signup_PageFactory(driver);
		Thread.sleep(1000);
		login.openTedu();
		updatePass.LoginFunction("linhvd@gmail.com", "12345678");
		updatePass.UpdatePassword("12345678", "123456789");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
		//updatePass.UpdatePassword("123456", "12345678");
	}
	@Test
	public void searchSuccessfully() throws InterruptedException
	{
		Day15_BTVN_Signup_PageFactory search = new Day15_BTVN_Signup_PageFactory(driver);
		UpdatePassword_PageFactory_Day15 login = new UpdatePassword_PageFactory_Day15(driver);
		Thread.sleep(1000);
		search.openTedu();
		login.LoginFunction("linhvd@gmail.com", "123456");
		search.SearchFunction("ASP Net");
		assertTrue(driver.findElement(By.xpath("//a[text()='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP']")).isDisplayed());
		//updatePass.UpdatePassword("123456", "12345678");
	}

}
