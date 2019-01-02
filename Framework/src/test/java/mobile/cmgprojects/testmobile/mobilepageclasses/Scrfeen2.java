package mobile.cmgprojects.testmobile.mobilepageclasses;
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
public class Scrfeen2 extends MobileBase {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"mobile_platform\":\"Android\",\"is_web\":false,\"report_upload_url\":\"https://202.153.45.251:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"CMGProjects\",\"project_description\":\"Malleshwar Projects\",\"project_id\":158,\"module_name\":\"TestMobile\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":286,\"testcase_name\":\"ferf\",\"testcase_id\":293,\"testset_id\":0,\"executed_timestamp\":-1603869087,\"browser_type\":\"4\",\"file_name\":\"app-staging-debug.apk\"}";

	public static String projectName = "cmgprojects";
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Scrfeen2(AppiumDriver<MobileElement> appiumDriver) {
		this.appiumDriver = appiumDriver;
		PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
	}

	public void LabelLOGIN() {
		MobileElement LOGINLabel = findElementById("//android.widget.TextView[@resource-id='co.legion.client.staging:id/loginBTN']");		
		String text = LOGINLabel.getText();
		LOGINLabel.click();
	}

}