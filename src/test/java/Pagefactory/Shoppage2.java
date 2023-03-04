package Pagefactory;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Shoppage2 {
		WebDriver driver;
	@Test
	public void verify() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSUSHMAS\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com");
		driver.manage().window().maximize();
		Shoppage shp = new Shoppage(driver);	
		shp.Shopp();
		Thread.sleep(3000);
		
		shp.Wallstickerss();
		Thread.sleep(3000);
		
		shp.ColourSelectionToolss();
	    Thread.sleep(3000);
		
		shp.Adhesivess();
		Thread.sleep(3000);
		
		shp.Disneystickerss();
    	Thread.sleep(3000);
	
	}
	}
