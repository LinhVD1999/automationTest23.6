package automation.testsuite;

import static org.junit.Assert.assertTrue;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day19_BTVN extends CommonBase{
	@BeforeMethod
	public void openFirefox()
	{
		driver = initFirefoxDriver(CT_PageURLs.URL_BEPANTOAN);
	}
	@Test
	public void menuMayRuaChenBat()
	{
		click(By.xpath("//a[normalize-space()='Máy Rửa Chén Bát' and @class='menu-link']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Máy Rửa Chén Bát' and @class='text-sm breadcrumb-item text-grey-800']")).isDisplayed());
	}
	@Test
	public void detailProduct()
	{
		click(By.xpath("//a[normalize-space()='Máy Rửa Chén Bát' and @class='menu-link']")); 
		pause(3000);
		WebElement firstProduct = driver.findElement(By.xpath("//h4[contains(text(), 'Máy rửa chén')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstProduct);
		firstProduct.click();
	}
	@Test
	public void filterPrice()
	{
		click(By.xpath("//a[normalize-space()='Máy Rửa Chén Bát' and @class='menu-link']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Máy Rửa Chén Bát' and @class='text-sm breadcrumb-item text-grey-800']")).isDisplayed());
		click(By.xpath("//span[normalize-space()='< 3.000.000']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h4[normalize-space()='Máy rửa bát Bosch SMV69N20EU']")).isDisplayed());
	}
	@Test
	public void filterManufacturer()
	{
		click(By.xpath("//a[normalize-space()='Máy Rửa Chén Bát' and @class='menu-link']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Máy Rửa Chén Bát' and @class='text-sm breadcrumb-item text-grey-800']")).isDisplayed());
		click(By.xpath("//a[@href='/danh-muc/may-rua-chen-bat/bosch']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='MAÝ RỬA BÁT BOSCH NHẬP KHẨU CHÍNH HÃNG GIÁ ƯU ĐÃI NHẤT 2024']")).isDisplayed());
	}
	@Test
	public void filterOrigin()
	{
		click(By.xpath("//a[normalize-space()='Máy Rửa Chén Bát' and @class='menu-link']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Máy Rửa Chén Bát' and @class='text-sm breadcrumb-item text-grey-800']")).isDisplayed());
		click(By.xpath("//input[@id='singapore47B8-1198']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h4[normalize-space()='Máy rửa bát Chefs Kuche DWF-1200LW']")).isDisplayed());
	}
	@Test
	public void filterSetNumber()
	{
		click(By.xpath("//a[normalize-space()='Máy Rửa Chén Bát' and @class='menu-link']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Máy Rửa Chén Bát' and @class='text-sm breadcrumb-item text-grey-800']")).isDisplayed());
		click(By.xpath("//input[@id='9-bo-1041']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h4[normalize-space()='Máy Rửa Bát Bán Âm - 60CM HMH.SPI2HKS59E Series 4']")).isDisplayed());
	}
	@Test
	public void filterSize()
	{
		click(By.xpath("//a[normalize-space()='Máy Rửa Chén Bát' and @class='menu-link']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//span[text()='Máy Rửa Chén Bát' and @class='text-sm breadcrumb-item text-grey-800']")).isDisplayed());
		click(By.xpath("//input[@id='600-mm-1065']"));
		pause(3000);
		assertTrue(driver.findElement(By.xpath("//h4[normalize-space()='Máy rửa bát Bosch SMS46HI04E']")).isDisplayed());
	}
}
