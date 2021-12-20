package ui.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import javax.swing.*;
import java.awt.*;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    public static final WebDriver webDriver;
    public static final HomePage homePage;
    public static final FooterHomePage footerHomePage;
    public static final EventsPage eventsPage;
    public static final PartnersProgramPage partnersProgramPage;
    public static final ADVCakePage advCakePage;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Андрей\\IdeaProjects\\CC-tests_Skillfactory\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        webDriver.manage().window().maximize();
        homePage = new HomePage(webDriver);
        footerHomePage = new FooterHomePage(webDriver);
        eventsPage = new EventsPage(webDriver);
        partnersProgramPage = new PartnersProgramPage(webDriver);
        advCakePage = new ADVCakePage(webDriver);
    }

    //1
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }

    @When("website is open click logo website")
    public void website_is_open_click_logo_website() {
        homePage.clickLogoSite();
    }


    //2
    @When("website is open write in the email 1 field {string}")
    public void website_is_open_write_in_the_email_1_field(String email) {
        homePage.firstIncorrectEmail(email);
    }

    @Then("click button Получить")
    public void click_button_получить() {
        homePage.clickGetButton();
    }

    @Then("get error message wrong email {string}")
    public void get_error_message_wrong_email(String errorMessage) {
        final var getErrorMessage = homePage.getFirstErrorMessage();
        assertEquals(errorMessage, getErrorMessage);
    }

    //3
    @When("website is open write in the email 2 field {string}")
    public void website_is_open_write_in_the_email_2_field(String email2) {
        homePage.secondIncorrectEmail(email2);
    }

    //4
    @When("website is open click button Получить")
    public void website_is_open_click_button_получить() {
        homePage.clickGetButton();
    }

    @Then("get error message {string}")
    public void get_error_message(String errorMessage2) {
        final var getErrorMessage2 = homePage.getSecondErrorMessage();
        assertEquals(errorMessage2, getErrorMessage2);
    }

    //5
    @When("website is open write email in field {string}")
    public void website_is_open_write_email_in_field(String correctEmail) {
        homePage.writeCorrectEmail(correctEmail);
    }

    @Then("click checkbox Я соглашаюсь на обработку персональных данных")
    public void click_checkbox_я_соглашаюсь_на_обработку_персональных_данных() {
        homePage.clickCheckboxGet();
    }

    //7
    @When("website is open click section Партнерам")
    public void website_is_open_click_section_партнерам() {
        partnersProgramPage.goSectionPartners();
    }

    @Then("click button Стать партнером")
    public void click_button_стать_партнером() {
        partnersProgramPage.clickButtonBecomePartners();
    }

    @Then("click button Присоединиться к программе")
    public void click_button_присоединиться_к_программе() {
        partnersProgramPage.clickButtonJoinTheProgram();
    }

    //8
    @Then("click first email partner@skillfactory.ru")
    public void click_first_email_partner_skillfactory_ru() {
        partnersProgramPage.clickFirstEmail();
    }

    //9
    @Then("click second email supportskillfactory@advcake.com")
    public void click_second_email_supportskillfactory_advcake_com() {
        partnersProgramPage.clickSecondEmail();
    }

    //10
    @Then("write in the correct email field {string}")
    public void write_in_the_correct_email_field(String correctEmail) {
        advCakePage.correctEmailADVPage(correctEmail);
    }

    @Then("click button Продолжить")
    public void click_button_продолжить() {
        advCakePage.clickButtonContinue();
    }

    //11
    @Then("write incorrect name {string}")
    public void write_incorrect_name(String incorrectName) {
        advCakePage.writeIncorrectNameADV(incorrectName);
    }

    @Then("click button Отправить")
    public void click_button_отправить() {
        advCakePage.clickButtonSend();
    }

    @Then("get errors message for field name {string}")
    public void get_errors_message_for_field_name(String errorMessageName) {
        final var getErrorMessageName = advCakePage.getErrorMessageNameAVD();
        assertEquals(errorMessageName, getErrorMessageName);
    }

    //12-13
    @Then("write correct name {string}")
    public void write_correct_name(String correctName) {
        advCakePage.writeCorrectNameAVD(correctName);
    }

    //14
    @When("website is open click section free")
    public void website_is_open_click_section_free() {
        eventsPage.clickSectionFree();
    }

    @Then("click text Прошедшие мероприятия")
    public void click_text_прошедшие_мероприятия() {
        eventsPage.clickSliderPastEvents();
    }

    @Then("click past event")
    public void click_past_event() {
        eventsPage.clickPastEvent();
    }

    //15
    @Then("click email live@skillfactory.ru")
    public void click_email_live_skillfactory_ru() {
        eventsPage.clickEmailPastEvents();
    }

    //16 start footer
    @When("website is open write in the email first field {string}")
    public void website_is_open_write_in_the_email_first_field(String footerEmail) {
        footerHomePage.firstIncorrectFooterEmail(footerEmail);
    }

    @Then("click button Подписаться")
    public void click_button_подписаться() {
        footerHomePage.clickButtonSubscribe();
    }

    //17
    @When("website is open write in the email second field {string}")
    public void website_is_open_write_in_the_email_second_field(String footerEmail2) {
        footerHomePage.secondIncorrectFooterEmail(footerEmail2);
    }

    //18
    @When("website is open click button Подписаться")
    public void website_is_open_click_button_подписаться() {
        footerHomePage.clickButtonSubscribe();
    }

    //19
    @When("website is open write email in footer field {string}")
    public void website_is_open_write_email_in_footer_field(String correctFooterEmail) {
        footerHomePage.correctFooterEmail(correctFooterEmail);
    }

    @Then("click checkbox Я даю согласие на обработку своих персональных данных")
    public void click_checkbox_я_даю_согласие_на_обработку_своих_персональных_данных() {
        footerHomePage.clickCheckboxInFooter();
    }

    //21
    @When("website is open click button Читать блог")
    public void website_is_open_click_button_читать_блог() {
        footerHomePage.clickButtonReadBlog();
    }

    //22
    @When("website is open click text Информация об образовательной организации")
    public void website_is_open_click_text_информация_об_образовательной_организации() {
        footerHomePage.linkInformationAboutOrganization();
    }

    //23
    @When("website is open click text Пользовательское соглашение")
    public void website_is_open_click_text_пользовательское_соглашение() {
        footerHomePage.linkUserAgreement();
    }

    //24
    @When("website is open click text Договор-оферта для ФЛ")
    public void website_is_open_click_text_договор_оферта_для_фл() {
        footerHomePage.linkOfferAgreementForFL();
    }

    //25
    @When("website is open click text Договор-оферта для ЮЛ")
    public void website_is_open_click_text_договор_оферта_для_юл() {
        footerHomePage.linkOfferAgreementForLegalEntity();
    }
}
