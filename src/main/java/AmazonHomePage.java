import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends BasePage {
    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    By searchField = By.id("twotabsearchtextbox");

    By submaitSearchButton = By.id("nav-search-submit-button");

    By todayDeals =By.linkText("Today's Deals");

    WebElement searchFieldElement;

    WebElement submaitSearchButtonElement;

    WebElement todayDealsElement;

    public void ClickOnSearchField (String searchText) {
        searchFieldElement = driver.findElement(searchField);
        searchFieldElement.sendKeys(searchText);
    }
    public AmazonProductPage ClickOnSubmaitSearchButton () {
        submaitSearchButtonElement = driver.findElement(submaitSearchButton);
        Clicking(submaitSearchButtonElement);
        return new AmazonProductPage(driver);
    }
    public AmazonDealsPage ClickOnTodayDeals () {
        todayDealsElement = driver.findElement(todayDeals);
        Clicking(todayDealsElement);
        return new AmazonDealsPage(driver);
    }



}
