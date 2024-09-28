import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends TestBase {
    private AmazonHomePage homePage;
    private AmazonProductPage productPage;
    private AmazonCartPage cartPage;
    private AmazonDealsPage dealsPage;

    @Test

    public void Senario1() {
        homePage = new AmazonHomePage(driver);
        productPage = new AmazonProductPage(driver);
        cartPage = new AmazonCartPage(driver);
        homePage.ClickOnSearchField("car accessories");
        homePage.ClickOnSubmaitSearchButton();
        productPage.selectProductElement();
        productPage.ClickOnAddToCartElement();
        cartPage.ClickONGoTOCart();
        Assert.assertTrue(cartPage.isItemInCar());

    }

    @Test
    public void Senario2() {
        homePage = new AmazonHomePage(driver);
        dealsPage = new AmazonDealsPage(driver);
        homePage.ClickOnTodayDeals();
        dealsPage.ClickOnSeeMore();
        dealsPage.ClickOnGrocery();
        dealsPage.ClickOnDiscountTen();
        dealsPage.selectProduct();
        dealsPage.ClickOnAddToCart();

    }


}
