package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionEdit extends BaseClass{

//	@Given("Chrome browser is launched {string}")
//	public void launchBrowser(String browser) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//
//	@And("leaftaps URL is loaded {string}")
//	public void loadUrl(String url) {
//		driver.get(url);
//	}
//
//	@And("window has been maximized")
//	public void maximizeWindow() {
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//
//	@Given("enter the username as {string}")
//	public void enterUserName(String username) {
//		driver.findElement(By.id("username")).sendKeys(username);
//	}
//
//	@And("enter the password as {string}")
//	public void enterPassword(String password) {
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@When("login button is clicked")
//	public void clickLoginButton() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//	}
//
//	@Then("welcome page is displayed")
//	public void welcomePageDisplayed() {
//		String text = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
//		if (text.contains("Welcome")) {
//			System.out.println("The Welcome page is displayed");
//		} else {
//			System.out.println("The Welcome page is not displayed");
//		}
//	}
//
//	@When("the CRMSFA is clicked")
//	public void clickCRMSFALink() {
//		driver.findElement(By.linkText("CRM/SFA")).click();
//	}
//
//	@When("lead button is clicked")
//	public void clickLeadButton() {
//		driver.findElement(By.linkText("Leads")).click();
//	}

	@Given("find leads is clicked")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("enter the First name as Test")
	public void enterTheFirstName() {
		driver.findElement(By.xpath("//div[@class ='x-tab-panel']//input[@name='firstName']")).sendKeys("test");
	}

	@And("findlead submit button is clicked")
	public void clickFindLeadSubmitButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
	}

	@When("1st resulting lead id is clicked")
	public void click1stResultingLead() {
		driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	}

	@Then("editlead page is displayed")
	public void editLeadPageDisplayed() {
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println("i conform that the title is View Lead");
		} else {
			System.out.println("i conform that the title has not View Lead");
		}
	}

	@And("edit button is clicked")
	public void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("company name is cleared")
	public void clearCompanyName() {
		driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).clear();
	}

	@And("enter the company name as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.xpath("//input[@id = 'updateLeadForm_companyName']")).sendKeys(companyName);
	}

	@And("click submit button")
	public void clickSubmitButton() {
		driver.findElement(By.xpath("//input[@class = 'smallSubmit']")).click();
	}

//	@And("Close the Browser")
//	public void closeBrowser() {
//		driver.close();
//	}
}
