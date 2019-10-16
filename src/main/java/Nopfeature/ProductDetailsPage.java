package Nopfeature;

import org.openqa.selenium.By;

public class ProductDetailsPage extends Utils {
public void userShouldBeRedirectonProductDetailPage(){

    clickElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    clickElement(By.linkText("Apple MacBook Pro 13-inch"));
}

}

