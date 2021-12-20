package ui.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventsPage {

    private static final String SECTION_FREE_XPATH = "//a[contains(text(), 'Бесплатно')]";
    private static final String SLIDER_PAST_EVENTS_XPATH = "//div[contains(text(),'Прошедшие мероприятия')]";
    private static final String PAST_EVENT_XPATH = "//div[contains(text(), 'Почему удалённая команда – это выгодно для бизнеса?')]";
    private static final String EMAIL_FREE_PAGE_XPATH = "//a[contains(text(), 'live@skillfactory.ru')]";

    private final WebDriver webDriver;

    public EventsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickSectionFree() {
        webDriver.findElement(By.xpath(SECTION_FREE_XPATH)).click();
    }

    public void clickSliderPastEvents() {
        webDriver.findElement(By.xpath(SLIDER_PAST_EVENTS_XPATH)).click();
    }

    public void clickPastEvent(){
        webDriver.findElement(By.xpath(PAST_EVENT_XPATH)).click();
    }

    public void clickEmailPastEvents(){
        webDriver.findElement(By.xpath(EMAIL_FREE_PAGE_XPATH)).click();
    }
}
