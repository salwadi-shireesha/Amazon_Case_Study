package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

public static WebDriver driver;
public Logger logger;
public Properties p;

	@BeforeClass(groups= {"Sanity", "Regression","Master"})
	public void setUp() throws IOException {
		
		//Loading config.properties file
		FileReader file=new FileReader(".//src//test//resources//Config.properties");
		p=new Properties();
		p.load(file);
				
		logger=LogManager.getLogger(this.getClass());
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
	}
	
	@AfterClass(groups= {"Sanity", "Regression","Master"})
		public void tearDown() {
			driver.quit();
		}
		
	public void captureScreen(String tname) throws IOException {

				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
	}
	
}
