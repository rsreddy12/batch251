Feature: launch sites
	Scenario Outline: Google test
    Given launch google site with "<site>"
    Then close site
  Examples:
  	|   site               |
  	|https://www.gmail.com |
  	|https://www.google.com|