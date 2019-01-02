package web.cmgprojects.demo.webtestclasses;
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
import web.cmgprojects.demo.webpageclasses.LandingScreen;
import web.cmgprojects.demo.webpageclasses.HomeScreen;
import web.cmgprojects.demo.webpageclasses.LoginScreen;
import web.cmgprojects.demo.webpageclasses.LoggedinScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class HFT_TC_001 extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public HFT_TC_001() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(HFT_TC_001.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("hft_tc_001.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, LandingScreen.projectName);
		test = reports.startTest("HFT_TC_001");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = LandingScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void LandingScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		LandingScreen objLandingScreen = PageFactory.initElements(driver, LandingScreen.class);
		testLogHeader(test, "Verify LandingScreen page");
		
		String text1 = objLandingScreen.clkAWelcomeClose();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount))){
			test.log(LogStatus.PASS, "Clicked on : " + configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount));
			logger.info("Clicked on :" + configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount));
			logger.info("Validated Link Text : " + configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount));
			test.log(LogStatus.PASS, "Validated Link Text : " + configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount));
		} else {
			test.log(LogStatus.FAIL, "Link Text is not displayed  : " + configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount));
			logger.error("Link Text is not displayed as : " + configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount));
			test.log(LogStatus.INFO, "Screenshot Taken : "+Utilities.captureScreenshot(driver, configFileObj.getProperty("WelcomeClose"+ i + datasetScreencount)+" is Failed"));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void HomeScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		HomeScreen objHomeScreen = PageFactory.initElements(driver, HomeScreen.class);
		testLogHeader(test, "Verify HomeScreen page");
		
		objHomeScreen.clkALogIn();
		test.log(LogStatus.PASS, "Text is displayed as : LogInLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void LoginScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 3;
		LoginScreen objLoginScreen = PageFactory.initElements(driver, LoginScreen.class);
		testLogHeader(test, "Verify LoginScreen page");
		
		objLoginScreen.fillINPUTEmailAddress(configFileObj.getProperty("EmailAddress"+ i + datasetScreencount));
		test.log(LogStatus.PASS, "Entered EmailAddress : " + configFileObj.getProperty("EmailAddress"+ i + datasetScreencount));
		logger.info("Entered EmailAddress : " + configFileObj.getProperty("EmailAddress"+ i + datasetScreencount));
		objLoginScreen.fillINPUTPassword(configFileObj.getProperty("Password"+ i + datasetScreencount));
		test.log(LogStatus.PASS, "Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
		logger.info("Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
		objLoginScreen.clkSPANLogIn();
		logger.info("Clicked on LogInButton");
		test.log(LogStatus.INFO, "Clicked on LogInButton");
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void LoggedinScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 4;
		LoggedinScreen objLoggedinScreen = PageFactory.initElements(driver, LoggedinScreen.class);
		testLogHeader(test, "Verify LoggedinScreen page");
		
		String text1 = objLoggedinScreen.clkAFieldName();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("FieldName"+ i + datasetScreencount))){
			logger.info("Validated Link Text : " + configFileObj.getProperty("FieldName"+ i + datasetScreencount));
			test.log(LogStatus.PASS, "Validated Link Text : " + configFileObj.getProperty("FieldName"+ i + datasetScreencount));
		} else {
			test.log(LogStatus.FAIL, "Link Text is not displayed  : " + configFileObj.getProperty("FieldName"+ i + datasetScreencount));
			logger.error("Link Text is not displayed as : " + configFileObj.getProperty("FieldName"+ i + datasetScreencount));
			test.log(LogStatus.INFO, "Screenshot Taken : "+Utilities.captureScreenshot(driver, configFileObj.getProperty("FieldName"+ i + datasetScreencount)+" is Failed"));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		isElementDispalyed = true;
		for(int datasets = 1; datasets <= LoggedinScreen.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { LandingScreenTest(datasets);}
			if(isElementDispalyed) { HomeScreenTest(datasets);}
			if(isElementDispalyed) { LoginScreenTest(datasets);}
			if(isElementDispalyed) { LoggedinScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}