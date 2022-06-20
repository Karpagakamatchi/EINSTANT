package MNS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class MNSp2 {
  WebDriver driver;
  @BeforeMethod
  @Parameters("browser")
		public void beforeMethod(String browser) throws InterruptedException, FindFailed {
			switch(browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\projects\\RGSMNS\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
				
			case "ie":
				  System.setProperty("webdriver.edge.driver","E:\\eclipse\\projects\\RGSMNS\\msedgedriver.exe");
				  driver = new EdgeDriver();
				break;
				
			case"firefox":
				System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\projects\\RGSMNS\\msedgedriver.exe");
				driver = new FirefoxDriver();
				break;
			}
			driver. manage().window().maximize();
			driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");// launching the mns URL
			driver.findElement(By.cssSelector("input#userName")).sendKeys("0012");// user id to login to mns
			driver.findElement(By.cssSelector("[name=password]")).sendKeys("12345");//password to mns 
			driver.findElement(By.cssSelector("button.btn")).click();//click on login button
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"ixfInstantWin\"]/div/div[1]/h3")).click();// click on ixf Instant win tag
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[1]/div/span/span[1]/span/span[2]")).click();// Click on drop down RGS server 
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("RGS-CUST03" +Keys.ENTER);// enter server name
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[2]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GALT" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[3]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GG02" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"skbEInstant_player\"]")).sendKeys("Kam" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"skbEInstant_password\"]")).sendKeys("12345" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[6]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("USD" +Keys.ENTER);//currency
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[7]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("GB" +Keys.ENTER);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[8]/div/span/span[1]/span/span[2]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("en" +Keys.ENTER,Keys.TAB);
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"resources\"]/form/div/div[9]/div[1]/button")).click();
		    Thread.sleep(5000);
		   driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[1]/a[2]/i/span")).click();
		   Thread.sleep(1000);
	  
	  
  }
}
