Feature: test api calls

		Scenario: get list of all countries
		Given url 'http://localhost:8098/movies/100'
		When method GET
		Then status 200
		* def expected = 'Lock, Stock and Two Smoking Barrels'
		And match response.name == expected