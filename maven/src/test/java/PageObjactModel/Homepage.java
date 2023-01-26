package PageObjactModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	public Homepage(WebDriver  driver)
	{
		PageFactory.initElements(driver,this );
	}
	//declaration
	@FindBy(xpath="//div[@class='label' and text()='Time-Track']") public WebElement TimeTrack;
	@FindBy(xpath="//div[@class='label' and text()='Tasks']") public WebElement Tasks;
	@FindBy(xpath="//div[text()='Reports']") public WebElement Reports;
	@FindBy(xpath="//div[text()='Users']") public WebElement Users;
	@FindBy(xpath="//div[text()='Work Schedule']") public WebElement WorkSchedule;
	@FindBy(xpath="//div[text='Settings']") public WebElement Settings;


	//utilization
	public WebElement  TimeTrack() {
		return  TimeTrack;
	}
	public WebElement  Tasks() {
		return  Tasks;
	}
	public WebElement  Reports() {
		return  Reports;
	}
	public WebElement  Users() {
		return  Users;
	}
	public WebElement  WorkSchedule() {
		return  WorkSchedule;
	}
	public WebElement  Settings() {
		return  Settings;
	}
	//operational method
	public void TimeTrackclick()
	{
		TimeTrack().click();
	}
	public void Tasksclick()
	{
		Tasks().click();
	}
	public void Reportsclick()
	{
		Reports().click();
	}
	public void Usersclick()
	{
		Users().click();
	}
	public void WorkScheduleclick()
	{
		WorkSchedule().click();
	}
	public void Settingsclick()
	{
		Settings().click();
	}





















}
