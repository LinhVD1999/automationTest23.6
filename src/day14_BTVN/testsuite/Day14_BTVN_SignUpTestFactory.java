package automation.testsuite;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBaseFireFox;
import automation.constant.CT_PageURLs;
import automation.page.Day14_BTVN_EditPageFactory;
import automation.page.Day14_BTVN_LoginPageFactory;
import automation.page.Day14_BTVN_SignUpPageFactory;

public class Day14_BTVN_SignUpTestFactory extends CommonBaseFireFox{
	Day14_BTVN_SignUpPageFactory signupFactory;
	Day14_BTVN_EditPageFactory editFactory;
	Day14_BTVN_LoginPageFactory loginFactory;

	@BeforeMethod
	public void openFireFox()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_ALADA);
	}
	@Test
	public void signupSuccessfully() throws InterruptedException
	{
		signupFactory = new Day14_BTVN_SignUpPageFactory(driver);
		signupFactory.SignUpFunction("Diệu Linh", "linhvd12@gmail.com", "linhvd12@gmail.com", "12345678", "12345678", "0374200934");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
	
	@Test
	public void EditSuccessfully() throws InterruptedException
	{
		loginFactory = new Day14_BTVN_LoginPageFactory(driver);
		loginFactory.LoginFunction("linhvd11@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
		Thread.sleep(20000);
		editFactory = new Day14_BTVN_EditPageFactory(driver);
		editFactory.EditFunction("12345678", "123456", "123456");
		Thread.sleep(5000);
	}
	@Test
	public void LoginSuccessfully() 
	{
		loginFactory = new Day14_BTVN_LoginPageFactory(driver);
		loginFactory.LoginFunction("linhvd11@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
}
