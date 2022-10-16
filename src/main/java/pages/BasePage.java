//package pages;
//
//import java.util.Random;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public final class BasePage {
//	WebDriver driver;
//	WebElement element;
//
//	public void selectfromDropDown(WebElement element, String visibleText) {
//		Select sel = new Select(element);
//		sel.deselectByVisibleText(visibleText);
//	}
//
//	public static int generateRandomNum(int boundaryNum) {
//		Random rn = new Random();
//		int generatedNum = rn.nextInt(boundaryNum);
//		return generatedNum;
//	}
//
//	public WebElement WebElementWait(WebElement elementloaded) {
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		WebElement ew = wait.until(ExpectedConditions.visibilityOf(elementloaded));
//		return ew;
//
//	}
//}
