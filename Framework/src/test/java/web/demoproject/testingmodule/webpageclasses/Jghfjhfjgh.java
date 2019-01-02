package web.demoproject.testingmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Jghfjhfjgh extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"is_web\":true,\"project_url\":\"https://www.harborfreight.com/\",\"report_upload_url\":\"http://183.82.106.91:8030/TAF_Automation/UploadReportFile\",\"project_name\":\"DemoProject\",\"project_description\":\"-Having web test classes.\",\"project_id\":93,\"module_name\":\"TestingModule\",\"module_description\":\"Testing diff\",\"sub_module_id\":0,\"module_id\":253,\"testcase_name\":\"dwdwqd\",\"testcase_id\":205,\"testset_id\":0,\"executed_timestamp\":-2000853065,\"browser_type\":\"chrome\"}";

	public static String projectName = "demoproject";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Jghfjhfjgh(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//DIV[@id='shopnow_overlay']/STRONG[1]")	
	private WebElement	AboutUsSTRONG;
	public String textSTRONGAboutUs() {
		waitForExpectedElement(driver, AboutUsSTRONG);		
		String text = AboutUsSTRONG.getText();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//DIV[@id='footer']/DIV[4]/P[3]")	
	private WebElement	ABOUTHARBORFREIGHTTOOLSFoundedIn1977HarborFreightToolsIsTheLeadingDiscountToolRetailerInTheUSSellingGreatQualityToolsAtridiculouslyLowPricesInOur900StoresNationwideAndOnItsWebsiteHarborFreightToolsStocksOver7000ItemsInCategoriesIncludingAutomotiveAirAndPowerToolsShopEquipmentAndHandToolsWithACommitmentToQualityAndALifetimeGuaranteeOnAllHandToolsHarborFreightToolsIsAFavoriteOfAutomotiveAndTruckRepairShopsGovernmentAgenciesSchoolsManufacturersContractorsAndToolEnthusiastsWhoWantTopqualityAndGreatSelectionAndValueTheResultsSpeakForThemselvesWithOver40MillionCustomersAndThousandsOfPeopleSwitchingToHarborFreightToolsEveryDayP;
	public String textPABOUTHARBORFREIGHTTOOLSFoundedIn1977HarborFreightToolsIsTheLeadingDiscountToolRetailerInTheUSSellingGreatQualityToolsAtridiculouslyLowPricesInOur900StoresNationwideAndOnItsWebsiteHarborFreightToolsStocksOver7000ItemsInCategoriesIncludingAutomotiveAirAndPowerToolsShopEquipmentAndHandToolsWithACommitmentToQualityAndALifetimeGuaranteeOnAllHandToolsHarborFreightToolsIsAFavoriteOfAutomotiveAndTruckRepairShopsGovernmentAgenciesSchoolsManufacturersContractorsAndToolEnthusiastsWhoWantTopqualityAndGreatSelectionAndValueTheResultsSpeakForThemselvesWithOver40MillionCustomersAndThousandsOfPeopleSwitchingToHarborFreightToolsEveryDay() {
		waitForExpectedElement(driver, ABOUTHARBORFREIGHTTOOLSFoundedIn1977HarborFreightToolsIsTheLeadingDiscountToolRetailerInTheUSSellingGreatQualityToolsAtridiculouslyLowPricesInOur900StoresNationwideAndOnItsWebsiteHarborFreightToolsStocksOver7000ItemsInCategoriesIncludingAutomotiveAirAndPowerToolsShopEquipmentAndHandToolsWithACommitmentToQualityAndALifetimeGuaranteeOnAllHandToolsHarborFreightToolsIsAFavoriteOfAutomotiveAndTruckRepairShopsGovernmentAgenciesSchoolsManufacturersContractorsAndToolEnthusiastsWhoWantTopqualityAndGreatSelectionAndValueTheResultsSpeakForThemselvesWithOver40MillionCustomersAndThousandsOfPeopleSwitchingToHarborFreightToolsEveryDayP);		
		String text = ABOUTHARBORFREIGHTTOOLSFoundedIn1977HarborFreightToolsIsTheLeadingDiscountToolRetailerInTheUSSellingGreatQualityToolsAtridiculouslyLowPricesInOur900StoresNationwideAndOnItsWebsiteHarborFreightToolsStocksOver7000ItemsInCategoriesIncludingAutomotiveAirAndPowerToolsShopEquipmentAndHandToolsWithACommitmentToQualityAndALifetimeGuaranteeOnAllHandToolsHarborFreightToolsIsAFavoriteOfAutomotiveAndTruckRepairShopsGovernmentAgenciesSchoolsManufacturersContractorsAndToolEnthusiastsWhoWantTopqualityAndGreatSelectionAndValueTheResultsSpeakForThemselvesWithOver40MillionCustomersAndThousandsOfPeopleSwitchingToHarborFreightToolsEveryDayP.getText();
		return text;
	}

}