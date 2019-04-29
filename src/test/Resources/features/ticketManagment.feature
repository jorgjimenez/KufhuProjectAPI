Feature: Ticket Managment
  as a user in Kufhu
  i want to create a ticket in diferets

  Background:
    Given the user has the information of BaseURL

  Scenario: Create ticket in a project position
    Given The user want to create a ticket
    When the user sends a request to create a ticket for a "Bench" position
    Then the ticket is created


