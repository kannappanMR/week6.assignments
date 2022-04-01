package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.This;



public class StepDefinitionCreate extends BaseClass{

//	@Given("A Chrome browser is launched")
//	public void launchBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//
//	@And("Load the Leaftaps url {string}")
//	public void loadUrl(String url) {
//		driver.get(url);
//	}
//	@And("maximize the browser")
//	public void maximizeBrowser() {
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//
//	@And("enter the username as Demosalesmanager")
//	public void enterUsername() {
//		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
//	}
//
//	@And("enter the password as crmsfa")
//	public void enterPassword() {
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//	}
//
//	@When("the login button is clicked")
//	public void clickLogin() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//	}
//	@Then("the welcome page should be displayed")
//	public void welcomePageDisplayed() {
//		String text = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
//		if (text.contains("Welcome")) {
//			System.out.println("The Welcome page is displayed");
//		}
//		else {
//			System.out.println("The Welcome page is not displayed");
//		}
//	}
//	 @When("the {string} is clicked")
//		public void clickCrmsfa(String linkText) {
//			driver.findElement(By.linkText(linkText)).click();		
//		}	
//	    @Then("the {string} page should be displayed")
//	    public void pageDisplayed(String pageText) {
//	    	WebElement element = driver.findElement(By.xpath("//div[text()='"+pageText+"']"));
//	    	System.out.println(element.getText());
//	    }
		@Given("the Create Lead button is clicked")
		public void clickCreateLeadButton() {
			driver.findElement(By.linkText("Create Lead")).click();
		}
		@And("enter the Company Name as siemens")
		public void enterCompanyName() {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("siemens");
		}
		@And("enter the First Name as kanna")
		public void enterFirstName() {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kanna");
		}
		@And("enter the Last Name as vinoth")
		public void enterLastName() {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vinoth");
		}
		@When("the Submit button is clicked")
		public void clickSubmit() {
			driver.findElement(By.className("smallSubmit")).click();
		}
//		@And("close the browser")
//		public void closeWindow() {
//			driver.close();
//		}
	   
	}


