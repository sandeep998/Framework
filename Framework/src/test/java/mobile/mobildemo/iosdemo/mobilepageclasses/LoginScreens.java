package mobile.mobildemo.iosdemo.mobilepageclasses;
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
public class LoginScreens extends MobileBase {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"mobile_platform\":\"iOS\",\"is_web\":false,\"report_upload_url\":\"http://192.168.1.142:8030/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"MobilDemo\",\"project_description\":\"---Created by Chandra\",\"project_id\":144,\"module_name\":\"iOSDemo\",\"module_description\":\"--iOS\",\"sub_module_id\":0,\"module_id\":257,\"testcase_name\":\"TC_TestiOS\",\"testcase_id\":203,\"testset_id\":0,\"executed_timestamp\":-2010855777,\"browser_type\":\"iOS\",\"file_name\":\"Notifii Track.ipa\"}";

	public static String projectName = "mobildemo";
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public LoginScreens(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	public void fillInputTextUsername(String varInputValue) {
		MobileElement UsernameInputText = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]");
		UsernameInputText.sendKeys(varInputValue);
	}

	public void fillInputTextPassword(String varInputValue) {
		MobileElement PasswordInputText = findElement("/XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField[1]");
		PasswordInputText.sendKeys(varInputValue);
	}

	public String clkButtonLogIn() {
		MobileElement LogInButton = findElement("//XCUIElementTypeButton[@name='Log In']");		
		String text = LogInButton.getText();
		LogInButton.click();
		return text;
	}

}