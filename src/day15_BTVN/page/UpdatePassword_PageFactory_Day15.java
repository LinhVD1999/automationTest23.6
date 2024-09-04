package automation.page;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class UpdatePassword_PageFactory_Day15 {
	private WebDriver driver;
	@FindBy(id="UserName") WebElement textEmail;
	@FindBy(id="Password") WebElement textPassword;
	@FindBy(xpath = "//button[text()='Đăng nhập']") WebElement buttonLogin;
	@FindBy(id="my_account") WebElement btnAvatar;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']") WebElement btnUpdatePass;
	//OldPAssword
	@FindBy(id="OldPassword") WebElement txtOldPass;
	@FindBy(id="NewPassword") WebElement txtNewPass;
	@FindBy(id="ConfirmNewPassword") WebElement txtConfirmNewPassword;
	@FindBy(id="onesignal-slidedown-cancel-button") WebElement cancelButton;
	@FindBy(xpath="//input[@value='Cập nhật']") WebElement updatePassBtn;
	
	
	public UpdatePassword_PageFactory_Day15(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void LoginFunction(String email, String pass)
	{
		textEmail.sendKeys(email);
		textPassword.sendKeys(pass);
		buttonLogin.click();
	}
	public void UpdatePassword(String oldPass, String newPass)
	{
		try {
			while(cancelButton.isDisplayed()) {
				cancelButton.click();
			}
		} catch (Exception ex) {
			btnAvatar.click();
			btnUpdatePass.click();
			txtOldPass.sendKeys(oldPass);
			txtNewPass.sendKeys(newPass);
			txtConfirmNewPassword.sendKeys(newPass);
			updatePassBtn.click();
		}
	}
	
}
