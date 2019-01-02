package web.demoproject.demomodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class HarborLoginScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"is_web\":true,\"project_url\":\"https://www.harborfreight.com/\",\"report_upload_url\":\"http://183.82.106.91:8030/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"DemoProject\",\"project_description\":\"-Having web test classes.\",\"project_id\":93,\"module_name\":\"DemoModule\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":168,\"testcase_name\":\"TC_DemoHarbar_001\",\"testcase_id\":211,\"testset_id\":0,\"executed_timestamp\":-16192715,\"browser_type\":\"chrome\"}";

	public static String projectName = "demoproject";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public HarborLoginScreen(WebDriver driver) {
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
	public void clkSPANLogIn() {
		waitForExpectedElement(driver, LogInSPAN);		
		String text = LogInSPAN.getText();
		LogInSPAN.click();
	}

}