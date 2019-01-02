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
public class LogOutScreen extends MobileBase {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"mobile_platform\":\"iOS\",\"is_web\":false,\"report_upload_url\":\"http://192.168.1.142:8030/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"MobileDemo\",\"project_description\":\"Having Android and iOS Applications\",\"project_id\":147,\"module_name\":\"iOSDemo\",\"module_description\":\"iOS Mobile Test Cases\",\"sub_module_id\":0,\"module_id\":261,\"testcase_name\":\"TC_DemoiOS_001\",\"testcase_id\":214,\"testset_id\":0,\"executed_timestamp\":-1393004005,\"browser_type\":\"iOS\",\"file_name\":\"Notifii Track.ipa\"}";

	public static String projectName = "mobiledemo";
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public LogOutScreen(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	public void clkButtonLogOut() {
		MobileElement LogOutButton = findElement("//XCUIElementTypeButton[@name='Log Out']");		
		String text = LogOutButton.getText();
		LogOutButton.click();
	}

}