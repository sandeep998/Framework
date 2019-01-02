package web.cmgprojects.demo.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class LoginScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":true,\"is_web\":true,\"project_url\":\"https://www.harborfreight.com/\",\"report_upload_url\":\"https://202.153.45.251:8080/TAF_Automation_DR/UploadReportFile\",\"project_name\":\"CMGProjects\",\"project_description\":\"Malleshwar Projects\",\"project_id\":158,\"module_name\":\"Demo\",\"module_description\":\"Demo project for  Harbor Freight Tools\",\"sub_module_id\":0,\"module_id\":283,\"testcase_name\":\"HFT_TC_001\",\"testcase_id\":263,\"testset_id\":0,\"executed_timestamp\":-1148026827,\"browser_type\":\"chrome\"}";

	public static String projectName = "cmgprojects";
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
	public void clkSPANLogIn() {
		waitForExpectedElement(driver, LogInSPAN);		
		String text = LogInSPAN.getText();
		LogInSPAN.click();
	}

}