package mobile.mobiledemo.iosdemo.mobiletestclasses;
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
import mobile.mobiledemo.iosdemo.mobilepageclasses.LoginScreen;
import mobile.mobiledemo.iosdemo.mobilepageclasses.LogPackageOutScreen;
import mobile.mobiledemo.iosdemo.mobilepageclasses.MoreScreen;
import mobile.mobiledemo.iosdemo.mobilepageclasses.SearchResidentScreen;
import mobile.mobiledemo.iosdemo.mobilepageclasses.SearchResultsScreen;
import mobile.mobiledemo.iosdemo.mobilepageclasses.SearchResidentBackScreen;
import mobile.mobiledemo.iosdemo.mobilepageclasses.LogOutScreen;
import com.utilities.MobileBase;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_DemoiOS_001 extends MobileBase {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
	 String configFileData = "";	public static final int datasetsLength = 1;

	public TC_DemoiOS_001() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_DemoiOS_001.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_demoios_001.properties");
		reports = ExtentConfigurations.getExtentInstance(mobileReportsPath, projectPath, LoginScreen.projectName);
		test = reports.startTest("TC_DemoiOS_001");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = LoginScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		appiumDriver = launchMobileDriver(reports);
	}

	public void LoginScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 1;
		LoginScreen objLoginScreen = new LoginScreen(appiumDriver);
		testLogHeader(test, "Verify LoginScreen page");
		configFileData = configFileObj.getProperty("Username"+ i + datasetScreencount);
		objLoginScreen.fillInputTextUsername(configFileData);
		testPass("Entered Username : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Password"+ i + datasetScreencount);
		objLoginScreen.fillInputTextPassword(configFileData);
		testPass("Entered Password : " + configFileData, test, logger);
		hideKeyboard();
		objLoginScreen.clkButtonLogIn();
		testInfo("Clicked on Link : " + "LogIn", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void LogPackageOutScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 2;
		LogPackageOutScreen objLogPackageOutScreen = new LogPackageOutScreen(appiumDriver);
		testLogHeader(test, "Verify LogPackageOutScreen page");
		String text1 = objLogPackageOutScreen.clkButtonMore();		 
		configFileData = configFileObj.getProperty("More"+ i + datasetScreencount);
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
	

	public void MoreScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 3;
		MoreScreen objMoreScreen = new MoreScreen(appiumDriver);
		testLogHeader(test, "Verify MoreScreen page");
		objMoreScreen.LabelSearchResident();
		testInfo("Label text value is : " + "SearchResident", test, logger);

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void SearchResidentScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 4;
		SearchResidentScreen objSearchResidentScreen = new SearchResidentScreen(appiumDriver);
		testLogHeader(test, "Verify SearchResidentScreen page");
		configFileData = configFileObj.getProperty("FirstName"+ i + datasetScreencount);
		objSearchResidentScreen.fillInputTextFirstName(configFileData);
		testPass("Entered FirstName : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("LastName"+ i + datasetScreencount);
		objSearchResidentScreen.fillInputTextLastName(configFileData);
		testPass("Entered LastName : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("UnitNumber"+ i + datasetScreencount);
		objSearchResidentScreen.fillInputTextUnitNumber(configFileData);
		testPass("Entered UnitNumber : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Email"+ i + datasetScreencount);
		objSearchResidentScreen.fillInputTextEmail(configFileData);
		testPass("Entered Email : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("Cellphone"+ i + datasetScreencount);
		objSearchResidentScreen.fillInputTextCellphone(configFileData);
		testPass("Entered Cellphone : " + configFileData, test, logger);
		hideKeyboard();
		objSearchResidentScreen.clkButtonSearch();
		testInfo("Clicked on Link : " + "Search", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void SearchResultsScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 5;
		SearchResultsScreen objSearchResultsScreen = new SearchResultsScreen(appiumDriver);
		testLogHeader(test, "Verify SearchResultsScreen page");
		configFileData = configFileObj.getProperty("SearchResults"+ i + datasetScreencount);
		String text1 = objSearchResultsScreen.LabelSearchResults();
		if(text1.equalsIgnoreCase(configFileData)){
			testPass("Validated Text is displayed as : " + configFileData, test, logger);
		} else {
			testFail("Label Text is displayed as : " + configFileData, test, logger, appiumDriver);
		}
		String text2 = objSearchResultsScreen.clkButtonName();		 
		configFileData = configFileObj.getProperty("Name"+ i + datasetScreencount);
		if(text2.equalsIgnoreCase(configFileData)){
			testPass("Validated Button Text : " + configFileData, test, logger);
		} else {
			testFail("Button Text is displayed as : " + configFileData, test, logger, appiumDriver);
		}
		objSearchResultsScreen.clkButtonHeaderBackIcon();
		testInfo("Clicked on Link : " + "HeaderBackIcon", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void SearchResidentBackScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 6;
		SearchResidentBackScreen objSearchResidentBackScreen = new SearchResidentBackScreen(appiumDriver);
		testLogHeader(test, "Verify SearchResidentBackScreen page");
		objSearchResidentBackScreen.clkButtonHeaderBackIcon();
		testInfo("Clicked on Link : " + "HeaderBackIcon", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void LogOutScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 7;
		LogOutScreen objLogOutScreen = new LogOutScreen(appiumDriver);
		testLogHeader(test, "Verify LogOutScreen page");
		objLogOutScreen.clkButtonLogOut();
		testInfo("Clicked on Link : " + "LogOut", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	
	@Test
	public void screensTest() throws Exception {
		isElementDispalyed = true;
		for(int datasets = 1; datasets <= LogOutScreen.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { LoginScreenTest(datasets);}
			if(isElementDispalyed) { LogPackageOutScreenTest(datasets);}
			if(isElementDispalyed) { MoreScreenTest(datasets);}
			if(isElementDispalyed) { SearchResidentScreenTest(datasets);}
			if(isElementDispalyed) { SearchResultsScreenTest(datasets);}
			if(isElementDispalyed) { SearchResidentBackScreenTest(datasets);}
			if(isElementDispalyed) { LogOutScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		appiumDriver.quit();
		stopAppiumServer();
	}
}