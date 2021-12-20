package ui.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterHomePage {

    private static final String FOOTER_EMAIL_XPATH = "//input[contains(@style, 'color:#000;  background-color:#fff; border-radius:4px;')]";
    private static final String BUTTON_SUBSCRIBE_XPATH = "//button[contains(text(), 'Подписаться')]";
    private static final String FOOTER_CHECKBOX_XPATH = "//span[contains(text(), 'Я даю согласие на')]";
    private static final String BUTTON_READ_BLOG_XPATH = "//a[contains(text(), 'Читать блог')]";
    private static final String LINK_INFORMATION_ABOUT_ORGANIZATION_XPATH = "//a[contains(text(), 'Сведения об образовательной организации')]";
    private static final String LINK_USER_AGREEMENT_XPATH = "//a[contains(text(), 'Пользовательское соглашение')]";
    private static final String LINK_OFFER_AGREEMENT_FOR_FL_XPATH = "//a[contains(text(), 'Договор-оферта для ФЛ')]";
    private static final String LINK_OFFER_AGREEMENT_FOR_LEGAL_ENTITY_XPATH = "//a[contains(text(), 'Договор-оферта для ЮЛ')]";

    private final WebDriver webDriver;

    public FooterHomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void firstIncorrectFooterEmail(String footerEmail){
        final var writeFooterEmail = webDriver.findElement(By.xpath(FOOTER_EMAIL_XPATH));
        writeFooterEmail.sendKeys(footerEmail);
    }
    public void clickButtonSubscribe(){
        webDriver.findElement(By.xpath(BUTTON_SUBSCRIBE_XPATH)).click();
    }

    public void secondIncorrectFooterEmail(String footerEmail2) {
        final var writeFooterEmail = webDriver.findElement(By.xpath(FOOTER_EMAIL_XPATH));
        writeFooterEmail.sendKeys(footerEmail2);
    }

    public void correctFooterEmail(String correctFooterEmail) {
        final var writeCorrectFooterEmail = webDriver.findElement(By.xpath(FOOTER_EMAIL_XPATH));
        writeCorrectFooterEmail.sendKeys(correctFooterEmail);
    }

    public void clickCheckboxInFooter(){
        webDriver.findElement(By.xpath(FOOTER_CHECKBOX_XPATH)).click();
    }

    public void clickButtonReadBlog(){
        webDriver.findElement(By.xpath(BUTTON_READ_BLOG_XPATH)).click();
    }
    public void linkInformationAboutOrganization() {
        webDriver.findElement(By.xpath(LINK_INFORMATION_ABOUT_ORGANIZATION_XPATH)).click();
    }

    public void linkUserAgreement(){
        webDriver.findElement(By.xpath(LINK_USER_AGREEMENT_XPATH)).click();
    }

    public void linkOfferAgreementForFL(){
        webDriver.findElement(By.xpath(LINK_OFFER_AGREEMENT_FOR_FL_XPATH)).click();
    }

    public void linkOfferAgreementForLegalEntity(){
        webDriver.findElement(By.xpath(LINK_OFFER_AGREEMENT_FOR_LEGAL_ENTITY_XPATH)).click();
    }

}
