package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_BTVN_SignUpPageFactory {
	private WebDriver driver;
	@FindBy(xpath = "//a[text()='Đăng Ký']") WebElement buttonSU;
	@FindBy(id="txtFirstname") WebElement txtFirstname;
	@FindBy(id="txtEmail") WebElement textEmail;
	@FindBy(id="txtCEmail") WebElement txtCEmail;
	@FindBy(id="txtPassword") WebElement textPassword;
	@FindBy(id="txtCPassword") WebElement txtCPassword;
	@FindBy(id="txtPhone") WebElement txtPhone;
	@FindBy(xpath = "//button[text()='ĐĂNG KÝ' and @type='submit']") WebElement buttonSignUp;
	
	public Day14_BTVN_SignUpPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void SignUpFunction(String name, String email, String cemail, String pass, String cpass, String phone)
	{
		buttonSU.click();
		txtFirstname.sendKeys(name);
		textEmail.sendKeys(email);
		txtCEmail.sendKeys(cemail);
		textPassword.sendKeys(pass);
		txtCPassword.sendKeys(cpass);
		txtPhone.sendKeys(phone);
		buttonSignUp.click();
	}
}