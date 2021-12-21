import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestTest {
	WebDriver driver;
	@BeforeTest
	private void beforetest()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/swethabolloju/Downloads/chromedriver_mac64/chromedriver");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	private void open()
	{
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
	}
  @Test
  public void LoginApp()
  {
	  driver.findElement(By.id("email")).sendKeys("sbolloju92@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Anik@2018");
	  driver.findElement(By.name("submit")).click();
	  
  }
}
