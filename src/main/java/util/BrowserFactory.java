package util;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
;

public class BrowserFactory {

	static WebDriver driver;
   
	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Takehome\\TestNg\\Driver\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void teardown() {
		driver.close();
		driver.quit();
	}

}



//	@BeforeMethod
//	public static void readConfig() {
//	
//	BufferedReader reader;
//
//		try {
//			
//		reader = new BufferedReader(new FileReader("src\\main\\java\\config\\config.properties"));
////			InputStream input = new FileInputStream("config\\config.properties");
//			Properties prop = new Properties();
//			prop.load(reader);
//			browser = prop.getProperty("browser");
//			url = prop.getProperty("url");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
// @Test
//	public static WebDriver init() {
//		
//	
//		readConfig();
//		
//    	if (browser.equalsIgnoreCase("chrome")){
//    		System.setProperty("webdriver.chrome.driver","Driver\\driver\\chromedriver.exe");
//    		driver = new ChromeDriver();
//    	}
//		
//		
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		return driver;
//	}
//	
//	public static boolean doesDataExist(String categoryName, List<String> actualList) {
//		
//		for ( int i=0; i<actualList.size(); i++) {
//			if (categoryName.equalsIgnoreCase(actualList.get(i))) {
//				return true;
//					}
//		}
//		return false;
//	}
//	
//	public static boolean doesDataMatch(List<String>months, List<String>dropDownList) {
//		boolean dataMatch=false;
//		
//		for(int i=0;i<dropDownList.size();i++) {
//			if(dropDownList.containsAll(months)&& months.contains(dropDownList)) {
//				dataMatch = true;
//			}
//		}
//		return dataMatch;
//	}
//	
//	public static void tearDown() {
//		driver.close();
//		driver.quit();
//	}
//
//}