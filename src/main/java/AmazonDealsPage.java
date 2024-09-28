import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonDealsPage extends BasePage {

    public AmazonDealsPage(WebDriver driver) {
        super(driver);
    }

    By seeMore = By.linkText("See more");
    By grocery = By.xpath("//span[text()='Grocery & Gourmet Food']");
    By discountTen = By.xpath("//span[text()='10% off or more']");
    By selectProduct = By.cssSelector("[data-testid=B0CSBDN3NL]");
    By addToCart = By.id("add-to-cart-button");


    WebElement seeMoreElement ;

    WebElement groceryElement ;

    WebElement discountTenElement ;

    WebElement selectProductElement ;

    WebElement addToCartElement ;


    public void ClickOnSeeMore() {
        seeMoreElement = driver.findElement(seeMore);
        Clicking(seeMoreElement);
    }

    public void ClickOnGrocery() {
        groceryElement = driver.findElement(grocery);
        Clicking(groceryElement);
    }
    public void ClickOnDiscountTen() {
        discountTenElement = driver.findElement(discountTen);
        Clicking(discountTenElement);

    }
    public void selectProduct() {
        selectProductElement = driver.findElement(selectProduct);
        Clicking(selectProductElement);
    }
    public void ClickOnAddToCart() {
        addToCartElement = driver.findElement(addToCart);
        Clicking(addToCartElement);
    }
}
