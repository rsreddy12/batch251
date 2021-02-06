Feature: Google and Gmail title test scenarios

	@realtest
  Scenario: Google title test
    Given launch google site with "https://www.google.com"
    When validate title as Google
    Then close site
  @smoketest
  Scenario: Gmail title test
    Given launch gmail site with "https://www.gmail.com"
    When validate title as Gmail
    Then close site
    
    