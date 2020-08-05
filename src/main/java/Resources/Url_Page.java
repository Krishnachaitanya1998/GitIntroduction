package Resources;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Url_Page {
	public WebDriver driver;
	public void Open_Url() throws Exception {
	Properties prop = new Properties();
	FileInputStream fi = new FileInputStream("C:\\Users\\krishna chaitanya\\Real_Time_Project\\src\\main\\java\\Resources\\BasePage.properties");
    prop.load(fi);
    if(prop.getProperty("Browser").equalsIgnoreCase("chrome")){
    	System.setProperty("webdriver.chrome.driver", "C:\\library\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.get(prop.getProperty("Url"));
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    }
    else if(prop.getProperty("Browser").equalsIgnoreCase("firefox")){
    	System.setProperty("webdriver.gecko.driver", "C:\\krrish\\geckodriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	driver.get(prop.getProperty("Url"));
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    }
    
	}
	public void Close_Url() {
		driver.quit();
	}
	
	
	
	

		
	}
	


