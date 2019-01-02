package mobile.mobildemo.iosdemo.mobiletestclasses;
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
import mobile.mobildemo.iosdemo.mobilepageclasses.LoginScreens;
import mobile.mobildemo.iosdemo.mobilepageclasses.AlertScreen;
import mobile.mobildemo.iosdemo.mobilepageclasses.MoewScreen;
import mobile.mobildemo.iosdemo.mobilepageclasses.ResidentScreen;
import mobile.mobildemo.iosdemo.mobilepageclasses.SearchScreen;
import com.utilities.MobileBase;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_TestiOS extends MobileBase {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
	 String configFileData = "";	public static final int datasetsLength = 1;

	public TC_TestiOS() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_TestiOS.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_testios.properties");
		reports = ExtentConfigurations.getExtentInstance(mobileReportsPath, projectPath, LoginScreens.projectName);
		test = reports.startTest("TC_TestiOS");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = LoginScreens.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		appiumDriver = launchMobileDriver(reports);
	}

	public void LoginScreensTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 1;
		LoginScreens objLoginScreens = new LoginScreens(appiumDriver);
		testLogHeader(test, "Verify LoginScreens page");
		configFileData = configFileObj.getProperty("Username"+ i + datasetScreencount);
		objLoginScreens.fillInputTextUsername(configFileData);
		testPass("Entered Username : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Password"+ i + datasetScreencount);
		objLoginScreens.fillInputTextPassword(configFileData);
		testPass("Entered Password : " + configFileData, test, logger);
		hideKeyboard();
		String text3 = objLoginScreens.clkButtonLogIn();		 configFileData = configFileObj.getProperty("LogIn"+ i + datasetScreencount);
		if(text3.equalsIgnoreCase(configFileData)){
			testPass("Validated Button Text : " + configFileData, test, logger);
			testPass("Clicked on Button : " + configFileData, test, logger);
		} else {
			testFail("Button Text is displayed as : " + configFileData, test, logger, appiumDriver);
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void AlertScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 2;
		AlertScreen objAlertScreen = new AlertScreen(appiumDriver);
		testLogHeader(test, "Verify AlertScreen page");
		String text1 = objAlertScreen.clkButtonOK();		 configFileData = configFileObj.getProperty("OK"+ i + datasetScreencount);
		if(text1.equalsIgnoreCase(configFileData)){
			testPass("Validated Button Text : " + configFileData, test, logger);
			testPass("Clicked on Button : " + configFileData, test, logger);
		} else {
			testFail("Button Text is displayed as : " + configFileData, test, logger, appiumDriver);
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void MoewScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 3;
		MoewScreen objMoewScreen = new MoewScreen(appiumDriver);
		testLogHeader(test, "Verify MoewScreen page");
		objMoewScreen.clkButtonMore();
		testInfo("Clicked on Link : " + "???More", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void ResidentScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 4;
		ResidentScreen objResidentScreen = new ResidentScreen(appiumDriver);
		testLogHeader(test, "Verify ResidentScreen page");
		configFileData = configFileObj.getProperty("SearchResident"+ i + datasetScreencount);
		String text1 = objResidentScreen.LabelSearchResident();
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
	

	public void SearchScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 5;
		SearchScreen objSearchScreen = new SearchScreen(appiumDriver);
		testLogHeader(test, "Verify SearchScreen page");
		configFileData = configFileObj.getProperty("FirstName"+ i + datasetScreencount);
		objSearchScreen.fillInputTextFirstName(configFileData);
		testPass("Entered FirstName : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("LastName"+ i + datasetScreencount);
		objSearchScreen.fillInputTextLastName(configFileData);
		testPass("Entered LastName : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Email"+ i + datasetScreencount);
		objSearchScreen.fillInputTextEmail(configFileData);
		testPass("Entered Email : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Cellphone"+ i + datasetScreencount);
		objSearchScreen.fillInputTextCellphone(configFileData);
		testPass("Entered Cellphone : " + configFileData, test, logger);
		hideKeyboard();
		String text5 = objSearchScreen.clkButtonSearch();		 configFileData = configFileObj.getProperty("Search"+ i + datasetScreencount);
		if(text5.equalsIgnoreCase(configFileData)){
			testPass("Validated Button Text : " + configFileData, test, logger);
			testPass("Clicked on Button : " + configFileData, test, logger);
		} else {
			testFail("Button Text is displayed as : " + configFileData, test, logger, appiumDriver);
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	
	@Test
	public void screensTest() throws Exception {
		isElementDispalyed = true;
		for(int datasets = 1; datasets <= SearchScreen.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { LoginScreensTest(datasets);}
			if(isElementDispalyed) { AlertScreenTest(datasets);}
			if(isElementDispalyed) { MoewScreenTest(datasets);}
			if(isElementDispalyed) { ResidentScreenTest(datasets);}
			if(isElementDispalyed) { SearchScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		appiumDriver.quit();
		stopAppiumServer();
	}
}