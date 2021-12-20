package ui.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private static final String URL = "https://skillfactory.ru/";
    private static final String LOGO_SITE_XPATH = "//div[contains(@data-elem-id, '1595249309306')]";
    private static final String FIRST_INCORRECT_EMAIL_NAME_DOM = "email";
    private static final String BUTTON_GET_XPATH = "//button[contains(text(), 'Получить')]";
    private static final String GET_FIRST_ERROR_MESSAGE_XPATH = "//p[contains(text(), 'Укажите, пожалуйста, корректный email')]";
    private static final String SECOND_INCORRECT_EMAIL_NAME_DOM = "email";
    private static final String GET_SECOND_ERROR_MESSAGE_XPATH = "//p[contains(text(), 'Пожалуйста, заполните все обязательные поля')]";
    private static final String CORRECT_EMAIL_NAME_DOM = "email";
    private static final String CHECKBOX_GET_XPATH = "//span[contains(text(), 'Я соглашаюсь на ')]";

    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void go() {
        webDriver.get(URL);
    }

    public void clickLogoSite() {
        webDriver.findElement(By.xpath(LOGO_SITE_XPATH)).click();
    }

    public void firstIncorrectEmail(String email) {
        final var writeEmail = webDriver.findElement(By.name(FIRST_INCORRECT_EMAIL_NAME_DOM));
        writeEmail.sendKeys(email);
    }

    public void clickGetButton() {
        webDriver.findElement(By.xpath(BUTTON_GET_XPATH)).click();
    }

    public String getFirstErrorMessage() {
       return webDriver.findElement(By.xpath(GET_FIRST_ERROR_MESSAGE_XPATH)).getText();
    }

    public void secondIncorrectEmail(String email2) {
        final var writeEmail = webDriver.findElement(By.name(SECOND_INCORRECT_EMAIL_NAME_DOM));
        writeEmail.sendKeys(email2);
    }

    public String getSecondErrorMessage() {
       return webDriver.findElement(By.xpath(GET_SECOND_ERROR_MESSAGE_XPATH)).getText();
    }

    public void writeCorrectEmail(String correctEmail) {
        final var writeCorrectEmail = webDriver.findElement(By.name(CORRECT_EMAIL_NAME_DOM));
        writeCorrectEmail.sendKeys(correctEmail);
    }

    public void clickCheckboxGet() {
        webDriver.findElement(By.xpath(CHECKBOX_GET_XPATH)).click();
    }
}
