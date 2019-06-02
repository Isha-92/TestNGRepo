import org.testng.annotations.Test;

public class Prioritization {
	   @Test(priority=0,description= "Launches the browser")	
	   public void browserLaunch() { 
		   System.out.println("browserLaunch");
	   }
	   
	   @Test(priority=1,description= "Launches the application")
	   public void appLaunch() {
		   System.out.println("appLaunch");
	   }  
}
