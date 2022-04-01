package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinitionDelete extends BaseClass{
	
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
//		@Then("welcome page is displayed")
//		public void welcomePageDisplayed() {
//			String text = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
//			if (text.contains("Welcome")) {
//				System.out.println("The Welcome page is displayed");
//			} else {
//				System.out.println("The Welcome page is not displayed");
//			}
//		}
//
//		@When("the CRMSFA is clicked")
//		public void clickCRMSFALink() {
//			driver.findElement(By.linkText("CRM/SFA")).click();
//		}
//
//		@When("lead button is clicked")
//		public void clickLeadButton() throws InterruptedException {
//			driver.findElement(By.linkText("Leads")).click();
//			Thread.sleep(2000);
//		}

	    @Given("find leads1 is clicked")
		public void clickFindLead() {
			driver.findElement(By.linkText("Find Leads")).click();
			
		}

		@When("phone is clicked")
		public void clickPhone() {
			driver.findElement(By.xpath("(//ul[@class = 'x-tab-strip x-tab-strip-top']//span)[3]")).click();
			}
		
		@And("enter the phone number as {string}")
		public void enterTheFirstName(String phoneNumber) {
		driver.findElement(By.xpath("(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']//input)[13]")).sendKeys(phoneNumber);
		}
		
		@When("find leads button is clicked")
		public void clickFindLeadSubmitButton() throws InterruptedException {
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
		}

		@When("Click 1st resulting lead id")
		public void click1stResultingLead() {
			driver.findElement(By.xpath("(//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		}

		@When("Delete button is clicked")
		public void clickDeleteButton() {
			driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		}
//
//		@And("Close the Browser")
//		public void closeBrowser() {
//			driver.close();
//		}

		
	}


