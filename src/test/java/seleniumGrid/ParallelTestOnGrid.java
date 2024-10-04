package seleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ParallelTestOnGrid 
{
	WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void testParallel(String bname) throws MalformedURLException, InterruptedException, URISyntaxException 
  {      URL home = new URI("http://localhost:4444").toURL();
		
		System.out.println("chrome Remote connectivity is started");
	  
		if(bname.equals("chrome"))
	    {
		  ChromeOptions chrm=new ChromeOptions();
		   driver=new RemoteWebDriver(home,chrm);
		   
		  System.out.println("chrome Remote connectivity is completed");
		  
	     }
	  
	  else if(bname.equals("firefox"))
	     {
		  System.out.println("firefox Remote connectivity is started");
		  FirefoxOptions fxe=new FirefoxOptions();
		  driver=new RemoteWebDriver(home,fxe);
		    
		  System.out.println("firefox Remote connectivity is completed");
	     }
	  
	  else if(bname.equals("edge"))
	     {
		  System.out.println("edge Remote connectivity is started");
		  EdgeOptions edg=new EdgeOptions();
		  driver=new RemoteWebDriver(home,edg);
		  System.out.println("edge Remote connectivity is completed");
	     }
  
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is: "+driver.getTitle());
	  Thread.sleep(15000);
	  System.out.println("Application title is :"+driver.getTitle());
	  driver.quit();
	  
 
  
  }
}
