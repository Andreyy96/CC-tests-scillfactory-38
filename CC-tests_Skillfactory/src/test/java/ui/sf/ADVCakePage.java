package ui.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ADVCakePage {

    private static final String EMAIL_NAME_DOM = "email";
    private static final String BUTTON_CONTINUE_XPATH = "//input[contains(@value, 'Продолжить')]";
    private static final String INCORRECT_NAME_AVDCAKE_DOM = "given-name";
    private static final String BUTTON_SEND_XPATH = "//input[contains(@value, 'Отправить')]";
    private static final String ERROR_MESSAGE_FIELD_NAME_AVD_XPATH = "//span[contains(text(), 'Используйте только кириллицу или латиницу')]";
    private static final String CORRECT_NAME_AVDCAKE_XPATH = "given-name";

    private final WebDriver webDriver;

    public ADVCakePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

   public void correctEmailADVPage(String correctEmail) {
       final var writeIncorrectEmail = webDriver.findElement(By.name(EMAIL_NAME_DOM));
       writeIncorrectEmail.sendKeys(correctEmail);
   }

    public void clickButtonContinue(){
        webDriver.findElement(By.xpath(BUTTON_CONTINUE_XPATH)).click();
    }

    public void writeIncorrectNameADV(String incorrectName){
        final var writeIncorrectName = webDriver.findElement(By.name(INCORRECT_NAME_AVDCAKE_DOM));
        writeIncorrectName.sendKeys(incorrectName);
    }

    public void clickButtonSend(){
        webDriver.findElement(By.xpath(BUTTON_SEND_XPATH)).click();
    }

    public String getErrorMessageNameAVD(){
        return webDriver.findElement(By.xpath(ERROR_MESSAGE_FIELD_NAME_AVD_XPATH)).getText();
    }

    public void writeCorrectNameAVD(String correctName){
        final var writeCorrectName = webDriver.findElement(By.name(CORRECT_NAME_AVDCAKE_XPATH));
        writeCorrectName.sendKeys(correctName);
    }
}