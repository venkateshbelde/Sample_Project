Feature: Search Product
This feature is used to search for a product on amazon
Line2
Line3

Scenario: Existing Product 

Given I am able to acccess "http://www.amazon.in"
When I search for "Mobile phone"
Then I should get all my result with "mobile" keyword in it

Scenario Outline: Existing Product 

Given I am able to acccess "http://www.amazon.in"
When I search for "<product>"
Then I should get all my result with "<product>" keyword in it

Examples:
|product|
|tv|
|Mobiles|

Scenario Outline: Existing Product 

Given I am able to acccess "<web>"
When I search for "<product>"
Then I should get all my result with "<product>" keyword in it

Examples:
|product|web|
|tv|http://www.amazon.in|
|Mobiles|http://www.amazon.in|