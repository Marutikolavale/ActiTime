package PageObjactModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginelement {

	public Loginelement(WebDriver  driver)
	{
		PageFactory.initElements(driver,this );
	}

	//declaration
	@FindBy(name="username") public WebElement username;
	@FindBy(name="pwd") public WebElement password;
	@FindBy(id="loginButton") public WebElement Loginbtn;


	//utilization
	public WebElement  username() {
		return  username;
	}
	public WebElement  Password() {
		return  password;
	}
	public WebElement LoginBtn() {
		return  Loginbtn;
	}
	//operational method
	public void LoginOpertion(String username1,String password1)
	{
		username().sendKeys(username1);
		Password().sendKeys(password1);
		LoginBtn().click();
	}

}
