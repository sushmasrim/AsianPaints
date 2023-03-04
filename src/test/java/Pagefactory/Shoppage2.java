package Pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	public class Shoppage2 {
	@Test
	public void verify() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSUSHMAS\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
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