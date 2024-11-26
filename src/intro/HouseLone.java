package intro;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HouseLone {

	@AfterTest
	public void afterExecution() {
		System.out.println("After Execution");
	}

	@Test(groups = "smoke")
	public void webAppHouseLone() {
		System.out.println("Web House Lone");
	}

	@Test
	public void mobileAppHouseLone() {
		System.out.println("Mobile House Lone");
	}

	@Test(groups = "smoke")
	public void restAPIHouseLone() {
		System.out.println("Rest API House Lone");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I will execute at first");
	}
}
