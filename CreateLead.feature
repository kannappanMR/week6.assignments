Feature: Create Lead in Leaptaps
#Background:
#Given A Chrome browser is launched
#And Load the Leaftaps url 'http://leaftaps.com/opentaps/control/login'
#And maximize the browser
@regression @smoke
Scenario: TC001 Create Lead Positive Flow
#Given enter the username as Demosalesmanager
#And enter the password as crmsfa
#When the login button is clicked
#Then the welcome page should be displayed
#When the 'CRM/SFA' is clicked
#Then the 'My Home' page should be displayed
#When the 'Leads' is clicked
#Then the 'My Leads' page should be displayed
Given the Create Lead button is clicked
And enter the Company Name as siemens
And enter the First Name as kanna
And enter the Last Name as vinoth
When the Submit button is clicked
#And close the browser

