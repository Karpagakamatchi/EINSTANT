package MNS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class MNSTranscation {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, FindFailed {
	  System.setProperty("webdriver.msedge.driver","E:\\eclipse\\projects\\RGSMNS\\msedgedriver.exe");
		driver = new EdgeDriver();
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
	    Thread.sleep(5000);
	    
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
	    driver.findElement(By.xpath("//*[@id=\"skb-gamelist-wrapper\"]/div[1]/table/tbody/tr/td[4]/table/tbody/tr[3]/td[2]/a[2]")).click();
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
	    
	    driver.findElement(By.xpath("/html/body/div/div/aside/section/ul/li[5]/a")).click();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("/html/body/div/div/aside/section/ul/li[5]/ul/li/a")).click();
	    Thread.sleep(2000);
	    for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    
		}
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("#msg-list-wrapper > table > tbody > tr:nth-child(3) > td:nth-child(8) > a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/form/div[2]/button[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/section/div/div/div/div[2]/div/ul/li[2]/a")).click();
	Thread.sleep(1000);
  }
}
