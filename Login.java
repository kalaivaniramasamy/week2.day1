package week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Login {
		public static void main(String[] args) 
		{
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kalaivani");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramasamy");
			WebElement options = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dropdown = new Select(options);
			dropdown.selectByIndex(3);
			driver.findElement(By.className("smallSubmit")).click();
			driver.close();
			
		}

	}

