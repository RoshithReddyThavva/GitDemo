package intro;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(groups = "smoke")
	public void run() {
		System.out.println("in run");
	}
}
