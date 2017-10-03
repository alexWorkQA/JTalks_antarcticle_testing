@selenium
 Feature: As user I will be able to create new article

  Scenario: Check that user is able to create new article
    Given I logged in main page of JTalks Articles
    When I click "Create article"
    Then "New Article" page was opened
    And "Write" tab is activated
    When I enter "TestArticle" to "Article title" textfield
    And I enter "It's just test article" to "Enter article content here ..." textfield
    And I enter "#QAtest" to "Tag" textfiled
    And I click "Create article" button
    Then new article with "Bla bla bla" was created