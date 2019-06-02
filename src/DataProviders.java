import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders
{
public static WebDriver driver;
	public void openApp()
		{
		String driverpath=System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/Selenium/Projects/template_7/template_7/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement htmlLocatorsLink=driver.findElement(By.xpath("//h3[text()='HTML Elements Locators']"));
		htmlLocatorsLink.click();
		}
	@DataProvider
	public String[][] getExcel()
	{
		Xls_Reader xls=new Xls_Reader("F:\\Workspace\\TestNGProject\\src\\testData\\TestData.xlsx");
		int rows = xls.getRowCount("Login");
		int cols=xls.getColumnCount("Login");
		String dataArr[][]=new String[rows-1][cols];
		for(int i=2;i<=rows;i++)
		{
				for(int j=0;j<cols;j++)
				{
					dataArr[i-2][j]=xls.getCellData("Login",j,i);
				}
		}
		System.out.println(Arrays.toString(dataArr));
		return dataArr;
	}
		
	@Test(dataProvider="getExcel")
	public void loginFun(String userName, String pass)
	{
		System.out.println(driver+"--"+userName+"--"+pass);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='mail']")).sendKeys(pass);
	}
	@BeforeMethod
	public void clearFields()
	{
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='mail']")).clear();

	}
	
	
}
