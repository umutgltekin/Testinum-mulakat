package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.awt.image.RGBImageFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class HomePage {
    By shouldSeeProductPage=By.cssSelector(".img-lazy-loaded");
    By Searchtext=By.id("search-input");
    By clickSearch=By.cssSelector(".common-sprite.button-search");
    By ShouldSeeProducpage=By.cssSelector(".search-heading-title");
    By clickProduct=By.cssSelector(".name");
    By shouldseeProductdetail=By.cssSelector(".pr_details");
    By clickCart=By.id("button-cart");
    By checkCarticon=By.cssSelector(".common-sprite .fl");
    By gotoCart=By.id("js-cart");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;


    public HomePage(WebDriver driver) {
        this.wait = new WebDriverWait(driver, 10);
        this.driver = driver;
        this.elementHelper = new ElementHelper(driver);
    }
    public void shouldSeeHomePage(){
        driver.findElement(shouldSeeProductPage);

    }
    public void Searchtext(String text){
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\wine.csv"));
            while ((line = br.readLine()) != null) {
              text=line;
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        driver.findElement(Searchtext).sendKeys(text);
    }
    public void clickSearch(){
        driver.findElement(clickSearch).click();
    }
    public void shouldSeeProductPage(){
        driver.findElement(ShouldSeeProducpage);
    }
    public void clikcProduct(String producName){
        List<WebElement>elements = driver.findElements(clickProduct);
        for (WebElement element:elements) {
            if(element.getText().contains(producName)){
                element.click();
                break;
            }
        }
    }
    public void shouldProductDtailPage(){
        driver.findElement(shouldseeProductdetail);

    }
    public void clickCart(){
        driver.findElement(clickCart).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void checkCartEquals(int num){
        boolean find=false;
        int sayı= Integer.parseInt(driver.findElement(checkCarticon).getText());
        if(sayı==num){
         find=true;
        }
        Assert.assertEquals(true, find);

    }
    public void clickcart(){
        driver.findElement(checkCarticon).click();

    }
    public void clickGoToCart(){
        driver.findElement(gotoCart).click();
    }




}