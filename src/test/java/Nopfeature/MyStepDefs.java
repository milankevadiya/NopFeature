package Nopfeature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    AddtoCart addtoCart = new AddtoCart();
    CheckOut checkOut = new CheckOut();
    BookCategory bookCategory = new BookCategory();
    CheckoutSuccessfully checkoutSuccessfully = new CheckoutSuccessfully();
    GuestUserChecout guestUserChecout = new GuestUserChecout();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    ProductEmailToAFriend productEmailToAFriend = new ProductEmailToAFriend();
    Home home = new Home();
    GuestUserEmailAproducttoFriend guestUserEmailAproducttoFriend=new GuestUserEmailAproducttoFriend();
    @Given("^Go to Registration page$")
    public void go_to_Registration_page() {
        homePage.userShouldBeClickOnRegosterlink();
    }

    @When("^Enter all registration details$")
    public void enter_all_registration_details() {
        registrationPage.userEnterRegistrationDetails();
    }

    @Then("^user should be register successfully$")
    public void user_should_be_register_successfully() {
        registrationResultPage.registrationsuccesfullmessage();
    }


    @Given("^User should be Registered successfully$")
    public void user_should_be_Registered_successfully() {
        homePage.userShouldBeClickOnRegosterlink();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.registrationsuccesfullmessage();
    }

    @Given("^User should be on Book category page$")
    public void user_should_be_on_Book_category_page() {
        bookCategory.userShouldBeClickonBook();
    }

    @When("^click on any product's Add to cart button for add product$")
    public void click_on_any_product_s_Add_to_cart_button_for_add_product() {
        addtoCart.userShouldbeAbletoPurchaseitem();

    }

    @When("^click on checkout button$")
    public void click_on_checkout_button() {
        checkOut.userShouldBeAbleToCheckOutSuccessfully();
    }

    @Then("^User is able to buy product succesfully$")
    public void user_is_able_to_buy_product_succesfully() {
        checkoutSuccessfully.userShouldBeGetCheckoutSuccessfullyMessage();
    }


    @When("^click on checkout button for checkout process$")
    public void click_on_checkout_button_for_checkout_process() {
        guestUserChecout.guestUserShouldAbleToCheckOutSucessfully();
    }

    @When("^User click on any product from home page$")
    public void user_click_on_any_product_from_home_page() {
        productDetailsPage.userShouldBeRedirectonProductDetailPage();
    }


    @Then("^User should be able to refere that product to a friend$")
    public void user_should_be_able_to_refere_that_product_to_a_friend() {
        productEmailToAFriend.enterDetailsForEmailAFriend();
    }


    @Given("^User should be on Homepage$")
    public void user_should_be_on_Homepage()  {
           home.userShouldRedirectsuccessfullyOnHomepage();
    }

    @Then("^Guest User should be able to refere that product to a friend$")
    public void guest_User_should_be_able_to_refere_that_product_to_a_friend()  {
        guestUserEmailAproducttoFriend.guestUserEnterDetailsForEmailAFriend();

    }

}

