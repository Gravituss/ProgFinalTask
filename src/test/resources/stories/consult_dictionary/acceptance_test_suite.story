Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions

Scenario: Ensuring cond01
Given chrome started
And proceed to http://www.weather-forecast.com
When the user types the <capital>
Then they should see the corresponding <country>

Scenario: Ensuring cond02
Given the user is on the weather-forecast.com page
When the user looks up the definition of the word 'pear'
Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'


Examples:
|capital|country|
|Washington|United States|
|Kyiv|Ukraine|
|Paris|France|
|Helsinki|Finland|
|Madrid|Spain|
|London|United Kingdom|
|Mexico|Mexico|
|Berlin|Germany|
|Rome|Italy|
|Tokyo|Japan|
