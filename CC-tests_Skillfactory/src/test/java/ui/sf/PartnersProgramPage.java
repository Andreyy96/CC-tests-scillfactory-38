package ui.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PartnersProgramPage {

    private static final String SECTION_PARTNERS_XPATH = "//a[contains(text(), 'Партнерам')]";
    private static final String BUTTON_BECOME_A_PARTNERS_XPATH = "//a[contains(text(), 'Стать партнером')]";
    private static final String BUTTON_JOIN_THE_PROGRAM_XPATH = "//span[contains(text(), 'Присоединиться к программе')]";
    private static final String FIRST_EMAIL_PARTNERS_PAGE_XPATH = "//a[contains(text(), 'partner@skillfactory.ru')]";
    private static final String SECOND_EMAIL_PARTNERS_PAGE_XPATH = "//a[contains(text(), 'supportskillfactory@advcake.com')]";

    private final WebDriver webDriver;

    public PartnersProgramPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void goSectionPartners() {
        webDriver.findElement(By.xpath(SECTION_PARTNERS_XPATH)).click();
    }

    public void clickButtonBecomePartners() {
        webDriver.findElement(By.xpath(BUTTON_BECOME_A_PARTNERS_XPATH)).click();
    }

    public void clickButtonJoinTheProgram() {
        webDriver.findElement(By.xpath(BUTTON_JOIN_THE_PROGRAM_XPATH)).click();
    }

    public void clickFirstEmail() {
        webDriver.findElement(By.xpath(FIRST_EMAIL_PARTNERS_PAGE_XPATH)).click();
    }

    public void clickSecondEmail() {
        webDriver.findElement(By.xpath(SECOND_EMAIL_PARTNERS_PAGE_XPATH)).click();
    }
}
