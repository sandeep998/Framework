package mobile.testmobile.testmobile.mobilepageclasses;
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
public class SignUpScreen extends MobileBase {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"mobile_platform\":\"Android\",\"is_web\":false,\"report_upload_url\":\"http://183.82.106.91:8030/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"TestMobile\",\"project_description\":\"Test\",\"project_id\":154,\"module_name\":\"TestMobile\",\"module_description\":\"Test\",\"sub_module_id\":0,\"module_id\":277,\"testcase_name\":\"TC_SignUp_001\",\"testcase_id\":232,\"testset_id\":0,\"executed_timestamp\":-1304132930,\"browser_type\":\"6\",\"file_name\":\"android-debug.apk\"}";

	public static String projectName = "testmobile";
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public SignUpScreen(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	public void fillInputTextEmailRequired(String varInputValue) {
		MobileElement EmailRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-email']");
		EmailRequiredInputText.sendKeys(varInputValue);
	}

	public void fillInputTextPasswordRequired(String varInputValue) {
		MobileElement PasswordRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-password']");
		PasswordRequiredInputText.sendKeys(varInputValue);
	}

	public void fillInputTextConfirmNewPasswordRequired(String varInputValue) {
		MobileElement ConfirmNewPasswordRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-password-confirm']");
		ConfirmNewPasswordRequiredInputText.sendKeys(varInputValue);
	}

	public void fillInputTextSomethingExtraID(String varInputValue) {
		MobileElement SomethingExtraIDInputText = findElementById("//android.widget.EditText[@resource-id='registration-loyalty']");
		SomethingExtraIDInputText.sendKeys(varInputValue);
	}

	public void fillInputTextMobileNumber(String varInputValue) {
		MobileElement MobileNumberInputText = findElementById("//android.widget.EditText[@resource-id='registration-telephone-mobile_phone_number']");
		MobileNumberInputText.sendKeys(varInputValue);
	}

	public void fillInputTextHomeNumber(String varInputValue) {
		MobileElement HomeNumberInputText = findElementById("//android.widget.EditText[@resource-id='registration-telephone-home_phone_number']");
		HomeNumberInputText.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Preferred']")	
	private WebElement	PreferredButton;
	public void clkButtonPreferred() {
				
		String text = PreferredButton.getText();
		PreferredButton.click();
	}

	public void fillInputTextFirstNameRequired(String varInputValue) {
		MobileElement FirstNameRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-first-name']");
		FirstNameRequiredInputText.sendKeys(varInputValue);
	}

	public void fillInputTextLastNameRequired(String varInputValue) {
		MobileElement LastNameRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-last-name']");
		LastNameRequiredInputText.sendKeys(varInputValue);
	}

	public void fillInputTextStreetAddressRequired(String varInputValue) {
		MobileElement StreetAddressRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-address1']");
		StreetAddressRequiredInputText.sendKeys(varInputValue);
	}

	public void fillInputTextSecondAddress(String varInputValue) {
		MobileElement SecondAddressInputText = findElementById("//android.widget.EditText[@resource-id='registration-address2']");
		SecondAddressInputText.sendKeys(varInputValue);
	}

	public void fillInputTextCityRequired(String varInputValue) {
		MobileElement CityRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-city']");
		CityRequiredInputText.sendKeys(varInputValue);
	}

	public void fillInputTextZipRequired(String varInputValue) {
		MobileElement ZipRequiredInputText = findElementById("//android.widget.EditText[@resource-id='registration-postal-code']");
		ZipRequiredInputText.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//android.view.View[@content-desc='Sign Up']")	
	private WebElement	SignUpButton;
	public void clkButtonSignUp() {
				
		String text = SignUpButton.getText();
		SignUpButton.click();
	}

}