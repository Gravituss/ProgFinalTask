Lookup a definition
Narrative:
In order to talk better
As an English student
I want to look up word definitions

Scenario: Ensuring cond01
Given the user is on the weather-forecast.com page
When the user looks up the definition of the
Then they should see the definition 'A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.'

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
