package TestNG_Tut;

import org.testng.Assert;
import org.testng.annotations.Test;

public class second_Testng {
	@Test
	public void demo() {
		System.out.println("Hello");
		
		System.out.println("Hello6");
	}
	

	@Test
	public void demo1() {
		Assert.assertEquals(false, true);
		System.out.println("Bye");
	}
	
	@Test
	public void demo2() {
		Assert.assertEquals(false, true);
		System.out.println("Bye");
	}
	
	@Test
	public void demo3() {
		Assert.assertEquals(false, true);
		System.out.println("Bye");
	}

}
