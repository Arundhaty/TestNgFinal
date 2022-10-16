//package pages;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import util.BrowserFactory;
//
//public class WebElementPage extends BrowserFactory {
//
//	WebDriver driver;
//	BrowserFactory logintest;
//
////	public WebElementPage(WebDriver driver) {
////		this.driver = driver;
////	}
//
//	@FindBy(how = How.XPATH, using = "//input[@name ='categorydata']")
//	WebElement AddCategoryField;
//	@FindBy(how = How.XPATH, using = "//input[@value ='Add category']")
//	WebElement AddCategoryButton;
//	@FindBy(how = How.XPATH, using = "//input[@name ='category']")
//	WebElement CategoryDropDownField;
//	@FindBy(how = How.XPATH, using = "//input[@value ='due_month']")
//	WebElement MonthDropDownField;
//	// @FindBy(how = How.XPATH,using = "//input[@value ='nevermind']") WebElement
//	// NevermindField;
//
//	
//	public void insertCategory(String word) throws Exception {
//		Thread.sleep(2000);
//		logintest = PageFactory.initElements(driver, BrowserFactory.class);
//		String wordWithRandomNum = word + generateRandomNum(1000);
//		AddCategoryField.sendKeys(wordWithRandomNum);
//		AddCategoryButton.click();
//	}
//public void allMonthsDropDown() {
//		String[] exp = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
//		WebElement dropdown = driver.findElement(By.xpath("//input[@value ='due_month']"));
//		Select sel = new Select(dropdown);
//		List<WebElement> options = sel.getOptions();
//		for (int i = 0; i < options.size(); i++) {
//			Assert.assertEquals(options.get(i).getText(), exp[i]);
//
//		}
//	}
//
//}
