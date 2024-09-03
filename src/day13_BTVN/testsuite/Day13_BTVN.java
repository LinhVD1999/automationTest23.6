package automation.testsuite;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.common.CommonBaseFireFox;
import automation.constant.CT_PageURLs;
import automation.page.LoginPageDay13_btvn;
import automation.page.LogoutPageFactory;

public class Day13_BTVN extends CommonBaseFireFox {
	LoginPageDay13_btvn login;
	LogoutPageFactory logoutFactory;
	@BeforeMethod
	public void openFireFox()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_TEST);
	}
	
	@Test
	public void login_Successfully() throws InterruptedException 
	{
		login = new LoginPageDay13_btvn(driver);
		login.LoginFunction("admin@gmail.com","12345678");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đăng nhập thành công!']")).isDisplayed());
		Thread.sleep(10000);
		logoutFactory = new LogoutPageFactory(driver);
		logoutFactory.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());	
	}
	@Test
	public void loginFail_UsernameNotExist()
	{
		login = new LoginPageDay13_btvn(driver);
		login.LoginFunction("abc.dl@gmail.com","12345678");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	@Test
	public void loginFail_PasswordInvalid()
	{
		login = new LoginPageDay13_btvn(driver);
		login.LoginFunction("admin@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	@Test
	public void loginFail_UsernamePasswordInvalid()
	{
		login = new LoginPageDay13_btvn(driver);
		login.LoginFunction("abc.dl@gmail.com","123456");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}

}
