package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class SingleTest 
{
  @Test
  public void testOnRemoteURLException () throws MalformedURLException, URISyntaxException, InterruptedException 
  {        System.out.println("Chrome Remote connectivity is started");
  
           ChromeOptions cap1 = new ChromeOptions();
           URL home1 = new URI("http://localhost:4444").toURL();
           WebDriver driver1 = new RemoteWebDriver (home1,cap1);
           System.out.println("Chrome remote connectivity is completed");
          
    
           System.out.println("Firefox Remote connectivity is started");
          
           FirefoxOptions cap2 = new FirefoxOptions();
           URL home2 = new URI("http://localhost:4444").toURL();
           WebDriver driver2 = new RemoteWebDriver (home2,cap2);
           System.out.println("Firefox remote connectivity is completed");
           
           
           System.out.println("Edge remote connectivity is started");
           EdgeOptions cap3 = new EdgeOptions();
           URL home3 = new URI("http://localhost:4444").toURL();
           WebDriver driver3 = new RemoteWebDriver (home3,cap3);
           System.out.println("Edge remote connectivity is completed");
           
           
           Thread.sleep(5000);
           
           driver1.get("https://www.amazon.in");
         driver2.get("https://www.amazon.in");
           driver3.get("https://www.amazon.in");
           
           Thread.sleep(10000);
           
           System.out.println("Application title is :"+driver1.getTitle());
           
           driver1.quit();
           driver2.quit();
           driver3.quit();
  
  
  }
}
