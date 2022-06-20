package PlLottery;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class proxy {

@Test
  public void f() throws InterruptedException, FindFailed {
	 
	  System.setProperty("Web.chrome.driver", "E:\\eclipse\\projects\\GAlottery\\chromedriver.exe");//driver location
	  ChromeOptions chromeOptions = new ChromeOptions();
	  String addproxy = " http://hybrid-web.cluster-a.blackspider.com";
	  Proxy proxy = new Proxy();
	  proxy.setHttpProxy(addproxy);//http
	  proxy.setSslProxy(addproxy);//secure socket layer
	  chromeOptions.setCapability("proxy", proxy);
	  WebDriver driver  = new ChromeDriver(chromeOptions);
	  driver.manage().window().maximize();
	  driver.get("https://staging.devlotto.pl/");
	  String parent1=driver.getWindowHandle();// Getting chrome window handle
		 System.out.println("Parent1 window id is "+parent1);// Printing the parent window ID 
		 System.out.println("Title of Child window id - " + driver.getTitle());
		  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
	  Thread.sleep(1000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window. scrollBy(0,500)");
	  driver.findElement(By.xpath("//*[@alt=\"Totemki\"]")).click();
	  Thread.sleep(1000);
	  Screen s = new Screen();
	  Pattern demo = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
	  js.executeScript("window. scrollBy(0,600)");
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
	  Pattern t = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demobutton.png");
	  s.wait(t,1000);
	  s.click(t);
	  Pattern ra = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
	  s.wait(ra,5000);
	  s.click(ra);
	  Pattern home = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s.wait(home,5000);
	  s.click(home);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  /*driver.findElement(By.xpath("/html/body/div/div/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@alt=\"Skrzynki\"]")).click();
	  Thread.sleep(1000);
	  Screen s1 = new Screen();
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
	  Pattern t1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-demotn.png");
	  s1.wait(t1,1000);
	  s1.click(t1);
	  Pattern ra1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Skrzynki-autoreveal.png");
	  s1.wait(ra1,1000);
	  s1.doubleClick(ra1);
	  Pattern home1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s1.wait(home1,1000);
	  s1.click(home1);
	  driver.navigate().back();
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
	   Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@alt=\"Kamyki\"]")).click();
	  Thread.sleep(1000);
	  Screen s2 = new Screen();
	  js.executeScript("window. scrollBy(0,600)");
	   Thread.sleep(5000);
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
	  Pattern t2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-demobtn.png");
	  s2.wait(t2,1000);
	  s2.click(t2);
	  Pattern ra2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\kamyki-demoauto.png");
	  s2.wait(ra2,1000);
	  s2.doubleClick(ra2);
	  Pattern home2 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s2.wait(home2,1000);
	  s2.click(home2);
	  System.setProperty("Web.msedge.driver", "E:\\eclipse\\projects\\GAlottery\\msedgedriver.exe");//driver location
	  EdgeOptions EdgeOptions = new EdgeOptions();
	  String addproxy1 = " http://hybrid-web.cluster-a.blackspider.com";
	  Proxy proxy1 = new Proxy();
	  proxy.setHttpProxy(addproxy1);//http
	  proxy.setSslProxy(addproxy1);//secure socket layer
	  EdgeOptions.setCapability("proxy", proxy1);
	  WebDriver driver1  = new EdgeDriver(EdgeOptions);
	  for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    System.out.println("edgedriver id "+child11);
		}
	  driver1.manage().window().maximize();
	  driver1.get("https://staging.devlotto.pl/");
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
	  Thread.sleep(1000);
	
	   js.executeScript("window. scrollBy(0,500)");
	   Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@alt=\"Siódemki\"]")).click();
	  Thread.sleep(1000);
	  Screen s3 = new Screen();
	  js.executeScript("window. scrollBy(0,600)");
	   Thread.sleep(5000);
	  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
	  s3.wait(demo3,1000);
	  s3.click(demo3);
	  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-Audio.png");
	  s3.wait(audio3,1000);
	  s3.doubleClick(audio3);
	  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-ok.png");
	  s3.wait(ok3,1000);
	  s3.click(ok3);
	  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-increase.png");
	  s3.wait(increase3 ,1000);
	  s3.click(increase3);
	  Pattern t3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demobutton.png");
	  s3.wait(t3,1000);
	  s3.click(t3);
	  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
	  s3.wait(ra3,1000);
	  s3.doubleClick(ra3);
	  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s3.wait(home3,1000);
	  s3.click(home3);
	  */
	  /*
	  driver.findElement(By.xpath("//*[@alt=\"Siódemki\"]")).click();
	  Thread.sleep(1000);
	  Screen s4 = new Screen();
	  js.executeScript("window. scrollBy(0,600)");
	   Thread.sleep(5000);
	  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
	  s4.wait(demo3,1000);
	  s4.click(demo3);
	  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-Audio.png");
	  s4.wait(audio3,1000);
	  s4.doubleClick(audio3);
	  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-ok.png");
	  s4.wait(ok3,1000);
	  s4.click(ok3);
	  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-increase.png");
	  s4.wait(increase3 ,1000);
	  s4.click(increase3);
	  Pattern t3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demobutton.png");
	  s4.wait(t3,1000);
	  s4.click(t3);
	  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
	  s4.wait(ra3,1000);
	  s4.doubleClick(ra3);
	  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s4.wait(home3,1000);
	  s4.click(home3);
	  driver.findElement(By.xpath("//*[@alt=\"Siódemki\"]")).click();
	  Thread.sleep(1000);
	  Screen s5 = new Screen();
	  js.executeScript("window. scrollBy(0,600)");
	   Thread.sleep(5000);
	  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
	  s5.wait(demo3,1000);
	  s5.click(demo3);
	  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-Audio.png");
	  s5.wait(audio3,1000);
	  s5.doubleClick(audio3);
	  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-ok.png");
	  s5.wait(ok3,1000);
	  s5.click(ok3);
	  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-increase.png");
	  s5.wait(increase3 ,1000);
	  s5.click(increase3);
	  Pattern t3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demobutton.png");
	  s5.wait(t3,1000);
	  s5.click(t3);
	  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
	  s5.wait(ra3,1000);
	  s5.doubleClick(ra3);
	  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s5.wait(home3,1000);
	  s5.click(home3);
	  driver.findElement(By.xpath("//*[@alt=\"Siódemki\"]")).click();
	  Thread.sleep(1000);
	  Screen s6 = new Screen();
	  js.executeScript("window. scrollBy(0,600)");
	   Thread.sleep(5000);
	  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
	  s6.wait(demo3,1000);
	  s6.click(demo3);
	  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-Audio.png");
	  s6.wait(audio3,1000);
	  s6.doubleClick(audio3);
	  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-ok.png");
	  s6.wait(ok3,1000);
	  s6.click(ok3);
	  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-increase.png");
	  s6.wait(increase3 ,1000);
	  s6.click(increase3);
	  Pattern t3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demobutton.png");
	  s6.wait(t3,1000);
	  s6.click(t3);
	  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
	  s6.wait(ra3,1000);
	  s6.doubleClick(ra3);
	  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s6.wait(home3,1000);
	  s6.click(home3);
	  driver.findElement(By.xpath("//*[@alt=\"Siódemki\"]")).click();
	  Thread.sleep(1000);
	  Screen s7 = new Screen();
	  js.executeScript("window. scrollBy(0,600)");
	   Thread.sleep(5000);
	  Pattern demo3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demo.png");
	  s7.wait(demo3,1000);
	  s7.click(demo3);
	  Pattern audio3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-Audio.png");
	  s7.wait(audio3,1000);
	  s7.doubleClick(audio3);
	  Pattern ok3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-ok.png");
	  s7.wait(ok3,1000);
	  s7.click(ok3);
	  Pattern increase3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-increase.png");
	  s7.wait(increase3 ,1000);
	  s7.click(increase3);
	  Pattern t3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-demobutton.png");
	  s7.wait(t3,1000);
	  s7.click(t3);
	  Pattern ra3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-revealall.png");
	  s7.wait(ra3,1000);
	  s7.doubleClick(ra3);
	  Pattern home3 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\Tot-try-home.png");
	  s7.wait(home3,1000);
	  s7.click(home3);
	  
	  */
	  
	 
	 
	  
  }
}
