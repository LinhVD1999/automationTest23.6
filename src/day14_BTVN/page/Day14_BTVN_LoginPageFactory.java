package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_BTVN_LoginPageFactory {
	private WebDriver driver;
	@FindBy(xpath = "//a[text()='Đăng Nhập']") WebElement buttonLG;
	@FindBy(id="txtLoginUsername") WebElement txtLoginUsername;
	@FindBy(id="txtLoginPassword") WebElement txtLoginPassword;
	@FindBy(xpath ="//button[text()='ĐĂNG NHẬP' and @type='submit']") WebElement buttonLogin;
	
	public Day14_BTVN_LoginPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void LoginFunction(String email, String pass)
	{
		buttonLG.click();
		txtLoginUsername.sendKeys(email);
		txtLoginPassword.sendKeys(pass);
		buttonLogin.click();
	}
}