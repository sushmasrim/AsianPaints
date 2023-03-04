package Pagefactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoppage 
	{
		WebDriver driver =null;
		@FindBy(xpath="(//span[@class='iconTextLinks__text visible-in-Desktop'])[6]")
		WebElement shop;
		
		@FindBy(xpath="//a[@href='https://www.asianpaints.com/online-shop/wall-stickers.html'])[1]")
		WebElement Wallstickers;
		
		@FindBy(xpath="//a[@href='https://www.asianpaints.com/shop/product.visualisation-sheets.html?prodcategory=colourselectiontools']")
		WebElement ColourSelectionTools;
		
		@FindBy(xpath="//a[@href='https://www.asianpaints.com/online-shop/Adhesives.html']")
		WebElement Adhesives;
		
		@FindBy(xpath="//a[@href='https://www.asianpaints.com/online-shop/wall-stickers.html'])[1]")
		WebElement Disneystickers;
		
		
		public Shoppage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		public void Shopp()
		{
			shop.click();
		}
		public void Wallstickerss()
		{
			Wallstickers.click();
		}
		public void ColourSelectionToolss()
		{
			ColourSelectionTools.click();
		}
		public void Adhesivess()
		{
			Adhesives.click();
		}
		public void Disneystickerss()
		{
			Disneystickers.click();
		}
	}