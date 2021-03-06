package testcases;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import testcases.excel;

public class CostOfClass {
	 private static Logger Log = LogManager.getLogger(CostOfClass.class.getName());

	excel ex=new excel();
	@Test
	public void scheduleFlight() throws Exception {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Checking for the block of cost of cost  ");
		WebElement chooseflight = ex.driver.findElement(By.xpath("//*[@id=\"flight\"]"));
		chooseflight.click();
		Select flight = new Select(ex.driver.findElement(By.xpath("//*[@id=\"flight\"]")));
		
		flight.selectByIndex(2);
		
		boolean test=ex.driver.findElement(By.id("classEconomy")).isDisplayed();
		
		System.out.println("Cost of class : " + test);
		
		Thread.sleep(4000);
		
		ex.driver.close();
	} 
}
