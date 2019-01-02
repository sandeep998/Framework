package web.demoproject.demomodule.webtestclasses;
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
import web.demoproject.demomodule.webpageclasses.HomeScreen;
import web.demoproject.demomodule.webpageclasses.HarborLoginScreen;
import web.demoproject.demomodule.webpageclasses.DashBoardScreen;
import web.demoproject.demomodule.webpageclasses.MyOrderScreen;
import web.demoproject.demomodule.webpageclasses.LogoutScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_DemoHarbar_001 extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public TC_DemoHarbar_001() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_DemoHarbar_001.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_demoharbar_001.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, HomeScreen.projectName);
		test = reports.startTest("TC_DemoHarbar_001");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = HomeScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void HomeScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		HomeScreen objHomeScreen = PageFactory.initElements(driver, HomeScreen.class);
		testLogHeader(test, "Verify HomeScreen page");
		
		objHomeScreen.clkAWelcomeClose();
		test.log(LogStatus.PASS, "Text is displayed as : WelcomeCloseLink");
		objHomeScreen.clkALogIn();
		test.log(LogStatus.PASS, "Text is displayed as : LogInLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void HarborLoginScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		HarborLoginScreen objHarborLoginScreen = PageFactory.initElements(driver, HarborLoginScreen.class);
		testLogHeader(test, "Verify HarborLoginScreen page");
		
		objHarborLoginScreen.fillINPUTEmailAddress(configFileObj.getProperty("EmailAddress"+ i + datasetScreencount));
		test.log(LogStatus.PASS, "Entered EmailAddress : " + configFileObj.getProperty("EmailAddress"+ i + datasetScreencount));
		logger.info("Entered EmailAddress : " + configFileObj.getProperty("EmailAddress"+ i + datasetScreencount));
		objHarborLoginScreen.fillINPUTPassword(configFileObj.getProperty("Password"+ i + datasetScreencount));
		test.log(LogStatus.PASS, "Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
		logger.info("Entered Password : " + configFileObj.getProperty("Password"+ i + datasetScreencount));
		objHarborLoginScreen.clkSPANLogIn();
		logger.info("Clicked on LogInButton");
		test.log(LogStatus.INFO, "Clicked on LogInButton");
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void DashBoardScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 3;
		DashBoardScreen objDashBoardScreen = PageFactory.initElements(driver, DashBoardScreen.class);
		testLogHeader(test, "Verify DashBoardScreen page");
		
		String text1 = objDashBoardScreen.clkAHelloChandra();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("HelloChandra"+ i + datasetScreencount))){
			logger.info("Validated Link Text : " + configFileObj.getProperty("HelloChandra"+ i + datasetScreencount));
			test.log(LogStatus.PASS, "Validated Link Text : " + configFileObj.getProperty("HelloChandra"+ i + datasetScreencount));
		} else {
			test.log(LogStatus.FAIL, "Link Text is not displayed  : " + configFileObj.getProperty("HelloChandra"+ i + datasetScreencount));
			logger.error("Link Text is not displayed as : " + configFileObj.getProperty("HelloChandra"+ i + datasetScreencount));
			test.log(LogStatus.INFO, "Screenshot Taken : "+Utilities.captureScreenshot(driver, configFileObj.getProperty("HelloChandra"+ i + datasetScreencount)+" is Failed"));
		}
		objDashBoardScreen.clkATrackMyOrder();
		test.log(LogStatus.PASS, "Text is displayed as : TrackMyOrderLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void MyOrderScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 4;
		MyOrderScreen objMyOrderScreen = PageFactory.initElements(driver, MyOrderScreen.class);
		testLogHeader(test, "Verify MyOrderScreen page");
		
		String text1 = objMyOrderScreen.textPYouHavePlacedNoOrders();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("YouHavePlacedNoOrders"+ i + datasetScreencount))){
			test.log(LogStatus.PASS, "Validating Text is displayed as : " + configFileObj.getProperty("YouHavePlacedNoOrders"+ i + datasetScreencount));
			logger.info("Validating Text is displayed as :" + configFileObj.getProperty("YouHavePlacedNoOrders"+ i + datasetScreencount));
		} else {
			test.log(LogStatus.FAIL, "Label Text is not displayed as : " + configFileObj.getProperty("YouHavePlacedNoOrders"+ i + datasetScreencount));
			logger.error("Label Text is not displayed as : " + configFileObj.getProperty("YouHavePlacedNoOrders"+ i + datasetScreencount));
			test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, configFileObj.getProperty("YouHavePlacedNoOrders"+ i + datasetScreencount)+" is Failed"));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  test.log(LogStatus.FAIL, "Element is not found" + e.getLocalizedMessage());
		  logger.error("Element is not found" + e.getLocalizedMessage());
		  test.log(LogStatus.INFO, "Screenshot Taken : " + Utilities.captureScreenshot(driver, e.getLocalizedMessage()));
		}
	}
	

	public void LogoutScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 5;
		LogoutScreen objLogoutScreen = PageFactory.initElements(driver, LogoutScreen.class);
		testLogHeader(test, "Verify LogoutScreen page");
		
		objLogoutScreen.clkALogOut();
		test.log(LogStatus.PASS, "Text is displayed as : LogOutLink");

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
		for(int datasets = 1; datasets <= LogoutScreen.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { HomeScreenTest(datasets);}
			if(isElementDispalyed) { HarborLoginScreenTest(datasets);}
			if(isElementDispalyed) { DashBoardScreenTest(datasets);}
			if(isElementDispalyed) { MyOrderScreenTest(datasets);}
			if(isElementDispalyed) { LogoutScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}