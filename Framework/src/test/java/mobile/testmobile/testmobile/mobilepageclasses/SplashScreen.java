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
public class SplashScreen extends MobileBase {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"mobile_platform\":\"Android\",\"is_web\":false,\"report_upload_url\":\"http://183.82.106.91:8030/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"TestMobile\",\"project_description\":\"Test\",\"project_id\":154,\"module_name\":\"TestMobile\",\"module_description\":\"Test\",\"sub_module_id\":0,\"module_id\":277,\"testcase_name\":\"TC_SignUp_001\",\"testcase_id\":232,\"testset_id\":0,\"executed_timestamp\":-1304132930,\"browser_type\":\"6\",\"file_name\":\"android-debug.apk\"}";

	public static String projectName = "testmobile";
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public SplashScreen(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	@FindBy(how = How.XPATH, using = "//android.widget.Button[@content-desc='START SHOPPING']")	
	private WebElement	STARTSHOPPINGButton;
	public void clkButtonSTARTSHOPPING() {
				
		String text = STARTSHOPPINGButton.getText();
		STARTSHOPPINGButton.click();
	}

}