package PageObjactModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackhomepage {

	public TimeTrackhomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//declaration
		@FindBy(xpath="//a[text()='Create new tasks']") public WebElement createnewTask;
		
		//utilization
		public WebElement  createnewTaskbtn() {
			return  createnewTask;
}
		
		//operational method
		public void createnewTaskbtnclick()
		{
			createnewTaskbtn().click();
		}
		
		
		
}