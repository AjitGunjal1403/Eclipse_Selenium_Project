package maven_project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Test {
	public static void main(String[] args) {
		

	  System.setProperty("webdriver.edge.driver","D:\\Automation - Selinium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		==================================================
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

//	    System.setProperty("webdriver.edge.driver","D:\\Automation - Selinium\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//
//		@BeforeClass 
//		public void beforeClass() {
//			System.out.println("Before Class");
//		}
//		
//		@BeforeMethod
//		public void beforeMethod() {
//			System.out.println("Before Method");
//		}
//
//		@Test(priority = 4 )
//		public void test1() {
//			System.out.println("Test1");
//		}
//		
//		@Test (priority = 3)
//		public void test2() {
//			System.out.println("Test2");
//		}
//		
//		// invocationCount is used to execute test case multiple time.
//		@Test (priority = 2, invocationCount = 3)
//		public void test3() {
//			System.out.println("Test3");
//		}
//		
//		// If test1 is pass then test4 will execute, otherwise it will skip test4.
//		@Test (priority = 1 , dependsOnMethods = {"test1"})
//		public void test4() {
//			System.out.println("Test4");
//		}
//		
//		// When priority is same then the execution is based on alphabetical order.
//		// default priority is 0. 
//
//		// Enabled is used to stop the execution of any method.
//		@Test (enabled = false)
//		public void test5() {
//			System.out.println("Test5");
//		}
//		
//		@AfterMethod
//		public void afterMethod() {
//			System.out.println("After Method");
//		}
//		
//		@AfterClass
//		public void afterClass() {
//			System.out.println("After Class");
//		}
//		
		
		

	}
	
	}


