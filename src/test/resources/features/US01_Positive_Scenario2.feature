@US01_Positive
Feature: As a User,
  Login via "Giris Yap" Button

  @US01_1
  Scenario: User Success Login
    Given User on the  "https://www.trendyol.com/"
    And Pop-up close
    When Click on the Giris yap button
    And User fill EmailTextBox
    And User fill PasswordTextBox
    And Submit on the  Giris yap button
    Then Verificate Success Login "tdemailtestdata@gmail.com"

