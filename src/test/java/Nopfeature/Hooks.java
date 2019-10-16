package Nopfeature;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends BasePage {

    BrowserSelector browserSelector =new BrowserSelector();

    @Before
    public void  setBrowserSelector(){
        browserSelector.setupBrowser();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
    }
    @After
    public void close()
    {
        driver.quit();
    }
}


