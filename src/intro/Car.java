package intro;

import org.testng.annotations.Test;

public class Car {

	@Test
	public void company() {
		System.out.println("audi");
	}

	@Test
	public void price() {
		System.out.println("2 Core");
	}

	@Test(groups = "smoke")
	public void color() {
		System.out.println("black");
	}

}
