#Author: deisy mosquera
# Correo: deisymsqr6@gmail.com

Feature: search product in the page cybermetro
  I as a user, need enter to page cybermetro and search a product and add it to the shopping cart
  and validate  that it was added correctly.

  Background:the user open page cybermetro
    Given that user enter to page

  @tagM
  Scenario: search product
    When  He search product and add it to the shopping cart
    Then  He validate that it was added correclty
