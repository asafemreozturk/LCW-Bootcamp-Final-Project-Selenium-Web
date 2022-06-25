@RegisterPage
Feature: Register Page


  @Register
  Scenario Outline: Register Scenario
    Given User is on Home page
    When Click Giris Yap card in the top right
    Then Should see Login Page
    Then Click Uye ol Button on Login Page
    When Type email "<email>" to email placeholder
    Then Type password "<password>" to password placeholder
    When Type phone number "<number>" to number placeholder
    Then Click Kullanıcı sözlesmesi Radio Button
    Then Click Uye Ol Button
    Examples:
      | email            | password  | number |
      | deneme@gmail.com | Deneme123 |  0542 636 36 36 |