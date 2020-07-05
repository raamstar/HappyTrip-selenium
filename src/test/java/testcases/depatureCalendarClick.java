package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;




public class depatureCalendarClick {
	
	 private static Logger Log = LogManager.getLogger(depatureCalendarClick.class.getName());
	excel ex=new excel();
	@Test
	public void depatureCalendarClick_() {
		Log.info("entering as admin");
		ex.signin("Admin@mindtree.com", "admin");
		Log.info("Clicking on Departure Calendar");
		WebElement calendar = ex.driver.findElement(By.xpath("//*[@id=\"AddSchedule\"]/dl/dd[6]/img"));
		calendar.click();
		
		Log.info("Testing the input case");
		String expected = "1";
		WebElement element= ex.driver.findElement(By.className(("ui-state-default")));
		String actual= element.getText();
		AssertJUnit.assertEquals(actual, expected);
		ex.driver.navigate().refresh();
		
		ex.driver.close();
	} 
}
