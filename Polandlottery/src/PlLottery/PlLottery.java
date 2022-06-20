package PlLottery;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class PlLottery {
  @Test
  public void f() throws InterruptedException, FindFailed {
	  
	  System.getProperty("Web.chrome.driver","E:\\eclipse\\projects\\Polandlottery\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
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
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/button[11]")).click();
	  Thread.sleep(10000);
	  Screen s= new Screen();
	  Pattern demo = new Pattern("E:\\eclipse\\projects\\Polandlottery\\bt-demo.png");
	  s.wait(demo,1000);
	  s.click(demo);
	  Pattern audio = new Pattern("E:\\eclipse\\projects\\Polandlottery\\bt-audio.png");
	  s.wait(audio,1000);
	  s.click(audio);
	  Pattern ok = new Pattern("E:\\eclipse\\projects\\Polandlottery\\bt-ok.png");
	  s.wait(ok,1000);
	  s.click(ok);
	  
	  /*
	  //Thread.sleep(10000);
	  //driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]")).click();
	  //driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/button[21]")).click();
	  */
	  System.getProperty("Web.msedge.driver","E:\\eclipse\\projects\\Polandlottery\\msedgedriver.exe");
	  
	  WebDriver tempdriver = new EdgeDriver();
	  
	  for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(child11);
		    System.out.println("edgedriver id "+child11);
		}
	  tempdriver.manage().window().maximize();
	  tempdriver.get("https://staging.devlotto.pl/");
	  String parent2=tempdriver.getWindowHandle();
		 System.out.println("Parent2 window id is "+parent2);//get edge window
		 System.out.println("Title of Child window id - " + tempdriver.getTitle());
	  Thread.sleep(1000);
	  tempdriver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[3]/div[2]/div[3]/div/button")).click();
	  
	Thread.sleep(1000);
	  tempdriver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/button/span[1]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/header/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div[1]/button[11]")).click();
	  Thread.sleep(10000);
	  Screen s1= new Screen();
	  Pattern demo1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\bt-demo.png");
	  s1.wait(demo1,1000);
	  s1.click(demo1);
	  Pattern audio1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\bt-audio.png");
	  s1.wait(audio1,1000);
	  s1.click(audio1);
	  Pattern ok1 = new Pattern("E:\\eclipse\\projects\\Polandlottery\\bt-ok.png");
	  s1.wait(ok1,1000);
	  s1.click(ok1);

	
	  for(String child11 : driver.getWindowHandles())
		{
		    driver.switchTo().window(parent1);
		    System.out.println(""+child11);
		   
		}
	  
	 
	  
  }
}