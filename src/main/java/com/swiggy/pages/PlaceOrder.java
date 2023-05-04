package com.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaceOrder {
	

	private Actions actions;
	private WebDriverWait wait;
	

	@FindBy(xpath ="(//div[@class='styles_containerRestaurant__3vhx3'])[1]")
	private WebElement firstResta;
	
	@FindBy(xpath ="//span[contains(@class,'_1W_TH')]")
	private WebElement continueBtn;
	
	@FindBy(xpath ="(//div[contains(text(),'ADD')])[1]")
	private WebElement addBtn;

	@FindBy(xpath ="(//span[@class='_1W_TH'])[1]")
	private WebElement continuBtn;

	@FindBy(xpath ="(//span[@class='_38xdN'])[1]")
	private WebElement addItemBtn;

	@FindBy(xpath ="(//span[@class='styles_content__ImcAX'])[1]")
	private WebElement viewCartBtn;

	
	@FindBy(xpath="//button[contains(@class,'_1gPB7')]")
	private WebElement checkOutBtn;

	public PlaceOrder (WebDriver driver){
		PageFactory.initElements (driver, this);
		actions = new Actions (driver);
		wait = new WebDriverWait(driver, 10);
		}
	
	public void selectFirstRestaurant() {
		wait.until(ExpectedConditions.visibilityOf(firstResta));
		firstResta.click();
	}
	
	public void continueorder() {
		
			
			wait.until(ExpectedConditions.visibilityOf(continueBtn));
		
				actions.moveToElement(continueBtn).doubleClick().perform();
				actions.moveToElement(continueBtn).doubleClick().perform();
				actions.moveToElement(continueBtn).doubleClick().perform();
				
	}
	public void moveToCart() {
		wait.until(ExpectedConditions.visibilityOf(addBtn));
		addBtn.click();
		wait.until(ExpectedConditions.visibilityOf(continuBtn));
		continuBtn.click();

		wait.until(ExpectedConditions.visibilityOf(addItemBtn));
		addItemBtn.click();
	}
	
	public void checkoutAction() {
		wait.until(ExpectedConditions.visibilityOf(checkOutBtn));
		checkOutBtn.click();
	}

	public void clicViewCart() {
		wait.until(ExpectedConditions.visibilityOf(viewCartBtn));
		viewCartBtn.click();
	}
}


