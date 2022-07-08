package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage {
    By increase=By.cssSelector(".js-cart-update-product ");
    By clickRefrsh=By.cssSelector(".fa.fa-refresh.green-icon");
    By checkUpdatwrite=By.cssSelector(".swal2-title.ky-swal-title-single");
    By clickDelete=By.cssSelector(".fa.fa-times.red-icon");
    By checkEmpty=By.cssSelector(".content");

    WebDriver driver;
    WebDriverWait wait;



    public cartPage(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
    }
    public void ClickAddProduct(){

        driver.findElement(increase);

    }
    public void clickRefresh(){
        driver.findElement(clickRefrsh).click();

    }
    public void checkCartUpdateWrite(){
        driver.findElement(checkUpdatwrite);
    } public void clickDelete(){
        driver.findElement(clickDelete).click();

    }
    public void checkEmptyCart(){
        driver.findElement(checkEmpty);

    }


}
