Feature: To verify login functionality

Scenario Outline: To verify username and password

Given To launch Browser and pass valid url
When To user enter valid username and password
And  To user enter "<username>" and "<password>" 
Then  To closeit

Examples:
|username|password|
|pavan|1234|
|sai|09876|

