import org.testng.annotations.Test;

public class DependsOnMethods {
		@Test	
	   public void browserLaunch() {
		   System.out.println("browserLaunch");
	   }
	   
	   @Test(dependsOnMethods="browserLaunch")
	   public void appLaunch() {
		   System.out.println("appLaunch");
	   }
	   
	   @Test(dependsOnMethods="appLaunch")
	   public void loginTestCase() {
		   System.out.println("loginTestCase");
	   }
	   
	   @Test(dependsOnMethods="loginTestCase")
	   public void logout() { 
		   System.out.println("logout");
	   }
}
