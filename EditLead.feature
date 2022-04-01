Feature: Editlead in testleaf
#Background:
#Given Chrome browser is launched 'ChromeDriver'
#And leaftaps URL is loaded 'http://leaftaps.com/opentaps/control/login'
#And window has been maximized
@smoke @snaity
Scenario Outline:TC002 Edit Lead Positive Flow 
#Given enter the username as <username>
#And enter the password as <password>
#When login button is clicked
#Then welcome page is displayed
#When the CRMSFA is clicked
#When lead button is clicked
Given find leads is clicked
And enter the First name as Test
And findlead submit button is clicked
When 1st resulting lead id is clicked
Then editlead page is displayed
And edit button is clicked
And company name is cleared
And enter the company name as <companyName>
And click submit button
#And Close the Browser
Examples:
|username|password|companyName|
|'Demosalesmanager'|'crmsfa'|'Siemens'|
|'DemoCSR'|'crmsfa'|'Amazon'|
