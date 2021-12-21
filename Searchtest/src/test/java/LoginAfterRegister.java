import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAfterRegister {
	public static void main(String[] args) 
	{

		WebDriver driver;
    	System.setProperty("webdriver.chrome.driver","/Users/swethabolloju/Downloads/chromedriver_mac64/chromedriver");
    	driver=new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/register.php";
        	
        driver.get(baseUrl);
        public void login() throws InterruptedException 
        {
      	driver.findElement(By.name("firstName")).sendKeys("Swetha");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("lastName")).sendKeys("Bolloju");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("phone")).sendKeys("4027261314");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("userName")).sendKeys("sbolloju92@gmail.com");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("address1")).sendKeys("18758 Grand ave");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("city")).sendKeys("Omaha");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("state")).sendKeys("NE");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("postalCode")).sendKeys("68022");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("country")).sendKeys("UNITED STATES");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("email")).sendKeys("sbolloju92@gmail.com");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("password")).sendKeys("Anik@2018");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("confirmPassword")).sendKeys("Anik@2018");
      	  Thread.sleep(1000);
      	  driver.findElement(By.name("submit")).click();

}
}
}

