@US01_Negative
Feature: As a User,
  Login via "Giris Yap" Button

  @US01_2
  Scenario: User Success Login
    Given User on the  "https://www.trendyol.com/"
    And Pop-up close
    When Click on the Giris yap button
    And User fill  invalid EmailTextBox
    And User fill PasswordTextBox
    And Submit on the  Giris yap button
    Then Verificate fail Login massage "E-posta adresiniz ve/veya şifreniz hatalı."

