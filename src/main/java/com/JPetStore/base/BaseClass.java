package com.JPetStore.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.JPetStore.Pages.BillPage;
import com.JPetStore.Pages.BirdsOrderPage;
import com.JPetStore.Pages.CatOrderPage;
import com.JPetStore.Pages.DogOrderPage;
import com.JPetStore.Pages.FishOrderPage;
import com.JPetStore.Pages.LoginPage;
import com.JPetStore.Pages.ReptilesOrderPage;
import com.JPetStore.Utility.ExtentManager;
import com.JPetStore.Utility.Log;

public class BaseClass {
	
	
	public static DogOrderPage dop;
	public static LoginPage lop;
	public static BirdsOrderPage bop;
	public static FishOrderPage fop;
	public static ReptilesOrderPage rop;
	public static CatOrderPage cop;
	public static BillPage bill;
	
	

	protected WebDriver driver;
	protected Properties props = new Properties();

	@BeforeClass
	public void setup() throws IOException {

		Log.startTestCase("Browser Setup");

		// config.Properties file location
		String configPath = "C:\\Users\\rohit_tdspg61\\eclipse-workspace\\SDET_10_JPetStore\\src\\test\\resources\\config.Properties";

		Log.info("Loading config file");
		FileInputStream fin = new FileInputStream(configPath);
		// Loading config.Properties file here
		props.load(fin);

		String browserType = props.getProperty("browser").trim().toLowerCase();
		Log.info("Browser selected: " + browserType);
		
		
		
		  // SET EXTENT BROWSER INFO so it will take browser details from here we don't need to manually write
	    ExtentManager.setBrowserInfo(browserType.toUpperCase());

		switch (browserType) {

		case "chrome":
			Log.info("Launching Chrome browser");
			driver = new ChromeDriver();
			break;

		case "edge":
			Log.info("Launching Edge browser");
			driver = new EdgeDriver();
			break;

		// if value of browserType is not matched with this then it will throw this
		// error
		default:
			Log.error("Unsupported browser: " + browserType);
			throw new RuntimeException("Unsupported browser: " + browserType);

		}
		Log.info("Maximizing browser window");
		driver.manage().window().maximize();

		Log.info("Navigating to URL: " + props.getProperty("url"));
		driver.get(props.getProperty("url"));
		
		
		
		 // INITIALIZE PAGE OBJECTS HERE
	    lop = new LoginPage(driver, props);
	    dop = new DogOrderPage(driver, props);
	    bop= new BirdsOrderPage(driver, props);
	    fop= new FishOrderPage(driver, props);
	    rop= new ReptilesOrderPage(driver, props);
	    cop= new CatOrderPage(driver, props);
	    bill= new BillPage(driver);
	}

	@AfterClass
	public void tearDown() {

		Log.info("Closing browser");

		if (driver != null) {
			driver.quit();
			Log.info("Browser closed successfully");
		}

		Log.endTestCase("Browser Setup");
	}
}