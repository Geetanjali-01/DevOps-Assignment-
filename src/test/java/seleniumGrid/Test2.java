package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test2 
{
	WebDriver driver;
  @Test
  public void ParallelTestOnGrid(String bname) throws MalformedURLException, InterruptedException, URISyntaxException 
  
  {
	  if(bname.equals("chrome"))
	    {
		  ChromeOptions cap=new ChromeOptions();
		  
		  URL home = new URI("http://localhots:4444").toURL();
		  
		  driver=new RemoteWebDriver(home,cap);
		  
	     }
	  
	  else if(bname.equals("firefox"))
	     {
		  FirefoxOptions cap=new FirefoxOptions();
		  
		  URL home = new URI("http://localhots:4444").toURL();
		  driver=new RemoteWebDriver(home,cap);
		    // driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
		  
	     }
	  
	  else if(bname.equals("edge"))
	     {
		  EdgeOptions cap=new EdgeOptions();
		  URL home = new URI("http://localhots:4444").toURL();
		  driver=new RemoteWebDriver(home,cap);
		  //driver=new RemoteWebDriver(new URL("http://localhost:4444"),cap);
	     }

	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is: "+driver.getTitle());
	  Thread.sleep(15000);
	  driver.quit();
	  



  

  
  }
}



/*package seleniumGrid;

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
  @Test
  public void testParallel(String bname) throws MalformedURLException, InterruptedException, URISyntaxException 
  {   System.out.println("chrome Remote connectivity is started");
	  if(bname.equals("chrome"))
	    {
		  ChromeOptions cap=new ChromeOptions();
		  
		  URL home = new URI("http://localhots:4444").toURL();
		  
		  driver=new RemoteWebDriver(home,cap);
		  System.out.println("chrome Remote connectivity is complated");
		  
	     }
	  
	  else if(bname.equals("firefox"))
	     {
		  System.out.println("firefox Remote connectivity is started");
		  FirefoxOptions cap=new FirefoxOptions();
		  
		  URL home = new URI("http://localhots:4444").toURL();
		  driver=new RemoteWebDriver(home,cap);
		    
		  System.out.println("firefox Remote connectivity is complated");
	     }
	  
	  else if(bname.equals("edge"))
	     {
		  System.out.println("edge Remote connectivity is started");
		  EdgeOptions cap=new EdgeOptions();
		  URL home = new URI("http://localhots:4444").toURL();
		  driver=new RemoteWebDriver(home,cap);
		  System.out.println("edge Remote connectivity is complated");
	     }
  
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is: "+driver.getTitle());
	  Thread.sleep(15000);
	  System.out.println("Application title is :"+driver.getTitle());
	  driver.quit();
	  
 
  
  }
} */
