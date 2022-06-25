@LoginPage
  Feature: Login Page


    @Login
    Scenario Outline: Login Scenario
      Given User is on Home page
      When Click Giris Yap card in the top right
      Then Should see Login Page
      When Type email "<email>"
      Then Type password "<password>"
      Then Click Giris yap button
      Examples:
        | email            | password  |
        | deneme@gmail.com | Deneme123 |