package Nopfeature;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class CheckoutSuccessfully extends Utils {
    SoftAssert softAssert = new SoftAssert();

    public void userShouldBeGetCheckoutSuccessfullyMessage(){

        softAssert.assertEquals(getTextFromEement(By.xpath("//div[@class='section order-completed']/div/strong")),"Your order has been successfully processed!");
        softAssert.assertAll();

    }
}
