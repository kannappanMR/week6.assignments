package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.xpath("//div[@id='form']/h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("The Welcome page is displayed");
		}
		else {
			System.out.println("The Welcome page is not displayed");
		}
		driver.findElement(By.linkText("CRM/SFA")).click();	
		WebElement element = driver.findElement(By.xpath("//div[text()='My Home']"));
    	System.out.println(element.getText());
		driver.findElement(By.linkText("Leads")).click();	
		WebElement element1 = driver.findElement(By.xpath("//div[text()='My Leads']"));
    	System.out.println(element1.getText());	
	}
	@After
	public void postCondition() {
		driver.close();
	}
}
