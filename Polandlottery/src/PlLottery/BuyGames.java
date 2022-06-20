package PlLottery;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BuyGames {
	
	public static WebDriver driver;
  @BeforeTest
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
			
		
		}
 
	  driver.manage().window().maximize();	
	   driver.get("https://staging.devlotto.pl/");

	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
	   Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[3]/div[1]/div/div[2]/div[1]/button/div[2]")).click();
//		//entering uid
		driver.findElement(By.xpath("//*[@id=\"username-dropdown-login\"]")).sendKeys("Wat003");
		Thread.sleep(2000);
//		//entering password				
		driver.findElement(By.xpath("//*[@id=\"password-dropdown-login\"]")).sendKeys("Welcome1");
		Thread.sleep(2000);
		System.out.println("login button");
		Screen screen1 = new Screen();
		Pattern submit = new Pattern("E:\\eclipse\\projects\\Polandlottery\\loginsubmit.png");
	    screen1.wait(submit,40000); 
	    screen1.click(submit);
	    Thread.sleep(10000);
	    
		 
  }
		   @Test
			//1
			 public void monetki () throws InterruptedException, FindFailed {
				 
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(1000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s3 = new Screen();
				  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-fp.png");
				  s3.wait(frontpage,10000);
				  s3.click(frontpage);
				  Thread.sleep(2000);
			js.executeScript("window. scrollBy(500,500)");
			Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-demo.png");
				  s3.wait(demo3,10000);
				  s3.click(demo3);
				  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-audio.png");
				  s3.wait(audio3,10000);
				  s3.doubleClick(audio3);
				  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-ok.png");
				  s3.wait(ok3,10000);
				  s3.click(ok3);
				  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-increase.png");
				  s3.wait(increase3 ,10000);
				  s3.click(increase3);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-mtm.png");
				  s3.wait(mtm,10000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-buy.png");
				  s3.wait(buy,10000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\monetki-autobtn.png");
				  s3.wait(ra3,10000);
				  s3.doubleClick(ra3);
				  Thread.sleep(5000);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,10000);
				  s3.click(home3);
  }
		   @Test
			//2
			 public void gp () throws InterruptedException, FindFailed {
				
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s3 = new Screen();
				  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gp-frontpage.png");
				  s3.wait(frontpage,1000);
				  s3.click(frontpage);
			js.executeScript("window. scrollBy(0,600)");
				   Thread.sleep(5000);
				  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-demo.png");
				  s3.wait(demo3,1000);
				  s3.click(demo3);
				  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-audio.png");
				  s3.wait(audio3,1000);
				  s3.doubleClick(audio3);
				  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-ok.png");
				  s3.wait(ok3,1000);
				  s3.click(ok3);
				  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-increase.png");
				  s3.wait(increase3 ,1000);
				  s3.click(increase3);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-mtm.png");
				  s3.wait(mtm,1000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-buy.png");
				  s3.wait(buy,1000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\gp-buy-auto.png");
				  s3.wait(ra3,1000);
				  s3.doubleClick(ra3);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,1000);
				  s3.click(home3);
		   }
		   @Test
			//3
			 public void Gwiazdki () throws InterruptedException, FindFailed {
				
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s3 = new Screen();
				  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-fp.png");
				  s3.wait(frontpage,10000);
				  s3.click(frontpage);
			js.executeScript("window. scrollBy(0,600)");
				   Thread.sleep(5000);
				  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-demo.png");
				  s3.wait(demo3,10000);
				  s3.click(demo3);
				  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-audio.png");
				  s3.wait(audio3,10000);
				  s3.doubleClick(audio3);
				  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-ok.png");
				  s3.wait(ok3,10000);
				  s3.click(ok3);
				  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-increase.png");
				  s3.wait(increase3 ,10000);
				  s3.click(increase3);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-mtm.png");
				  s3.wait(mtm,10000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-buy.png");
				  s3.wait(buy,1000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Gwiazdki-autobtn.png");
				  s3.wait(ra3,10000);
				  s3.doubleClick(ra3);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,10000);
				  s3.click(home3);
				 
			}
		   @Test
			//4
			 public void Kamyki() throws InterruptedException, FindFailed {
				 
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s2 = new Screen();
				  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-fp.png");
				  s2.wait(fp,1000);
				  s2.click(fp);
				  Thread.sleep(5000);
				  js.executeScript("window. scrollBy(0,600)");
				  Pattern demo2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-demo.png");
				  s2.wait(demo2,1000);
				  s2.click(demo2);
				  Pattern audio2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-audio.png");
				  s2.wait(audio2,1000);
				  s2.doubleClick(audio2);
				  Pattern ok2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-ok.png");
				  s2.wait(ok2,1000);
				  s2.click(ok2);
				  Pattern increase2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-increase.png");
				  s2.wait(increase2 ,1000);
				  s2.click(increase2);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-mtm.png");
				  s2.wait(mtm,1000);
				  s2.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-buy.png");
				  s2.wait(buy,1000);
				  s2.click(buy);
				  Pattern ra2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-demoauto.png");
				  s2.wait(ra2,1000);
				  s2.doubleClick(ra2);
				  Pattern home2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s2.wait(home2,1000);
				  s2.click(home2);
			 
			 	 }
		   @Test
			//5
			 public void Kurki () throws InterruptedException, FindFailed {
				
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
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-mtm.png");
				  s3.wait(mtm,1000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-buy.png");
				  s3.wait(buy,1000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Kurki-autobtn.png");
				  s3.wait(ra3,1000);
				  s3.doubleClick(ra3);
				  Thread.sleep(5000);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,1000);
				  s3.click(home3);
				 
			}		
		   @Test()
			//6
		 public void Totemki () throws InterruptedException, FindFailed {
				
				  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				  Thread.sleep(5000);
				 // driver.findElement(By.xpath("//*[@alt=\"Totemki\"]")).click();
				 // Thread.sleep(1000);
				  Screen s = new Screen();
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,5000)");
				  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-fp.png");
				  s.wait(fp,30000);
				  s.click(fp);
				  Thread.sleep(5000);
				  js.executeScript("window. scrollBy(0,600)");
				  Pattern demo = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
				  		  s.wait(demo,1000);
				  s.click(demo);
				  Pattern audio = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-Audio.png");
				  s.wait(audio,1000);
				  s.click(audio);
				  Pattern ok = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-ok.png");
				  s.wait(ok,1000);
				  s.click(ok);
				  Pattern increase = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-increase.png");
				  s.wait(increase ,1000);
				  s.click(increase);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\tot-mtm.png");
				  s.wait(mtm,1000);
				  s.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\tot-buy.png");
				  s.wait(buy,1000);
				  s.click(buy);
				  Pattern ra = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
				  s.wait(ra,5000);
				  s.click(ra);
				  Pattern home = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s.wait(home,5000);
				  s.click(home);
		 }
		   @Test
			//7
			 public void Skrzynki  () throws InterruptedException, FindFailed {
				
				 driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				  Thread.sleep(5000);
				  JavascriptExecutor js = (JavascriptExecutor) driver;
				  Screen s1 = new Screen();
				  js.executeScript("window. scrollBy(500,500)");
				  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-fp.png");
				  s1.wait(fp,30000);
				  s1.click(fp);
				  Thread.sleep(5000);
				 js.executeScript("window. scrollBy(0,600)");
				   Thread.sleep(5000);
				  Pattern demo1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-demo.png");
				  s1.wait(demo1,1000);
				  s1.click(demo1);
				  Pattern audio1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-audio.png");
				  s1.wait(audio1,1000);
				  s1.doubleClick(audio1);
				  Pattern ok1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-ok.png");
				  s1.wait(ok1,1000);
				  s1.click(ok1);
				  Pattern increase1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-increase.png");
				  s1.wait(increase1 ,1000);
				  s1.click(increase1);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\skrzunki-movetomoney.png");
				  s1.wait(mtm,1000);
				  s1.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\skrzynki-buy.png");
				  s1.wait(buy,1000);
				  s1.click(buy);
				  Pattern ra1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-autoreveal.png");
				  s1.wait(ra1,1000);
				  s1.doubleClick(ra1);
				  Pattern home1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s1.wait(home1,1000);
				  s1.click(home1);
			 }
		   @Test
			//8
			 public void Owocki() throws InterruptedException, FindFailed {
				 
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s3 = new Screen();
				  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-fp.png");
				  s3.wait(frontpage,10000);
				  s3.click(frontpage);
			js.executeScript("window. scrollBy(0,600)");
				   Thread.sleep(5000);
				  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-demo.png");
				  s3.wait(demo3,10000);
				  s3.click(demo3);
				  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-audio.png");
				  s3.wait(audio3,10000);
				  s3.doubleClick(audio3);
				  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-ok.png");
				  s3.wait(ok3,10000);
				  s3.click(ok3);
				  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-increase.png");
				  s3.wait(increase3 ,10000);
				  s3.click(increase3);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-mtm.png");
				  s3.wait(mtm,1000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-buy.png");
				  s3.wait(buy,1000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Owocki-autobtn.png");
				  s3.wait(ra3,10000);
				  s3.doubleClick(ra3);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,10000);
				  s3.click(home3);
				 
			}
		   @Test
			//9
			 public void krzyowki() throws InterruptedException, FindFailed {
				
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s3 = new Screen();
				  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-fp.png");
				  s3.wait(frontpage,10000);
				  s3.click(frontpage);
			js.executeScript("window. scrollBy(0,600)");
				   Thread.sleep(5000);
				  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-demo.png");
				  s3.wait(demo3,10000);
				  s3.click(demo3);
				  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-audio.png");
				  s3.wait(audio3,10000);
				  s3.doubleClick(audio3);
				  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-ok.png");
				  s3.wait(ok3,10000);
				  s3.click(ok3);
				  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-increase.png");
				  s3.wait(increase3 ,10000);
				  s3.click(increase3);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-mtm.png");
				  s3.wait(mtm,1000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-buy.png");
				  s3.wait(buy,1000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\krzyowki-autobtn.png");
				  s3.wait(ra3,10000);
				  s3.doubleClick(ra3);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,10000);
				  s3.click(home3);
				 
			}
		   @Test
			//10
			 public void znaczki () throws InterruptedException, FindFailed {
				 
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s3 = new Screen();
				  Pattern frontpage = new Pattern("E:\\eclipse\\projects\\Polandlottery\\znaczki-fp.png");
				  s3.wait(frontpage,10000);
				  s3.click(frontpage);
			js.executeScript("window. scrollBy(0,600)");
				   Thread.sleep(5000);
				  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-demo.png");
				  s3.wait(demo3,10000);
				  s3.click(demo3);
				  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-audio.png");
				  s3.wait(audio3,10000);
				  s3.doubleClick(audio3);
				  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-ok.png");
				  s3.wait(ok3,10000);
				  s3.click(ok3);
				  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-increase.png");
				  s3.wait(increase3 ,10000);
				  s3.click(increase3);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\znaczki-mtm.png");
				  s3.wait(mtm,1000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\znaczki-buy.png");
				  s3.wait(buy,1000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Znaczki-auto.png");
				  s3.wait(ra3,10000);
				  s3.doubleClick(ra3);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,10000);
				  s3.click(home3);
				 
			}
			
		   @Test
			//11
			 
		   public void Siódemki() throws InterruptedException, FindFailed {
				
				 driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
				 Thread.sleep(5000);
				 JavascriptExecutor js = (JavascriptExecutor) driver;
				  js.executeScript("window. scrollBy(500,500)");
				  Screen s3 = new Screen();
				  Pattern fp = new Pattern("E:\\eclipse\\projects\\Polandlottery\siodemki-fp.png");
				  s3.wait(fp,1000);
				  s3.click(fp);
				   Thread.sleep(5000);
				   js.executeScript("window. scrollBy(0,600)");
				  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-demo.png");
				  s3.wait(demo3,1000);
				  s3.click(demo3);
				  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-Audio.png");
				  s3.wait(audio3,1000);
				  s3.doubleClick(audio3);
				  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-ok.png");
				  s3.wait(ok3,1000);
				  s3.click(ok3);
				  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-increase.png");
				  s3.wait(increase3 ,1000);
				  s3.click(increase3);
				  Pattern mtm = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-mtm.png");
				  s3.wait(mtm,1000);
				  s3.click(mtm);
				  Pattern buy = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-buy.png");
				  s3.wait(buy,1000);
				  s3.click(buy);
				  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Siodemki-autobtn.png");
				  s3.wait(ra3,1000);
				  s3.doubleClick(ra3);
				  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
				  s3.wait(home3,1000);
				  s3.click(home3);
				 
			}
}