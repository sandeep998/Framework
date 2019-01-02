package web.demoproject.testingmodule.webtestclasses;
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
import web.demoproject.testingmodule.webpageclasses.LandingPopUpScreen;
import web.demoproject.testingmodule.webpageclasses.HomeScreen;
import web.demoproject.testingmodule.webpageclasses.LoginScreen;
import web.demoproject.testingmodule.webpageclasses.LoggedInScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_HFTLogin_01 extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public TC_HFTLogin_01() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_HFTLogin_01.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_hftlogin_01.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, LandingPopUpScreen.projectName);
		test = reports.startTest("TC_HFTLogin_01");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = LandingPopUpScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void LandingPopUpScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		LandingPopUpScreen objLandingPopUpScreen = PageFactory.initElements(driver, LandingPopUpScreen.class);
		testLogHeader(test, "Verify LandingPopUpScreen page");
		
		String text1 = objLandingPopUpScreen.clkAWelcomeClose();
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
		
		String text1 = objHomeScreen.clkALogIn();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("LogIn"+ i + datasetScreencount))){
			test.log(LogStatus.PASS, "Clicked on : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			logger.info("Clicked on :" + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			logger.info("Validated Link Text : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			test.log(LogStatus.PASS, "Validated Link Text : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
		} else {
			test.log(LogStatus.FAIL, "Link Text is not displayed  : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			logger.error("Link Text is not displayed as : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			test.log(LogStatus.INFO, "Screenshot Taken : "+Utilities.captureScreenshot(driver, configFileObj.getProperty("LogIn"+ i + datasetScreencount)+" is Failed"));
		}

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
		String text3 = objLoginScreen.clkSPANLogIn();
		if(text3.equalsIgnoreCase(configFileObj.getProperty("LogIn"+ i + datasetScreencount))){
			test.log(LogStatus.PASS, "Clicked on Button : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			logger.info("Clicked on Button : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			test.log(LogStatus.PASS, "Validated Button Text : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			logger.info("Validated Button Text : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
		} else {
			test.log(LogStatus.FAIL, "Text is displayed as : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			logger.error("Text is displayed as : " + configFileObj.getProperty("LogIn"+ i + datasetScreencount));
			test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, configFileObj.getProperty("LogIn"+ i + datasetScreencount)+" is Failed"));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void LoggedInScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 4;
		LoggedInScreen objLoggedInScreen = PageFactory.initElements(driver, LoggedInScreen.class);
		testLogHeader(test, "Verify LoggedInScreen page");
		Thread.sleep(10000);
		String text1 = objLoggedInScreen.clkAHelloMalleshwar();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount))){
			test.log(LogStatus.PASS, "Clicked on : " + configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount));
			logger.info("Clicked on :" + configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount));
			logger.info("Validated Link Text : " + configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount));
			test.log(LogStatus.PASS, "Validated Link Text : " + configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount));
		} else {
			test.log(LogStatus.FAIL, "Link Text is not displayed  : " + configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount));
			logger.error("Link Text is not displayed as : " + configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount));
			test.log(LogStatus.INFO, "Screenshot Taken : "+Utilities.captureScreenshot(driver, configFileObj.getProperty("HelloMalleshwar"+ i + datasetScreencount)+" is Failed"));
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
		for(int datasets = 1; datasets <= LoggedInScreen.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { LandingPopUpScreenTest(datasets);}
			if(isElementDispalyed) { HomeScreenTest(datasets);}
			if(isElementDispalyed) { LoginScreenTest(datasets);}
			if(isElementDispalyed) { LoggedInScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}