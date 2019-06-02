import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	@Test
	public void chkTitleWithHardAssertion() 
	{
		String expectedTitle="Google Title";
		String actualTitle="Google Title";
		System.out.println("Start"); 
		Assert.assertEquals(actualTitle, expectedTitle,"Title doesn't match");
		System.out.println("End"); 
	}
	
	@Test
	public void chkTitleWithSoftAssertion() {
		SoftAssert sa = new SoftAssert();
		String expectedTitle="Google Title";
		String actualTitle="Google123 Title";
		System.out.println("Start"); 
		sa.assertEquals(actualTitle, expectedTitle,"Title doesn't match");
		System.out.println("End");	 
		sa.assertAll();// should be last statement for correct reporting results
	}
}
