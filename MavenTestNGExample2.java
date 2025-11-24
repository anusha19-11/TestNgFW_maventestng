package maventestng;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MavenTestNGExample2 {

	@Test
	public void myTest() {
		System.out.println("I am in my Test method");
	}
	
	@Test(dependsOnMethods = "myTest3")
	public void myTest2() {
		System.out.println("I am in my Test method 2");
	}
	
	@Test
	public void myTest3() {
		System.out.println("I am in my Test method 3");
		assertTrue(false);
	}
	
	@BeforeClass
	public void myBeforeClass() {
		System.out.println("I am in my Before Class method");
	}
	
	@AfterClass
	public void myAfterClass() {
		System.out.println("I am in my After Class method");
	}
}

