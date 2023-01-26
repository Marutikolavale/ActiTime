package Testclass;


import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import ChooseBroser.ChooseLaunchBrowser;
import PageObjactModel.Loginelement;
import PageObjactModel.TimeTrackhomepage;
import PageObjactModel.createtaskpage;


public class lgointest {

	ChooseLaunchBrowser ch= new ChooseLaunchBrowser();

	@Test(priority=1)
	public void loginOperation() throws IOException
	{

		ch.setUp();
		Loginelement d= new Loginelement(ChooseLaunchBrowser.driver);
		d.LoginOpertion("admin","manager");
	}
	@Test(priority=2)
	public void TimeTrackOperration()
	{
		TimeTrackhomepage t= new TimeTrackhomepage(ChooseLaunchBrowser.driver);
		t.createnewTaskbtnclick();
	}
	@Test(priority=3)
	public void d()
	{
		createtaskpage c=new createtaskpage(ChooseLaunchBrowser.driver);
		c.selecttocustomerbtnclick();

	}
	@Test(priority=4)
	public void colse()
	{
		ch.tearDown();
	}
}
