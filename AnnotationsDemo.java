package MavenProject.MavenDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Inside Before Suite Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside Before Before Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside Before beforeTest");
	}

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("Inside Before beforeMethod1");
	}

	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("Inside Before beforeMethod2");
	}

	@Test
	public void testMethod1() {
		System.out.println("Inside Before testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Inside Before testMethod2");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside Before afterTest");
	}

	@AfterMethod
	public void afterMethod1() {
		System.out.println("Inside Before afterMethod1");
	}

	@AfterMethod
	public void afterMethod2() {
		System.out.println("Inside Before afterMethod2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside Before afterClass");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Inside Before afterSuite");
	}

}
/*
 public class TestClass1 {

@BeforeSuite
public void beforeSuite() {
System.out.println(“Inside Before Suite Method.”);
}

@BeforeClass
public void beforeClass() {
System.out.println(“Inside Before Class of TestClass1.”);
}

@BeforeTest
public void beforeTest() {
System.out.println(“Inside Before Test Method of TestClass1.”);
}

@BeforeMethod
public void beforeMethod1() {
System.out.println(“Inside Before Method 1 of TestClass1.”);
}

@BeforeMethod
public void beforeMethod2() {
System.out.println(“Inside Before Method 2 of TestClass1.”);
}

@Test
public void testMethod1() {
System.out.println(“Inside Test Method 1 of TestClass1.”);
}

@Test
public void testMethod2() {
System.out.println(“Inside Test Method 2 of TestClass1.”);
}

@AfterTest
public void afterTest() {
System.out.println(“Inside After Test Method of TestClass1.”);
}

@AfterMethod
public void afterMethod1() {
System.out.println(“Inside After Method 1 of TestClass1.”);
}

@AfterMethod
public void afterMethod2() {
System.out.println(“Inside After Method 2 of TestClass1.”);
}

@AfterClass
public void afterClass() {
System.out.println(“Inside After Class Method of TestClass1.”);
}

@AfterSuite
public void afterSuite() {
System.out.println(“Inside After Suite Method.”);
}
 
 */
