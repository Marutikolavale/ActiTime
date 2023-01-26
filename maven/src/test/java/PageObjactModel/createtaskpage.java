package PageObjactModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createtaskpage {
  WebElement driver;
	public createtaskpage(WebDriver Driver)
	{
		PageFactory.initElements(Driver,this);
	}
	//declaration
			@FindBy(xpath="//select[@tabindex='1' and @onkeyup='customerChanged(this.form);']") public WebElement selecttocustomer;
			
			//utilization
			public WebElement  selecttocustomer() {
				return  selecttocustomer;
	}
			
			//operational method
			public void selecttocustomerbtnclick()
			{
			
			Select s =new Select(selecttocustomer());
			s.selectByValue("0");
			}
}
