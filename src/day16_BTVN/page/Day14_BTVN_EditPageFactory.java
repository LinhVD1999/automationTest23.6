package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_BTVN_EditPageFactory {
	private WebDriver driver;
	@FindBy(xpath = "//div[@class='avatar2']") WebElement btnava;
	@FindBy(xpath = "//a[normalize-space()='Chỉnh sửa thông tin']") WebElement btnEdit;
	@FindBy(id="txtpassword") WebElement textpassword;
	@FindBy(id="txtnewpass") WebElement txtnewpass;
	@FindBy(id="txtrenewpass") WebElement txtrenewpass;
	@FindBy(xpath = "//button[normalize-space()='Lưu mật khẩu mới']") WebElement btnSave;
	public Day14_BTVN_EditPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void EditFunction(String pass, String newpass, String renewpass)
	{
			btnava.click();
			btnEdit.click();
			textpassword.sendKeys(pass);
			txtnewpass.sendKeys(newpass);	
			txtrenewpass.sendKeys(renewpass);	
			btnSave.click();
	}
}
