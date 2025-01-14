package MavenProject.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestWithTestNGFramework {
	WebDriver driver;

	@BeforeClass
	public void testSetup()
	{
	//System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openBrowser(){
	driver.get("https://www.browserstack.com/");
	driver.findElement(By.id("signupModalButton")).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}

	@Test(description="This method validates the sign up functionality")
	public void signUp(){
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh9049+1@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("BrowserStack123*");
	driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
	driver.findElement(By.id("user_submit")).click();

	}

	@AfterMethod
	public void postSignUp()
	{
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}

}
