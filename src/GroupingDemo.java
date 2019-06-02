import org.testng.annotations.Test;

public class GroupingDemo {
	   @Test(groups="Smoke")	
	   public void aTestCase() {  
		   System.out.println("aTestCase1");
	   }
	   
	   @Test(groups="Smoke")		
	   public void bTestCase() {
		   System.out.println("bTestCase-2");
	   }
	   
	   @Test(groups="Sanity")		
	   public void cTestCase() { 
		   System.out.println("cTestCase-3");
	   }
	   
	   @Test(groups="Regressions")	
	   public void dTestCase() {
		   System.out.println("dTestCase-4");
	   }
	   
	   @Test(groups="Regressions")		
	   public void eTestCase() {
		   System.out.println("eTestCase-5");
	   }
	   
	   @Test(groups="Functional")	
	   public void fTestCase() {
		   System.out.println("fTestCase-6");
	   }
	   
	   @Test(groups="Regressions")		
	   public void gTestCase() { 
		   System.out.println("gTestCase-7");
	   }
	   
	   @Test(groups="Regressions")		
	   public void hTestCase() {
		   System.out.println("hTestCase-8");
	   }
}
