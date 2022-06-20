package PlLottery;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest1 {
  
	  public static WebDriver driver;
		@BeforeMethod
		@Parameters("browser")
		public void beforeMethod(String browser) throws InterruptedException, FindFailed {
			switch(browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\projects\\Polandlottery\\chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				String addproxy = "http://hybrid-web.cluster-a.blackspider.com";
				Proxy proxy = new Proxy();
				proxy.setHttpProxy(addproxy);//http
				proxy.setSslProxy(addproxy);//secure socket layer
				chromeOptions.setCapability("proxy", proxy);
				driver = new ChromeDriver(chromeOptions);
				break;
				
			case "ie":
				  System.setProperty("webdriver.edge.driver","E:\\eclipse\\projects\\Polandlottery\\msedgedriver.exe");
				  EdgeOptions edgeOptions = new EdgeOptions();
				  String addproxy1 = " http://hybrid-web.cluster-a.blackspider.com";
				  Proxy proxy1 = new Proxy();
				  proxy1.setHttpProxy(addproxy1);//http
				  proxy1.setSslProxy(addproxy1);//secure socket layer
				  edgeOptions.setCapability("proxy", proxy1);
				  driver = new EdgeDriver(edgeOptions);
				break;
				
			case"firefox":
				System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\projects\\Polandlottery\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			}
			driver.manage().window().maximize();	
			   driver.get("https://staging.devlotto.pl/");

			   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
			   Thread.sleep(30000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/button/div[2]")).click();
//				//entering uid
				driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("Wat003");
//				//entering password				
				driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
				System.out.println("login button");
				Screen screen1 = new Screen();
				Pattern submit = new Pattern("E:\\eclipse\\projects\\Polandlottery\\loginsubmit.png");
			    screen1.wait(submit,40000); 
			    screen1.click(submit);
//				driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[4]/div/div[1]/div/div/div[2]/div[2]/button")).click();
			
			}
		@Test
		//1
		 public void Kurki () throws InterruptedException, FindFailed {
			 Thread.sleep(5000);
			 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
			 Thread.sleep(5000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			 
			  Screen s3 = new Screen();
			  js.executeScript("window. scrollBy(500,500)");
			  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-fp.png");
			  s3.wait(frontpage,1000);
			  s3.click(frontpage,1000);
			
			   Thread.sleep(5000);
			   js.executeScript("window. scrollBy(0,600)");
			  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-demo.png");
			  s3.wait(demo3,1000);
			  s3.click(demo3);
			  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-audio.png");
			  s3.wait(audio3,1000);
			  s3.doubleClick(audio3);
			  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-ok.png");
			  s3.wait(ok3,1000);
			  s3.click(ok3);
			  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-increase.png");
			  s3.wait(increase3 ,1000);
			  s3.click(increase3);
			  Pattern t3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-demobtn.png");
			  s3.wait(t3,1000);
			  s3.click(t3);
			  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-autobtn.png");
			  s3.wait(ra3,1000);
			  s3.doubleClick(ra3);
			  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
			  s3.wait(home3,1000);
			  s3.click(home3);
			 
		}
  }

