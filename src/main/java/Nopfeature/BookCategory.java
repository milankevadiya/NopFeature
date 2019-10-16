package Nopfeature;

import org.openqa.selenium.By;

public class BookCategory extends Utils{

    public  void userShouldBeClickonBook(){

        clickElement(By.linkText("Books"));
    }
}
