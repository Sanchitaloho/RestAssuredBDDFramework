Feature:
 Verify different het operations
 
 Scenario: Verify one user of the portal
 Given I perform get operation for +\/user/
 And I get the user details of user id " 1"
 Then I should get the email as "croy@gmail.com"
 
 
 Scenario: Verify collection of authors in the post
    Given I perform GET operation for "/posts"
    Then I should see the author names

  Scenario: Verify Parameter of Get
    Given I perform GET operation for "/posts"
    Then I should see verify GET Parameter

  @smoke
  Scenario: Verify GET operation with bearer authentication token
    Given I perform authentication operation for "/auth/login" with body
      | email              | password  |
      | croy@email.com | haha123 |
    Given I perform GET operation for "/posts/1"
    Then I should see the author name as "Karthik KK"

  @smoke
  Scenario: Verify GET operation with json validation
    Given I perform authentication operation for "/auth/login" with body
      | email              | password  |
      | sank@email.com | haha123 |
    Given I perform GET operation for "/posts/1"
    Then I should see the author name as "Chayan roy" with json validation
 