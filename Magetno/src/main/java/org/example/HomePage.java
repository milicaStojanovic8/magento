package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage  extends BasePage {

    private static final String hotSellerProductsCssLocator = "li.product-item";
    private static final String createAccLocator = "body > div.page-wrapper > header > div.panel.wrapper > div > ul > li:nth-child(3) > a";
    private static final String firstNameLocator = "#firstname";
    private static final String lastNameLocator = "#lastname";

    @FindBy(css = hotSellerProductsCssLocator)
    private List<WebElement> hotSellerProducts;

    @FindBy(css = createAccLocator)
    private WebElement createAcc;

    @FindBy(css = firstNameLocator)
    private WebElement inputFirstName;
    @FindBy(css = lastNameLocator)
    private WebElement inputLastName;

    public HomePage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public void addItemToCart(Integer index) {
        waitForElementsToBeVisible(By.cssSelector(hotSellerProductsCssLocator));
        WebElement productToAdd = hotSellerProducts.get(index);
        click(productToAdd);

    }
    public void createAnAccount() {
        click(createAcc);

    }
    public void inputFirstNameForCreatingACC(String name) {
        click(inputFirstName);
        inputFirstName.sendKeys();

    }
    public void inputLastNameForCreatingACC(String lastName) {
        click(inputFirstName);
        inputFirstName.sendKeys();

    }
}
