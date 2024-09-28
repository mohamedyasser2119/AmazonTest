import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonProductPage extends BasePage {
    public AmazonProductPage(WebDriver driver) {
        super(driver);
    }

  By selectProduct =By.xpath("//div[@data-index='6']//h2/a");
  By addToCartButton = By.id("add-to-cart-button");

  WebElement selectProductElement;
  WebElement addToCartElement;

  public void selectProductElement() {
      selectProductElement = driver.findElement(selectProduct);
      Clicking(selectProductElement);

  }

  public AmazonCartPage ClickOnAddToCartElement() {
      addToCartElement = driver.findElement(addToCartButton);
      Clicking(addToCartElement);
      return new AmazonCartPage(driver);

  }
}
