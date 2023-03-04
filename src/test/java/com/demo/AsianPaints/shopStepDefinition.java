package com.demo.AsianPaints;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class shopStepDefinition
{
	WebDriver driver;
	@Given("I am on the Asian paints website")
	public void i_am_on_the_Asian_paints_website() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSUSHMAS\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.asianpaints.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
		cookies.click();
	}

@When("I click on shop")
public void i_click_on_shop() throws InterruptedException {
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[6]"))).build().perform();	
	Thread.sleep(3000);
	
}

@Then("I should navigate to the shop page")
public void i_should_navigate_to_the_shop_page() {
	
}

@Given("I am on the shop page")
public void i_am_on_the_shop_page() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSUSHMAS\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.asianpaints.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
	cookies.click();
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[6]"))).click().build().perform();	
	Thread.sleep(3000);
}


@When("I hover my mouse on Shop")
public void i_hover_my_mouse_on_Shop() throws InterruptedException {
    Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("(//span[@class='iconTextLinks__text visible-in-Desktop'])[6]"))).build().perform();	
	Thread.sleep(3000);
}

@When("I should be able to select the wallstickers category")
public void i_should_be_able_to_select_the_wallstickers_category() {
	Actions actions = new Actions(driver);
	WebElement wallstickers=driver.findElement(By.xpath("(//a[@href='https://www.asianpaints.com/online-shop/wall-stickers.html'])[1]"));
	actions.moveToElement(wallstickers).click().perform();
}

@When("I should be able to click on any wallsticker")
public void i_should_be_able_to_click_on_any_wallsticker() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window,scrollBy(0,1200)");
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//img[@src='/content/dam/asianpaints/ecomm-pdts/wall-stickers/W107WH71L45_01.jpeg.image.384.384.medium.jpg']"))).click().perform();
	Thread.sleep(2000);
	}

@Then("I should see the details of selected wallsticker")
public void i_should_see_the_details_of_selected_wallsticker() {
	System.out.println("Details of selected wallsticker is displayed");
}


@When("I select the Colour Selection Tools category")
public void i_select_the_Colour_Selection_Tools_category() {
	Actions actions = new Actions(driver);
	WebElement colourSelectionTool=driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/online-shop/colour-selection-tools.html']"));
	actions.moveToElement(colourSelectionTool).click().perform();
}

@When("I should be able to click on any selection tool")
public void i_should_be_able_to_click_on_any_selection_tool() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window,scrollBy(0,1200)");
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/shop/product.visualisation-sheets.html?prodcategory=colourselectiontools']"))).click().perform();
	Thread.sleep(2000);
}

@Then("I should see the details of selected Colour selection tool")
public void i_should_see_the_details_of_selected_Colour_selection_tool() {
	
	System.out.println("Details of selected Colour Selection Tool is displayed");
}

@When("I should be able to select the Adhesives category")
public void i_should_be_able_to_select_the_Adhesives_category() {
	Actions actions = new Actions(driver);
	WebElement adhesives=driver.findElement(By.xpath("//a[@href='https://www.asianpaints.com/online-shop/Adhesives.html']"));
	actions.moveToElement(adhesives).click().perform();
}
@Then("I should see a list of all availble Adhesives")
public void i_should_see_a_list_of_all_availble_Adhesives() {
	System.out.println("List of all available adhesives is displayed");
}

@When("I should be able to select the disney stickers category")
public void i_should_be_able_to_select_the_disney_stickers_category() {
	Actions actions = new Actions(driver);
	WebElement disneystickers=driver.findElement(By.xpath("(//a[@href='https://www.asianpaints.com/online-shop/wall-stickers.html'])[1]"));
	actions.moveToElement(disneystickers).click().perform();
}
@Then("I should see a list of all availble disney stickers")
public void i_should_see_a_list_of_all_availble_disney_stickers() {
	System.out.println("List of all available Disney Stickers is displayed");
}
}


