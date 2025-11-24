Feature: Login Functionality
    Scenario: Successful Login
        Given user launch the browser
        AND user is on login page
        When Enter username and password
        Then dashboard should be visible