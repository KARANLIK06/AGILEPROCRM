@AGL-406
Feature: AGILEPROCRM app Drive function
  User Story:
  As a user, I should be able to use Drive function

  @AGL-372
  Scenario Outline: User should be able to display "My Drive" window by clicking "Drive" tab
    Given User is already with "<username>" and "<password>" logged in and on Activity Stream page
    When User clicks Drive menu item
    Then User should be able to see title is My Drive

    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | marketing2@cybertekschool.com | UserUser |
      | marketing3@cybertekschool.com | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |

  @AGL-380
  Scenario Outline: User should be able to display "Company drive" window by clicking "Company Drive" tab
    Given User is already with "<username>" and "<password>" logged in and on Activity Stream page
    When User clicks Drive menu item
    And User clicks Company Drive tab
    Then User should be able to display Company drive window
    Examples:
      | username                      | password |
      | hr1@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | hr2@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com | UserUser |
      | marketing2@cybertekschool.com | UserUser |
      | marketing3@cybertekschool.com | UserUser |
      | helpdesk1@cybertekschool.com  | UserUser |
      | helpdesk2@cybertekschool.com  | UserUser |
      | helpdesk3@cybertekschool.com  | UserUser |
