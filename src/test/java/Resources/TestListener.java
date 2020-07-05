package Resources;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;




public class TestListener implements ITestListener {

	WebDriver driver;
	String filePath = "./src/test/resources/ScreenShots";
	
   
	
	public void onTestFailure(ITestResult result) {
		String methodName=result.getName().toString();
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chrome/chromedriver.exe");
		driver = new ChromeDriver();
       takeScreenShot(methodName, driver);
	}
	
	private void takeScreenShot(String methodName, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("ScreenShot function called");
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println("Screenshot taken");
         //The below method will save the screen shot in d drive with test method name 
            try {
				Files.copy(scrFile, new File(filePath+methodName+".png"));
				System.out.println("***Placed screen shot in "+filePath+" ***");
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}
	

	
}
