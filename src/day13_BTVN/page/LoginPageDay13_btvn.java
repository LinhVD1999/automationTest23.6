package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageDay13_btvn {
	private WebDriver driver;
	public LoginPageDay13_btvn(WebDriver _driver) {
		this.driver = _driver;
	}
	
	//Xay dung ham dang nhap de su dung trong cac class test
	public void LoginFunction(String email, String password) 
	{	
		WebElement textEmail = driver.findElement(By.id("email"));
		if(textEmail.isDisplayed())
		{
			textEmail.sendKeys(email);
		}
		
		WebElement textPassword = driver.findElement(By.id("password"));
		if(textPassword.isDisplayed())
		{
			textPassword.sendKeys(password);
		}
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Đăng nhập']"));
		if(btnLogin.isDisplayed())
		{
			btnLogin.click();
		}
		
	}
}
