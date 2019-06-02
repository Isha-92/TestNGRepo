import org.testng.annotations.Test;

public class GroupingDemo2 {
	   @Test(groups="Smoke")	
	   public void aTestCase() {  
		   System.out.println("aTestCase1---class2");
	   }
	   
	   @Test(groups="Sanity")		
	   public void cTestCase() { 
		   System.out.println("cTestCase-3---class2");
	   }
	   
	   @Test(groups="Regressions")	
	   public void dTestCase() {
		   System.out.println("dTestCase-4---class2");
	   }
	   
	  
	   @Test(groups="GUI")	
	   public void fTestCase() {
		   System.out.println("fTestCase-6---class2");
	   }
	     
	   @Test(groups="Regressions")		
	   public void hTestCase() {
		   System.out.println("hTestCase-8---class2");
	   }
}
