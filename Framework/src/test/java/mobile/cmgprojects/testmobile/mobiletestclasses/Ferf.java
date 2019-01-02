package mobile.cmgprojects.testmobile.mobiletestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import mobile.cmgprojects.testmobile.mobilepageclasses.Scrfeen2;
import com.utilities.MobileBase;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class Ferf extends MobileBase {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
	 String configFileData = "";	public static final int datasetsLength = 1;

	public Ferf() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(Ferf.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("ferf.properties");
		reports = ExtentConfigurations.getExtentInstance(mobileReportsPath, projectPath, Scrfeen2.projectName);
		test = reports.startTest("Ferf");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = Scrfeen2.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		appiumDriver = launchMobileDriver(reports);
	}

	public void Scrfeen2Test(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 1;
		Scrfeen2 objScrfeen2 = new Scrfeen2(appiumDriver);
		testLogHeader(test, "Verify Scrfeen2 page");
		objScrfeen2.LabelLOGIN();
		testInfo("Label text value is : " + "LOGIN", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	
	@Test
	public void screensTest() throws Exception {
		isElementDispalyed = true;
		for(int datasets = 1; datasets <= Scrfeen2.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { Scrfeen2Test(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		appiumDriver.quit();
		stopAppiumServer();
	}
}