package Nopfeature;

import org.openqa.selenium.By;

public class Home extends Utils {
    public void userShouldRedirectsuccessfullyOnHomepage(){

        clickElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    }
}
