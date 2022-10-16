package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.DropDownList;
import util.BrowserFactory;

public class DropDownListTest {
WebDriver driver;
	
	@Test
	public void validateDropDownMenue() {
		
		driver = BrowserFactory.init();
		DropDownList dropDownList = PageFactory.initElements(driver, DropDownList.class);
		dropDownList.listOfDropDownMonths();
		dropDownList.validateDropDown();
	}

}
