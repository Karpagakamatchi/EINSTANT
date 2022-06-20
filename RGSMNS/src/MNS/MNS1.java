package MNS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class MNS1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, FindFailed {
	  System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\projects\\RGSMNS\\chromedriver.exe");
  	driver = new ChromeDriver();
		driver. manage().window().maximize();
		driver.get("http://mns-ps02.lab.wagerworks.com:8080/MNS2/login.html");// launching the mns URL
		driver.findElement(By.cssSelector("input#userName")).sendKeys("0012");// user id to login to mns
		driver.findElement(By.cssSelector("[name=password]")).sendKeys("12345");//password to mns 
		driver.findElement(By.cssSelector("button.btn")).click();//click on login button
		Thread.sleep(25000);
		driver.findElement(By.xpath("//*[@id=\"ixfInstantWin\"]/div/div[1]/h3")).click();// click on ixf Instant win tag
		Thread.sleep(5000);
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
	    Thread.sleep(1000);
	 	   
		 
		 	   Screen s5 = new Screen();
		 if(s5.exists("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png")!=null)
		 {
		 Pattern autoreveal = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png");
		 Thread.sleep(1000);
		 s5.click(autoreveal);
		 }
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("Celtic Clouds" +Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr[1]/td[4]/table/tbody/tr/td[2]/a[2]")).click();
	    Thread.sleep(10000);
	    String child = driver.getWindowHandle();
	    System.out.printf(child);
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Screen s2 = new Screen();
	    Pattern info = new Pattern("E:\\eclipse\\projects\\RGSMNS\\CC-Info.png");
	    s2.wait(info,10000);
	    s2.click(info);
	    Pattern audio = new Pattern("E:\\eclipse\\projects\\RGSMNS\\CC-audio.png");
	    s2.wait(audio,10000);
	    s2.click(audio);
	    Pattern ok = new Pattern("E:\\eclipse\\projects\\RGSMNS\\CC-ok.png");
	    s2.wait(ok,10000);
	    s2.click(ok);
	    Pattern buy = new Pattern("E:\\eclipse\\projects\\RGSMNS\\CC-buy.png");
	    s2.wait(buy,10000);
	    s2.click(buy);
	    Thread.sleep(1000);
	    Pattern revealall= new Pattern("E:\\eclipse\\projects\\RGSMNS\\CC-revealall.png");
	    s2.wait(revealall,10000);
	    s2.click(revealall);
	    Thread.sleep(10000);
	    driver.close();
	    Thread.sleep(1000);
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).clear();
	    Thread.sleep(2000);
	    Screen s = new Screen();
	    if(s.exists("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png")!=null)
		 {
		 Pattern autoreveal = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png");
		 Thread.sleep(1000);
		 s.click(autoreveal);
		 }
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("Ruby 7's" +Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr/td[4]/table/tbody/tr[3]/td[2]/a[2]")).click();
	    Thread.sleep(1000);
	    driver. manage().window().maximize();
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Screen s1 = new Screen();
	    Pattern info1 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Ruby7's-info.png");
	    s1.wait(info1,10000);
	    s1.click(info1);
	    Pattern audio1 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Ruby7's-audio.png");
	    s1.wait(audio1,10000);
	    s1.click(audio1);
	    Pattern ok1 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Ruby7's-ok.png");
	    s1.wait(ok1,10000);
	    s1.click(ok1);
	    Pattern buy1 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Ruby7's-buy.png");
	    s1.wait(buy1,10000);
	    s1.click(buy1);
	    Thread.sleep(1000);
	    Pattern revealall1= new Pattern("E:\\eclipse\\projects\\RGSMNS\\Ruby7's-revealall.png");
	    s1.wait(revealall1,10000);
	    s1.click(revealall1);
	    Thread.sleep(10000);
	    driver.close();
	    Thread.sleep(1000);
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Thread.sleep(2000);
	    if(s.exists("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png")!=null)
		 {
		 Pattern autoreveal = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png");
		 Thread.sleep(1000);
		 s.click(autoreveal);
		 }
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).clear();
	    Thread.sleep(2000);
	    if(s.exists("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png")!=null)
		 {
		 Pattern autoreveal = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png");
		 Thread.sleep(1000);
		 s.click(autoreveal);
		 }
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("Lucky 7's" +Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr/td[4]/table/tbody/tr[3]/td[2]/a[2]")).click();
	    Thread.sleep(5000);
	    driver. manage().window().maximize();
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Screen l = new Screen();
	    Pattern info2 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-info.png");
	    l.wait(info2,10000);
	    l.click(info2);
	    Pattern audio2 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-audio.png");
	    l.wait(audio2,10000);
	    l.click(audio2);
	    Pattern close  = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-close.png");
	    l.wait(close,10000);
	    l.click(close);
	    Pattern buy2 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-buy.png");
	    l.wait(buy2,10000);
	    l.click(buy2);
	    Thread.sleep(1000);
	    Pattern revealall2= new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-revealall.png");
	    l.wait(revealall2,10000);
	    l.click(revealall2);
	    Thread.sleep(10000);
	    driver.close();
	    Thread.sleep(2000);
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).clear();
	    Thread.sleep(2000);
	    if(s.exists("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png")!=null)
		 {
		 Pattern autoreveal = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Autoreveal.png");
		 Thread.sleep(1000);
		 s.click(autoreveal);
		 }
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section[2]/div/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("Lucky 7's" +Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr/td[4]/table/tbody/tr[3]/td[2]/a[2]")).click();
	    Thread.sleep(5000);
	    driver. manage().window().maximize();
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Screen p = new Screen();
	    Pattern info3 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-info.png");
	    p.wait(info3,10000);
	    p.click(info3);
	    Pattern audio3 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-audio.png");
	    p.wait(audio3,10000);
	    p.click(audio3);
	    Pattern close1  = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-close.png");
	    p.wait(close1,10000);
	    p.click(close1);
	    Pattern buy3 = new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-buy.png");
	    p.wait(buy3,10000);
	    p.click(buy3);
	    Thread.sleep(1000);
	    Pattern revealall3= new Pattern("E:\\eclipse\\projects\\RGSMNS\\Lucky7's-revealall.png");
	    p.wait(revealall3,10000);
	    p.click(revealall3);
	    Thread.sleep(10000);
	    driver.close();
	    Thread.sleep(2000);
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    
	    
	   
	    
  }
}
