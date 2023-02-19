package maven_project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test {
	public static void main(String[] args) {
		
	    System.setProperty("webdriver.edge.driver","D:\\Automation - Selinium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
// 		 System.setProperty("webdriver.edge.driver","D:\\Automation - Selinium\\msedgedriver.exe");
// 		WebDriver driver = new EdgeDriver();
// 		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
// 		driver.manage().window().maximize();
//  		driver.get("https://www.facebook.com/");
	}
	
	}


