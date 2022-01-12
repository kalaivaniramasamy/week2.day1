package week2.day1;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Createlead
	{
		
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

			chromeDriver.findElement(By.linkText("Leads")).click();

			Thread.sleep(3000);

			chromeDriver.findElement(By.linkText("Create Lead")).click();
			chromeDriver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			chromeDriver.findElement(By.id("createLeadForm_firstName")).sendKeys("kalaivani");
			chromeDriver.findElement(By.id("createLeadForm_lastName")).sendKeys("ramasamy");
			chromeDriver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/23/1992");
			Select sourceDropDownSelect = new Select(chromeDriver.findElement(By.id("createLeadForm_dataSourceId")));
			sourceDropDownSelect.selectByVisibleText("Employee");
			chromeDriver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("30");
			chromeDriver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9929000633");
			chromeDriver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
			chromeDriver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("kalaivani");
			chromeDriver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kalaivaniramasamyr@gmail.com");
			chromeDriver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://kalaivaniramasamyr@gmail.com");
			chromeDriver.findElement(By.id("createLeadForm_generalToName")).sendKeys("kalaivani");
			chromeDriver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("kalaivani");
			chromeDriver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("9/23,che thottam");
			chromeDriver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("koundampalayam");
			chromeDriver.findElement(By.id("createLeadForm_generalCity")).sendKeys("CBE");
			Select countrySelect = new Select(chromeDriver.findElement(By.id("createLeadForm_generalCountryGeoId")));
			countrySelect.selectByVisibleText("India");
			chromeDriver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("641030");
			chromeDriver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("30");
			Thread.sleep(3000);
			WebElement stateWE = chromeDriver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select stateSelect = new Select(stateWE);
			stateSelect.selectByValue("IN-TN");
			chromeDriver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);

			String pageTitle = chromeDriver.getTitle();
		
			if (pageTitle.startsWith("View Lead"))
			{
				System.out.println("Page Title Received is as expected");
				System.out.println("Page Title : " + chromeDriver.getTitle());
			}
			else
				System.out.println("Page Title is not as expected");

		}
}
