package testcases;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class ArrivalCalendarSelect {
	 private static Logger Log = LogManager.getLogger(ArrivalCalendarSelect.class.getName());
	excel ex=new excel();
	@Test
	public void ArrivalCalendarSelect_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		WebElement calendar = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[8]/img"));
		calendar.click();
		Log.info("Checking for selecting the Arrival date");
		WebElement date=ex.driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a"));
		date.click();
		
		boolean test=ex.driver.findElement(By.id("arrivalDate")).isDisplayed();
		System.out.println("Arrival date is selected: "+ test);
		ex.driver.close();
}
}