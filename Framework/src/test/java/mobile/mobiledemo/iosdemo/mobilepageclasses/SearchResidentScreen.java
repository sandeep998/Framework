package mobile.mobiledemo.iosdemo.mobilepageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.MobileBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class SearchResidentScreen extends MobileBase {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"mobile_platform\":\"iOS\",\"is_web\":false,\"report_upload_url\":\"http://192.168.1.142:8030/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"MobileDemo\",\"project_description\":\"Having Android and iOS Applications\",\"project_id\":147,\"module_name\":\"iOSDemo\",\"module_description\":\"iOS Mobile Test Cases\",\"sub_module_id\":0,\"module_id\":261,\"testcase_name\":\"TC_DemoiOS_001\",\"testcase_id\":214,\"testset_id\":0,\"executed_timestamp\":-1393004005,\"browser_type\":\"iOS\",\"file_name\":\"Notifii Track.ipa\"}";

	public static String projectName = "mobiledemo";
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public SearchResidentScreen(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	public void fillInputTextFirstName(String varInputValue) {
		MobileElement FirstNameInputText = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[1]");
		FirstNameInputText.sendKeys(varInputValue);
	}

	public void fillInputTextLastName(String varInputValue) {
		MobileElement LastNameInputText = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[2]");
		LastNameInputText.sendKeys(varInputValue);
	}

	public void fillInputTextUnitNumber(String varInputValue) {
		MobileElement UnitNumberInputText = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[3]");
		UnitNumberInputText.sendKeys(varInputValue);
	}

	public void fillInputTextEmail(String varInputValue) {
		MobileElement EmailInputText = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[4]");
		EmailInputText.sendKeys(varInputValue);
	}

	public void fillInputTextCellphone(String varInputValue) {
		MobileElement CellphoneInputText = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeTextField[5]");
		CellphoneInputText.sendKeys(varInputValue);
	}

	public void clkButtonSearch() {
		MobileElement SearchButton = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeScrollView[1]/XCUIElementTypeButton[1]");		
		String text = SearchButton.getText();
		SearchButton.click();
	}

}