package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategoryPage;
import util.BrowserFactory;

public class AddCategoryPageTest {
	WebDriver driver;
	@Test
		public void testingAddCategory() {

			driver = BrowserFactory.init();
			AddCategoryPage addCategory = PageFactory.initElements(driver, AddCategoryPage.class);
			addCategory.userShouldBeAbleToAddCategory();
			addCategory.checkingRepeatedCategory();
			
		}
	}
	


