Feature: Deletelead in testleaf
#Background:
#Given Chrome browser is launched 'ChromeDriver'
#And leaftaps URL is loaded 'http://leaftaps.com/opentaps/control/login'
#And window has been maximized
@functional @regression
Scenario Outline:TC003 Deletelead in testleaf in positive flow 
#Given enter the username as <username>
#And enter the password as <password>
#When login button is clicked
#Then welcome page is displayed
#When the CRMSFA is clicked
#When lead button is clicked
Given find leads1 is clicked
When phone is clicked
And enter the phone number as <phoneNumber>
When find leads button is clicked
When Click 1st resulting lead id
When Delete button is clicked
#And close the browser
Examples:
|username|password|phoneNumber|
|'DemoSalesManager'|'crmsfa'|'99'|
|'DemoCSR'|'crmsfa'|'99'|
