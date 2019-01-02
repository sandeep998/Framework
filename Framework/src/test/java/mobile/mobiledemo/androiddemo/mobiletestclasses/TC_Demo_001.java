package mobile.mobiledemo.androiddemo.mobiletestclasses;
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
import mobile.mobiledemo.androiddemo.mobilepageclasses.SplashScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.LoginScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.DashboardScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.ScheduleOverviewScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.PastScheduleScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.ProfileScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.ProfileUpdateScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.MoreScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.LogoutScreen;
import mobile.mobiledemo.androiddemo.mobilepageclasses.LogoutAlertScreen;
import com.utilities.MobileBase;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_Demo_001 extends MobileBase {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
	 String configFileData = "";	public static final int datasetsLength = 1;

	public TC_Demo_001() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_Demo_001.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_demo_001.properties");
		reports = ExtentConfigurations.getExtentInstance(mobileReportsPath, projectPath, SplashScreen.projectName);
		test = reports.startTest("TC_Demo_001");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = SplashScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		appiumDriver = launchMobileDriver(reports);
	}

	public void SplashScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 1;
		SplashScreen objSplashScreen = new SplashScreen(appiumDriver);
		testLogHeader(test, "Verify SplashScreen page");
		objSplashScreen.LabelLOGIN();
		testInfo("Label text value is : " + "LOGIN", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void LoginScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 2;
		LoginScreen objLoginScreen = new LoginScreen(appiumDriver);
		testLogHeader(test, "Verify LoginScreen page");
		objLoginScreen.LabelCancel();
		testInfo("Label text value is : " + "Cancel", test, logger);
		configFileData = configFileObj.getProperty("Username"+ i + datasetScreencount);
		objLoginScreen.fillInputTextUsername(configFileData);
		testPass("Entered Username : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("PasswordEditText"+ i + datasetScreencount);
		objLoginScreen.fillInputTextPasswordEditText(configFileData);
		testPass("Entered PasswordEditText : " + configFileData, test, logger);
		hideKeyboard();
		objLoginScreen.LabelLogin();
		testInfo("Label text value is : " + "Login", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void DashboardScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 3;
		DashboardScreen objDashboardScreen = new DashboardScreen(appiumDriver);
		testLogHeader(test, "Verify DashboardScreen page");
		configFileData = configFileObj.getProperty("Schedule"+ i + datasetScreencount);
		String text1 = objDashboardScreen.LabelSchedule();
		if(text1.equalsIgnoreCase(configFileData)){
			testPass("Validated Text is displayed as : " + configFileData, test, logger);
		} else {
			testFail("Label Text is displayed as : " + configFileData, test, logger, appiumDriver);
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void ScheduleOverviewScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 4;
		ScheduleOverviewScreen objScheduleOverviewScreen = new ScheduleOverviewScreen(appiumDriver);
		testLogHeader(test, "Verify ScheduleOverviewScreen page");
		objScheduleOverviewScreen.LabelMAY22nnMAY28();
		testInfo("Label text value is : " + "MAY22\n-\nMAY28", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void PastScheduleScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 5;
		PastScheduleScreen objPastScheduleScreen = new PastScheduleScreen(appiumDriver);
		testLogHeader(test, "Verify PastScheduleScreen page");
		objPastScheduleScreen.LabelSUMMARY();
		testInfo("Label text value is : " + "SUMMARY", test, logger);
		objPastScheduleScreen.clkImageViewNextIv();
		testInfo("Clicked on " + "NextIv Image", test, logger);
		objPastScheduleScreen.LabelMore();
		testInfo("Label text value is : " + "More", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void ProfileScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 6;
		ProfileScreen objProfileScreen = new ProfileScreen(appiumDriver);
		testLogHeader(test, "Verify ProfileScreen page");
		objProfileScreen.LabelProfile();
		testInfo("Label text value is : " + "Profile", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void ProfileUpdateScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 7;
		ProfileUpdateScreen objProfileUpdateScreen = new ProfileUpdateScreen(appiumDriver);
		testLogHeader(test, "Verify ProfileUpdateScreen page");
		configFileData = configFileObj.getProperty("HelloTest"+ i + datasetScreencount);
		objProfileUpdateScreen.fillInputTextHelloTest(configFileData);
		testPass("Entered HelloTest : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Dgved"+ i + datasetScreencount);
		objProfileUpdateScreen.fillInputTextDgved(configFileData);
		testPass("Entered Dgved : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Adsfsd"+ i + datasetScreencount);
		objProfileUpdateScreen.fillInputTextAdsfsd(configFileData);
		testPass("Entered Adsfsd : " + configFileData, test, logger);
		hideKeyboard();
		objProfileUpdateScreen.LabelSave();
		testInfo("Label text value is : " + "Save", test, logger);
		objProfileUpdateScreen.clkButtonCloseSetup();
		testInfo("Clicked on Link : " + "CloseSetup", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void MoreScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 8;
		MoreScreen objMoreScreen = new MoreScreen(appiumDriver);
		testLogHeader(test, "Verify MoreScreen page");
		objMoreScreen.LabelMore();
		testInfo("Label text value is : " + "More", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void LogoutScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 9;
		LogoutScreen objLogoutScreen = new LogoutScreen(appiumDriver);
		testLogHeader(test, "Verify LogoutScreen page");
		objLogoutScreen.LabelLogout();
		testInfo("Label text value is : " + "Logout", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void LogoutAlertScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 10;
		LogoutAlertScreen objLogoutAlertScreen = new LogoutAlertScreen(appiumDriver);
		testLogHeader(test, "Verify LogoutAlertScreen page");
		objLogoutAlertScreen.LabelLogout();
		testInfo("Label text value is : " + "Logout", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	
	@Test
	public void screensTest() throws Exception {
		isElementDispalyed = true;
		for(int datasets = 1; datasets <= LogoutAlertScreen.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { SplashScreenTest(datasets);}
			if(isElementDispalyed) { LoginScreenTest(datasets);}
			if(isElementDispalyed) { DashboardScreenTest(datasets);}
			if(isElementDispalyed) { ScheduleOverviewScreenTest(datasets);}
			if(isElementDispalyed) { PastScheduleScreenTest(datasets);}
			if(isElementDispalyed) { ProfileScreenTest(datasets);}
			if(isElementDispalyed) { ProfileUpdateScreenTest(datasets);}
			if(isElementDispalyed) { MoreScreenTest(datasets);}
			if(isElementDispalyed) { LogoutScreenTest(datasets);}
			if(isElementDispalyed) { LogoutAlertScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		appiumDriver.quit();
		stopAppiumServer();
	}
}