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
import web.demoproject.testingmodule.webpageclasses.Jghfjhfjgh;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class Dwdwqd extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public Dwdwqd() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(Dwdwqd.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("dwdwqd.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, Jghfjhfjgh.projectName);
		test = reports.startTest("Dwdwqd");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = Jghfjhfjgh.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void JghfjhfjghTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		Jghfjhfjgh objJghfjhfjgh = PageFactory.initElements(driver, Jghfjhfjgh.class);
		testLogHeader(test, "Verify Jghfjhfjgh page");
		
		objJghfjhfjgh.textSTRONGAboutUs();
		logger.info("Label text value is :  AboutUs");
		test.log(LogStatus.INFO, "Label text value is:  AboutUs");
		objJghfjhfjgh.textPABOUTHARBORFREIGHTTOOLSFoundedIn1977HarborFreightToolsIsTheLeadingDiscountToolRetailerInTheUSSellingGreatQualityToolsAtridiculouslyLowPricesInOur900StoresNationwideAndOnItsWebsiteHarborFreightToolsStocksOver7000ItemsInCategoriesIncludingAutomotiveAirAndPowerToolsShopEquipmentAndHandToolsWithACommitmentToQualityAndALifetimeGuaranteeOnAllHandToolsHarborFreightToolsIsAFavoriteOfAutomotiveAndTruckRepairShopsGovernmentAgenciesSchoolsManufacturersContractorsAndToolEnthusiastsWhoWantTopqualityAndGreatSelectionAndValueTheResultsSpeakForThemselvesWithOver40MillionCustomersAndThousandsOfPeopleSwitchingToHarborFreightToolsEveryDay();
		logger.info("Label text value is :  ABOUTHARBORFREIGHTTOOLSFoundedIn1977,HarborFreightToolsIsTheLeadingDiscountToolRetailerInTheU.S.SellingGreatQualityToolsAt\"ridiculouslyLowPrices\"InOur900StoresNationwideAndOnItsWebsite.HarborFreightToolsStocksOver7,000ItemsInCategoriesIncludingAutomotive,AirAndPowerTools,ShopEquipmentAndHandTools.WithACommitmentToQualityAndALifetimeGuaranteeOnAllHandTools,HarborFreightToolsIsAFavoriteOfAutomotiveAndTruckRepairShops,GovernmentAgencies,Schools,Manufacturers,ContractorsAndToolEnthusiastsWhoWantTop-qualityAndGreatSelectionAndValue.TheResultsSpeakForThemselves-WithOver40MillionCustomersAndThousandsOfPeopleSwitchingToHarborFreightToolsEveryDay.");
		test.log(LogStatus.INFO, "Label text value is:  ABOUTHARBORFREIGHTTOOLSFoundedIn1977,HarborFreightToolsIsTheLeadingDiscountToolRetailerInTheU.S.SellingGreatQualityToolsAt\"ridiculouslyLowPrices\"InOur900StoresNationwideAndOnItsWebsite.HarborFreightToolsStocksOver7,000ItemsInCategoriesIncludingAutomotive,AirAndPowerTools,ShopEquipmentAndHandTools.WithACommitmentToQualityAndALifetimeGuaranteeOnAllHandTools,HarborFreightToolsIsAFavoriteOfAutomotiveAndTruckRepairShops,GovernmentAgencies,Schools,Manufacturers,ContractorsAndToolEnthusiastsWhoWantTop-qualityAndGreatSelectionAndValue.TheResultsSpeakForThemselves-WithOver40MillionCustomersAndThousandsOfPeopleSwitchingToHarborFreightToolsEveryDay.");

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
		for(int datasets = 1; datasets <= Jghfjhfjgh.datasetsLength; datasets++) {
			if(!isElementDispalyed) return;			
			setUP();
			if(isElementDispalyed) { JghfjhfjghTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}