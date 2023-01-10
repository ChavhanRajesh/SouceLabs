package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(id = "checkout")
	private WebElement checkOutButton;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	
	public void clickOnCheckOutButton()
	{
		checkOutButton.click();
	}

}
