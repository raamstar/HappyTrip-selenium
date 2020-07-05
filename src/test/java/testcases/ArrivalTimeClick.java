package testcases;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class ArrivalTimeClick {
	 private static Logger Log = LogManager.getLogger(ArrivalTimeClick.class.getName());

	excel ex=new excel();
	@Test
	public void ArrivalTimeClick_() throws Exception {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Checking for click on departure time");
		WebElement dptTime=ex.driver.findElement(By.id("arrivalTime"));
		dptTime.click();
		
		boolean test=ex.driver.findElement(By.xpath("//*[@id=\"arrivalTime\"]/option[3]")).isDisplayed();
		System.out.println("Arrival time is selected: "+ test);
		
		Thread.sleep(5000);
		
		ex.driver.close();
		
	}
}
