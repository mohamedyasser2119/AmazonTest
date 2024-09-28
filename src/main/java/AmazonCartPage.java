import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonCartPage extends BasePage {
    public AmazonCartPage(WebDriver driver) {
        super(driver);
    }
  By goTOCart = By.id("nav-cart-count-container");
  By cartItem = By.cssSelector(".sc-list-item-content");

    WebElement goTOCartElement;
    WebElement cartItemElement;


    public void ClickONGoTOCart() {
        goTOCartElement = driver.findElement(goTOCart);
        Clicking(goTOCartElement);
    }

    public boolean isItemInCar() {
        cartItemElement = driver.findElement(cartItem);
        return cartItemElement.isDisplayed();

    }
}
