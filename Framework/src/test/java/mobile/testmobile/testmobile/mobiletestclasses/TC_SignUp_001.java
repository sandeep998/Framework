package mobile.testmobile.testmobile.mobiletestclasses;
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
import mobile.testmobile.testmobile.mobilepageclasses.SplashScreen;
import mobile.testmobile.testmobile.mobilepageclasses.JoinNowScreen;
import mobile.testmobile.testmobile.mobilepageclasses.SignUpScreen;
import com.utilities.MobileBase;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_SignUp_001 extends MobileBase {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;
	 String configFileData = "";	public static final int datasetsLength = 1;

	public TC_SignUp_001() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_SignUp_001.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_signup_001.properties");
		reports = ExtentConfigurations.getExtentInstance(mobileReportsPath, projectPath, SplashScreen.projectName);
		test = reports.startTest("TC_SignUp_001");
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
		objSplashScreen.clkButtonSTARTSHOPPING();
		testInfo("Clicked on Link : " + "STARTSHOPPING", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void JoinNowScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 2;
		JoinNowScreen objJoinNowScreen = new JoinNowScreen(appiumDriver);
		testLogHeader(test, "Verify JoinNowScreen page");
		objJoinNowScreen.clkButtonJOINNOW();
		testInfo("Clicked on Link : " + "JOINNOW", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	

	public void SignUpScreenTest(int i) throws Exception {

	 try {
		addScreensExecutionCount();
		int datasetScreencount = 3;
		SignUpScreen objSignUpScreen = new SignUpScreen(appiumDriver);
		testLogHeader(test, "Verify SignUpScreen page");
		configFileData = configFileObj.getProperty("EmailRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextEmailRequired(configFileData);
		testPass("Entered EmailRequired : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("PasswordRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextPasswordRequired(configFileData);
		testPass("Entered PasswordRequired : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("ConfirmNewPasswordRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextConfirmNewPasswordRequired(configFileData);
		testPass("Entered ConfirmNewPasswordRequired : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("SomethingExtraID"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextSomethingExtraID(configFileData);
		testPass("Entered SomethingExtraID : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("MobileNumber"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextMobileNumber(configFileData);
		testPass("Entered MobileNumber : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("HomeNumber"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextHomeNumber(configFileData);
		testPass("Entered HomeNumber : " + configFileData, test, logger);
		hideKeyboard();
		objSignUpScreen.clkButtonPreferred();
		testInfo("Clicked on Link : " + "Preferred", test, logger);
				configFileData = configFileObj.getProperty("FirstNameRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextFirstNameRequired(configFileData);
		testPass("Entered FirstNameRequired : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("LastNameRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextLastNameRequired(configFileData);
		testPass("Entered LastNameRequired : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("StreetAddressRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextStreetAddressRequired(configFileData);
		testPass("Entered StreetAddressRequired : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("SecondAddress"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextSecondAddress(configFileData);
		testPass("Entered SecondAddress : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("CityRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextCityRequired(configFileData);
		testPass("Entered CityRequired : " + configFileData, test, logger);
		hideKeyboard();
		configFileData = configFileObj.getProperty("ZipRequired"+ i + datasetScreencount);
		objSignUpScreen.fillInputTextZipRequired(configFileData);
		testPass("Entered ZipRequired : " + configFileData, test, logger);
		hideKeyboard();
		objSignUpScreen.clkButtonSignUp();
		testInfo("Clicked on Link : " + "SignUp", test, logger);
		
	   } catch (Exception e) {
		  isElementDispalyed = false;
		  testFail("Element is not found : " + e.getClass().getSimpleName(), test, logger, appiumDriver);
	   }
	}
	
	@Test
	public void screensTest() throws Exception {
		isElementDispalyed = true;
		for(int datasets = 1; datasets <= SignUpScreen.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { SplashScreenTest(datasets);}
			if(isElementDispalyed) { JoinNowScreenTest(datasets);}
			if(isElementDispalyed) { SignUpScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		appiumDriver.quit();
		stopAppiumServer();
	}
}