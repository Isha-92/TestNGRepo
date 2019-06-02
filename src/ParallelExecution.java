import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
	public String driverpath;

	@Parameters("browser") //chrome
	@Test(priority=0)
	public void launchBrowser(String browser_name) {
		if(browser_name.equalsIgnoreCase("chrome")) {
			driverpath=System.getProperty("user.dir")+"\\src\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverpath);
			driver = new ChromeDriver();
		}else if(browser_name.equalsIgnoreCase("firefox")){
			driverpath=System.getProperty("user.dir")+"\\src\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",driverpath);
			driver = new ChromeDriver();
		}else {
			System.out.println("wrong Browser");
		} 
	}
	
	@Test(priority=1)
	public void launchApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=2)
	public void verifyUrl() {
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl,"Title doesn't matched");
	}
 	
	@Test(priority=3)
	public void verifyLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
 		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test(priority=4)
	public void closeBrowser() {
		driver.close();
	}
}
