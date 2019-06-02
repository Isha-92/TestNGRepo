import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotations extends Prioritization {
   @Test	
   public void bTestCase() {
	    
	   System.out.println("bTestCase -1 child");
   }
   
   @Test(enabled=false)	
   public void aTestCase() {
	   System.out.println("aTestCase -2");
   }
   
   @BeforeMethod
   public void clearFields() {
	   System.out.println("@BeforeMethod annotation");
   }
   
   @AfterMethod
   public void afterMethod() {
	   System.out.println("@AfterMethod annotation");
   }
   
   @BeforeClass
   public void browserLaunch() {
	   System.out.println("@beforeClass-  browserLaunch");
   }
   
   @AfterClass
   public void afterClass() {
	   System.out.println("@afterClass annotation");
   }
   
   @BeforeTest
   public void beforeTest() {
	   System.out.println("@beforeTest annotation");
   }
   
   @AfterTest
   public void afterTest() {
	   System.out.println("@afterTest annotation");
   }
   
   @BeforeSuite
   public void beforeSuite() {
	   System.out.println("@beforeSuite annotation");
   }
   
   @AfterSuite
   public void afterSuite() {
	   System.out.println("@afterSuite annotation");
   }
   
}
