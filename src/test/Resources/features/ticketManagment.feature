Feature: Ticket Managment
  as a user in Kufhu
  i want to create a ticket in diferets

  Scenario: Create ticket in a project position
    Given The user want to create a ticket for project position
    When the user send a request for create ticket
    Then the ticket is created


