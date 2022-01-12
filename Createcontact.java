package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("http://leaftaps.com/opentaps");
		chromeDriver.manage().window().maximize();
		WebElement userName = chromeDriver.findElement(By.id("username"));

		userName.sendKeys("DemoSalesManager");

		chromeDriver.findElement(By.id("password")).sendKeys("crmsfa");

		Thread.sleep(3000);
		chromeDriver.findElement(By.className("decorativeSubmit")).click();

		Thread.sleep(3000);

		chromeDriver.findElement(By.linkText("CRM/SFA")).click();

		Thread.sleep(3000);

		chromeDriver.findElement(By.linkText("Contacts")).click();

		Thread.sleep(3000);

		chromeDriver.findElement(By.linkText("Create Contact")).click();

		
		WebElement firstNameWE = chromeDriver.findElement(By.id("firstNameField"));
		firstNameWE.sendKeys("kalaivani");

		String firstName = firstNameWE.getAttribute("value");

		chromeDriver.findElement(By.id("lastNameField")).sendKeys("Ramasamy");

		Thread.sleep(3000);

		chromeDriver.findElement(By.className("smallSubmit")).click();

		System.out.println("Browser Title : " + chromeDriver.getTitle());

		System.out.println("First Name : " + firstName);

		chromeDriver.close();

	}

}
