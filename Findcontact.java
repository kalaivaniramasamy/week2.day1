package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findcontact {

	public static void main(String[] args) throws InterruptedException {

		// Setup the driver
		WebDriverManager.chromedriver().setup();

		// Launch the driver
		ChromeDriver chromeDriver = new ChromeDriver();

		// Load the url
		chromeDriver.get("http://leaftaps.com/opentaps");

		// Maximize the browser
		chromeDriver.manage().window().maximize();

		// Enter the Username
		WebElement userName = chromeDriver.findElement(By.id("username"));

		userName.sendKeys("DemoSalesManager");

		// Enter the password"
		chromeDriver.findElement(By.id("password")).sendKeys("crmsfa");

		Thread.sleep(3000);

		// Click Submit button
		chromeDriver.findElement(By.className("decorativeSubmit")).click();

		Thread.sleep(3000);

		// Click CRM/SFA
		chromeDriver.findElement(By.linkText("CRM/SFA")).click();

		Thread.sleep(3000);

		// Click Contacts tab
		chromeDriver.findElement(By.linkText("Contacts")).click();

		Thread.sleep(3000);

		// Click Find Contacts
		chromeDriver.findElement(By.linkText("Find Contacts")).click();
		
		// Click Email
		chromeDriver.findElement(By.linkText("Email")).click();

		// Enter Email Address
		chromeDriver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");

		Thread.sleep(3000);

		//Click Find Contacts button
		chromeDriver.findElement(By.className("x-btn-text")).click();

	}
}
