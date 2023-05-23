package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

import org.junit.Assert;

public class AddToCratstepdef {

	WebDriver driver = Hookslab.driver;

	@When("I click on the Product name as {string}")
	public void i_click_on_the_Product_name_as(String string) throws InterruptedException {
		WebElement productName = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		productName.click();
		Thread.sleep(2000);
	}
	
	@When("I click on the Add to cart Button")
	public void i_click_on_the_Add_to_cart_Button() {
	WebElement CartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	CartButton.click();
	
	}

	@When("I click on Shopping cart link")
	public void i_click_on_shopping_cart_link() {
		WebElement CartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		CartLink.click();
		
	}
	@Then("I verify the item on cart page")
	public void i_verify_the_item_on_cart_page() throws InterruptedException {
		
		WebElement productnameincart = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String actualitemname = productnameincart.getText();
		Thread.sleep(2000);
		String expecteditemname = "Sauce Labs Backpack";
		Assert.assertEquals(actualitemname, expecteditemname);
	}
	
	

}
