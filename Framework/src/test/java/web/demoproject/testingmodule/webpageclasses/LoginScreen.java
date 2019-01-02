package web.demoproject.testingmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class LoginScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"is_web\":true,\"project_url\":\"https://www.harborfreight.com/\",\"report_upload_url\":\"http://192.168.1.142:8030/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"DemoProject\",\"project_description\":\"-Having web test classes.\",\"project_id\":93,\"module_name\":\"TestingModule\",\"module_description\":\"Testing diff\",\"sub_module_id\":0,\"module_id\":253,\"testcase_name\":\"TC_HFTLogin_01\",\"testcase_id\":197,\"testset_id\":0,\"executed_timestamp\":-1816074887,\"browser_type\":\"safari\"}";

	public static String projectName = "demoproject";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public LoginScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='email']")	
	private WebElement	EmailAddressINPUT;
	public void fillINPUTEmailAddress(String varInputValue) {
		waitForExpectedElement(driver, EmailAddressINPUT);
		EmailAddressINPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='pass']")	
	private WebElement	PasswordINPUT;
	public void fillINPUTPassword(String varInputValue) {
		waitForExpectedElement(driver, PasswordINPUT);
		PasswordINPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//BUTTON[@id='sign-in-button']/SPAN[1]")	
	private WebElement	LogInSPAN;
	public String clkSPANLogIn() {
		waitForExpectedElement(driver, LogInSPAN);		
		String text = LogInSPAN.getText();
		LogInSPAN.click();
		return text;
	}

}