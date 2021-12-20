# CC-tests-scillfactory-38

Сценарии:

1) Проверка на обновление страницы при нажатии логотипа сайта
    
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
   
   @When("website is open click logo website")
    public void website_is_open_click_logo_website() {
        homePage.clickLogoSite();
    }

2) Проверка на получение сообщения об ошибке о введеном некорректном email в блоке
   "Бесплатный гид по направлениям в IT" (без @)
    
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
         homePage.go();
    }
    
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

3) Проверка на получение сообщения об ошибке о введеном некорректном email в блоке
   "Бесплатный гид по направлениям в IT" (с вводом двух @@)
  
  @Given("url of Scillfactory {string}")
   public void url_of_Scillfactory(String url) {
        homePage.go();
   }
   
    @When("website is open write in the email 2 field {string}")
    public void website_is_open_write_in_the_email_2_field(String email2) {
        homePage.secondIncorrectEmail(email2);
    }
    
    @Then("click button Получить")
    public void click_button_получить() {
        homePage.clickGetButton();
    }
    
    @Then("get error message wrong email {string}")
    public void get_error_message_wrong_email(String errorMessage) {
        final var getErrorMessage = homePage.getFirstErrorMessage();
        assertEquals(errorMessage, getErrorMessage);

4) Проверка на получение сообщения об ошибке при нажатии кнопки "Получить" с пустым полем email
   в блоке "Бесплатный гид по направлениям в IT"
    
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click button Получить")
    public void website_is_open_click_button_получить() {
        homePage.clickGetButton();
    }

    @Then("get error message {string}")
    public void get_error_message(String errorMessage2) {
        final var getErrorMessage2 = homePage.getSecondErrorMessage();
        assertEquals(errorMessage2, getErrorMessage2);
    }

5) Проверка на получение сообщения об ошибке при несогласии на обработку персональных данных
   в блоке "Бесплатный гид по направлениям в IT"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open write email in field {string}")
    public void website_is_open_write_email_in_field(String correctEmail) {
        homePage.writeCorrectEmail(correctEmail);
    }
    
    @Then("click button Получить")
    public void click_button_получить() {
        homePage.clickGetButton();
    }
    
    @Then("get error message {string}")
    public void get_error_message(String errorMessage2) {
        final var getErrorMessage2 = homePage.getSecondErrorMessage();
        assertEquals(errorMessage2, getErrorMessage2);
    }

6) Проверка на получение гида при введенном корректный email в блоке "Бесплатный гид по направлениям в IT"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open write email in field {string}")
    public void website_is_open_write_email_in_field(String correctEmail) {
        homePage.writeCorrectEmail(correctEmail);
    }
    
    @Then("click button Получить")
    public void click_button_получить() {
        homePage.clickGetButton();
    }
    

7) Проверка перехода на страницу с формой регистрации с полем email в разделе "Партнерам"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
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

8) Проверка на открытие почты при нажатии на первый email в разделе "Партнерам"
  
  @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click section Партнерам")
    public void website_is_open_click_section_партнерам() {
        partnersProgramPage.goSectionPartners();
    }
    
    @Then("click first email partner@skillfactory.ru")
    public void click_first_email_partner_skillfactory_ru() {
       partnersProgramPage.clickFirstEmail();
    }


9) Проверка на открытие почты при нажатии на второй email в разделе "Партнерам"
    
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click section Партнерам")
    public void website_is_open_click_section_партнерам() {
        partnersProgramPage.goSectionPartners();
    }
    
    @Then("click second email supportskillfactory@advcake.com")
    public void click_second_email_supportskillfactory_advcake_com() {
        partnersProgramPage.clickSecondEmail();
    }

10) Проверка на открытие доступа к полям "Вид субъекта правоотношений", "Имя", "Фамилия", "Отчество",
"Номер телефона", "@Telegram" при вводе корректного email на странице ADV.Cake
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
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
    
    @Then("write in the correct email field {string}")
    public void write_in_the_correct_email_field(String correctEmail) {
        advCakePage.correctEmailADVPage(correctEmail);
    }
    
    @Then("click button Продолжить")
    public void click_button_продолжить() {
        advCakePage.clickButtonContinue();
    }

11) Проверка на получении сообщении об ошибке при вводе некорректного имени в поле "Имя"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
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
    
    @Then("write in the correct email field {string}")
    public void write_in_the_correct_email_field(String correctEmail) {
        advCakePage.correctEmailADVPage(correctEmail);
    }
    
    @Then("click button Продолжить")
    public void click_button_продолжить() {
        advCakePage.clickButtonContinue();
    }
    
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


12) Проверка на корректность имени при вводе его кириллицей в поле "Имя"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
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
    
    @Then("write in the correct email field {string}")
    public void write_in_the_correct_email_field(String correctEmail) {
        advCakePage.correctEmailADVPage(correctEmail);
    }
    
    @Then("click button Продолжить")
    public void click_button_продолжить() {
        advCakePage.clickButtonContinue();
    }
    
    @Then("write correct name {string}")
    public void write_correct_name(String correctName) {
        advCakePage.writeCorrectNameAVD(correctName);
    }
    
    @Then("click button Отправить")
    public void click_button_отправить() {
        advCakePage.clickButtonSend();
    }

13) Проверка на корректность имени при вводе его латиницей в поле "Имя"
  
  @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
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
    
    @Then("write in the correct email field {string}")
    public void write_in_the_correct_email_field(String correctEmail) {
        advCakePage.correctEmailADVPage(correctEmail);
    }
    
    @Then("click button Продолжить")
    public void click_button_продолжить() {
        advCakePage.clickButtonContinue();
    }
    
    @Then("write correct name {string}")
    public void write_correct_name(String correctName) {
        advCakePage.writeCorrectNameAVD(correctName);
    }
    
    @Then("click button Отправить")
    public void click_button_отправить() {
        advCakePage.clickButtonSend();
    }

14) Проверка на работоспособность слайдера в разделе "Бесплатно" при нажатии Прошедшие мероприятия
  
  @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
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

15) Проверка на открытие почты при нажатии email в блоке "Прошедшие мероприятия"
  
  @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click section free")
    public void website_is_open_click_section_free() {
        eventsPage.clickSectionFree();
    }
    
    @Then("click text Прошедшие мероприятия")
    public void click_text_прошедшие_мероприятия() {
        eventsPage.clickSliderPastEvents();
    }
    
    @Then("click email live@skillfactory.ru")
    public void click_email_live_skillfactory_ru() {
        eventsPage.clickEmailPastEvents();
    }

16) Проверка на получение сообщения об ошибке о введеном некорректном email
в footer (raven0105@mail)

@Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open write in the email first field {string}")
    public void website_is_open_write_in_the_email_first_field(String footerEmail) {
        footerHomePage.firstIncorrectFooterEmail(footerEmail);
    }
    
    @Then("click button Подписаться")
    public void click_button_подписаться() {
        footerHomePage.clickButtonSubscribe();
    }
    
    @Then("get error message wrong email {string}")
    public void get_error_message_wrong_email(String errorMessage) {
        final var getErrorMessage = homePage.getFirstErrorMessage();
        assertEquals(errorMessage, getErrorMessage);
    }

17) Проверка на получение сообщения об ошибке при несогласии на обработку персональных данных
в footer
    
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open write in the email second field {string}")
    public void website_is_open_write_in_the_email_second_field(String footerEmail2) {
        footerHomePage.secondIncorrectFooterEmail(footerEmail2);
    }
    
    @Then("click button Подписаться")
    public void click_button_подписаться() {
        footerHomePage.clickButtonSubscribe();
    }
    
    @Then("get error message wrong email {string}")
    public void get_error_message_wrong_email(String errorMessage) {
        final var getErrorMessage = homePage.getFirstErrorMessage();
        assertEquals(errorMessage, getErrorMessage);
    }

18) Проверка на получение сообщения об ошибке при нажатии кнопки "Подписаться" с пустым полем email
    
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click button Подписаться")
    public void website_is_open_click_button_подписаться() {
        footerHomePage.clickButtonSubscribe();
    }

    @Then("get error message {string}")
    public void get_error_message(String errorMessage2) {
        final var getErrorMessage2 = homePage.getSecondErrorMessage();
        assertEquals(errorMessage2, getErrorMessage2);
    }

19) Проверка на получение сообщения об ошибке при несогласии на обработку персональных данных
в footer
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open write email in footer field {string}")
    public void website_is_open_write_email_in_footer_field(String correctFooterEmail) {
        footerHomePage.correctFooterEmail(correctFooterEmail);
    }
    
    @Then("click checkbox Я даю согласие на обработку своих персональных данных")
    public void click_checkbox_я_даю_согласие_на_обработку_своих_персональных_данных() {
        footerHomePage.clickCheckboxInFooter();
    }
    
    @Then("click button Подписаться")
    public void click_button_подписаться() {
        footerHomePage.clickButtonSubscribe();
    }
    
    @Then("get error message {string}")
    public void get_error_message(String errorMessage2) {
        final var getErrorMessage2 = homePage.getSecondErrorMessage();
        assertEquals(errorMessage2, getErrorMessage2);
    }

20) Проверка на подпись при введенном корректно email в footer
  
  @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open write email in footer field {string}")
    public void website_is_open_write_email_in_footer_field(String correctFooterEmail) {
        footerHomePage.correctFooterEmail(correctFooterEmail);
    }
    
    @Then("click button Подписаться")
    public void click_button_подписаться() {
        footerHomePage.clickButtonSubscribe();
    }

21) Проверка на открытие страницы Блог skillfactory при нажатии кнопки "Читать блог" в footer
    
    @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click button Читать блог")
    public void website_is_open_click_button_читать_блог() {
    footerHomePage.clickButtonReadBlog();
    }

22) Проверка на открытие страницы с информацией об образовательной организации
при нажатии на текст-ссылки "Сведения об образовательной организации"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click text Информация об образовательной организации")
    public void website_is_open_click_text_информация_об_образовательной_организации() {
        footerHomePage.linkInformationAboutOrganization();
    }

23) Проверка на открытие страницы с информацией об положении о порядке хранения и
защиты персональных данных пользователей при нажатии на текст-ссылки
"Сведения об образовательной организации"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click text Пользовательское соглашение")
    public void website_is_open_click_text_пользовательское_соглашение() {
        footerHomePage.linkUserAgreement();
    }

24) Проверка на открытие страницы с информацией обдоговор-оферта на оказание услуг
для Физических лиц при нажатии на текст-ссылки "Договор-оферта для ФЛ"
   
   @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click text Договор-оферта для ФЛ")
    public void website_is_open_click_text_договор_оферта_для_фл() {
        footerHomePage.linkOfferAgreementForFL();
    }

25) Проверка на открытие страницы с информацией обдоговор-оферта на оказание услуг
для Юридических лиц при нажатии на текст-ссылки "Договор-оферта для ЮЛ"
  
  @Given("url of Scillfactory {string}")
    public void url_of_Scillfactory(String url) {
        homePage.go();
    }
    
    @When("website is open click text Договор-оферта для ЮЛ")
    public void website_is_open_click_text_договор_оферта_для_юл() {
        footerHomePage.linkOfferAgreementForLegalEntity();
    }
