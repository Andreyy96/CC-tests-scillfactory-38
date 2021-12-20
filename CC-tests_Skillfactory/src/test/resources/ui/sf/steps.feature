Feature: Testing website Skillfactory

  Scenario: 1 working site logo
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click logo website
    
  Scenario: 2 misspelling email address 1 in the block field Free guide to directions in IT (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write in the email 1 field 'raven0105mail.ru'
    Then click button Получить
    Then get error message wrong email 'Укажите, пожалуйста, корректный email'

  Scenario: 3 misspelling email address 2 in the block field Free guide to directions in IT (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write in the email 2 field 'raven0105@@mail.ru'
    Then click button Получить
    Then get error message wrong email 'Укажите, пожалуйста, корректный email'

  Scenario: 4 click the receive button with a blank email field (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click button Получить
    Then get error message 'Пожалуйста, заполните все обязательные поля'

  Scenario: 5 check correct behavior checkbox in block Free guide to directions in IT (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write email in field 'raven0105@mail.ru'
    Then click checkbox Я соглашаюсь на обработку персональных данных
    Then click button Получить
    Then get error message 'Пожалуйста, заполните все обязательные поля'

  Scenario: 6 check correct work email in block Free guide to directions in IT (Positive scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write email in field 'raven0105@mail.ru'
    Then click button Получить

  Scenario: 7 open form registration partners
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section Партнерам
    Then click button Стать партнером
    Then click button Присоединиться к программе

  Scenario: 8 open mail when clicking on the first email on the page for partners
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section Партнерам
    Then click first email partner@skillfactory.ru

  Scenario: 9 open mail when clicking on the second email on the page for partners
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section Партнерам
    Then click second email supportskillfactory@advcake.com


  Scenario: 10 write correct email in form registration (Positive scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section Партнерам
    Then click button Стать партнером
    Then click button Присоединиться к программе
    Then write in the correct email field 'raven0105@mail.ru'
    Then click button Продолжить

  Scenario: 11 write incorrect name AVDpage (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section Партнерам
    Then click button Стать партнером
    Then click button Присоединиться к программе
    Then write in the correct email field 'raven0105@mail.ru'
    Then click button Продолжить
    Then write incorrect name 'Andrey96'
    Then click button Отправить
    Then get errors message for field name 'Используйте только кириллицу или латиницу'

  Scenario: 12 write first correct name AVDpage (Positive scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section Партнерам
    Then click button Стать партнером
    Then click button Присоединиться к программе
    Then write in the correct email field 'raven0105@mail.ru'
    Then click button Продолжить
    Then write correct name 'Andrey'
    Then click button Отправить

  Scenario: 13 write second correct name AVDpage (Positive scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section Партнерам
    Then click button Стать партнером
    Then click button Присоединиться к программе
    Then write in the correct email field 'raven0105@mail.ru'
    Then click button Продолжить
    Then write correct name 'Андрей'
    Then click button Отправить

  Scenario: 14 open past events
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section free
    Then click text Прошедшие мероприятия
    Then click past event

  Scenario: 15 open site email in past events
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click section free
    Then click text Прошедшие мероприятия
    Then click email live@skillfactory.ru

  Scenario: 16 misspelling email address 1 in the footer email field (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write in the email first field 'raven0105@mail'
    Then click button Подписаться
    Then get error message wrong email 'Укажите, пожалуйста, корректный email'

  Scenario: 17 misspelling email address 2 in the footer email field (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write in the email second field 'mail.ru'
    Then click button Подписаться
    Then get error message wrong email 'Укажите, пожалуйста, корректный email'

  Scenario: 18 click the receive button with a blank email field (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click button Подписаться
    Then get error message 'Пожалуйста, заполните все обязательные поля'

  Scenario: 19 check correct behavior checkbox in footer (Negative scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write email in footer field 'raven0105@mail.ru'
    Then click checkbox Я даю согласие на обработку своих персональных данных
    Then click button Подписаться
    Then get error message 'Пожалуйста, заполните все обязательные поля'

  Scenario: 20 check correct work email in footer (Positive scenario)
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open write email in footer field 'raven0105@mail.ru'
    Then click button Подписаться

  Scenario: 21 go to the blog page by clicking the button in the footer
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click button Читать блог

  Scenario: 22 go to the page information about the educational organization clicking the text in the footer
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click text Информация об образовательной организации

  Scenario: 23 go to the page information about the educational organization clicking the text in the footer
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click text Пользовательское соглашение

  Scenario: 24 go to the page offer agreement for individuals clicking the text in the footer
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click text Договор-оферта для ФЛ

  Scenario: 25 go to the page offer agreement for legal entities clicking the text in the footer
    Given url of Scillfactory 'https://skillfactory.ru/'
    When website is open click text Договор-оферта для ЮЛ