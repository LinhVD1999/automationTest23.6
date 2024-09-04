package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class Day15_BTVN_Signup_PageFactory {
	private WebDriver driver;
	@FindBy(xpath = "//button[@id='onesignal-slidedown-cancel-button']") WebElement btnlater;
	@FindBy(xpath = "//a[text()='Đăng ký']") WebElement btnSignup;
	@FindBy(xpath = "//input[@id='FullName']") WebElement textFullName;
	@FindBy(xpath = "//input[@id='DOB']") WebElement textDate;
	@FindBy(id="Email") WebElement textEmail;
	@FindBy(id="Password") WebElement textPassword;
	@FindBy(xpath = "///body/div[@id='page-wrap']/section[@id='login-content']/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[5]/div[1]/div[1]") WebElement capcha;
	@FindBy(xpath = "//input[@value='Trở thành thành viên']") WebElement buttonLogin;
	//Search
	@FindBy(xpath= "//input[@class='autosearch-input form-control']") WebElement textSearch;
	@FindBy(xpath= "//button[@class='button-search btn btn-primary']") WebElement btnSearch;
	
	public Day15_BTVN_Signup_PageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	public void openTedu()
	{
		btnlater.click();
	}
    public By searchContracts = By.xpath("//body/div[@id='page-wrap']/section[@id='login-content']/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[5]/div[1]/div[1]");

	
	public void SignupFunction(String name, String date, String email, String pass) throws InterruptedException
	{
		btnSignup.click();
		textFullName.sendKeys(name);
		textDate.sendKeys(date);
		textEmail.sendKeys(email);
		textPassword.sendKeys(pass);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='page-wrap']/section[@id='login-content']/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[5]/div[1]/div[1]"));
		String getName = element.getText();
		element.click();
		System.out.println(getName);
		buttonLogin.click();
	}
	public void SearchFunction(String search)
	{
		textSearch.sendKeys(search);
		btnSearch.click();
	}
}
