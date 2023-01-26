package ChooseBroser;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChooseLaunchBrowser {
	public static WebDriver driver;
	public void setUp() throws IOException 
	{
		ReadConfig R= new ReadConfig();
		String Url = R.readPropertyFile("C:\\Users\\mbkol\\OneDrive\\Desktop\\Testing\\ActiTime\\ActiTimeProjects\\Configurations\\config.properties","url");
		String BrowserValue = R.readPropertyFile("C:\\Users\\mbkol\\OneDrive\\Desktop\\A\\Al_Masraf\\Configurations\\config.properties","Browser");

		if(BrowserValue.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}
		else if(BrowserValue.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		else if(BrowserValue.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(Url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

		else
		{
			System.out.println("Enter correct Choice");
		}
	}
	public void tearDown()
	{
		driver.quit();
	}

}
