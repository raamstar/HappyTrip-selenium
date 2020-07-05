package testcases;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import testcases.excel;

public class schedule_flight {
	
	 private static Logger Log = LogManager.getLogger(schedule_flight.class.getName());
	excel ex=new excel();
	
	@Test
	public void scheduleFlight() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Choosing the flight");
		WebElement chooseflight = ex.driver.findElement(By.xpath("//*[@id=\"flight\"]"));
		chooseflight.click();
		Select flight = new Select(ex.driver.findElement(By.xpath("//*[@id=\"flight\"]")));
		Log.info("Selecting by index of flight");
		flight.selectByIndex(2);
		
		ex.driver.navigate().refresh();
		
		ex.driver.close();
	} 
}
