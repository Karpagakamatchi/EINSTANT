package PlLottery;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class NewTest3 { 

@Test

 public static void proxy() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\projects\\Polandlottery\\geckodriver.exe");
	  WebDriver driver;
	 
	  FirefoxProfile profile = new FirefoxProfile();
	    profile.setPreference("network.proxy.type", 1);
	    profile.setPreference("network.proxy.http", "localhost");
	    profile.setPreference("network.proxy.http_port", 8080);
	    profile.setPreference("network.proxy.ssl", "localhost");
	    profile.setPreference("network.proxy.ssl_port", 8080);
	 Proxy proxy = new Proxy();
	  String addhost = "hybrid-web.cluster-a.blackspider.com";
	  //String port = "8080";
	//Adding the desired host and port for the http, ssl, and ftp Proxy Servers respectively
	proxy.setHttpProxy(addhost);
	proxy.setSslProxy(addhost);
	//proxy.setSslProxy("<addhost:port>");
	//proxy.setFtpProxy(port);
	
		FirefoxOptions options = new FirefoxOptions();
	options.setCapability("proxy", proxy);
	//Calling new Firefox profile for test
	 driver = new FirefoxDriver(options);
	  
	  driver.manage().window().maximize();	
	   driver.get("https://staging.devlotto.pl/");
  }
}
