Feature: UkFlooring Automation

Scenario: UFS_2 
Given  Load Browser and Login URL
Given Click Header
Given Click Footer
Given Click search Button
Given Validate Flash Sale
Given Click My Account
Then Click New Customers
Then Click Registered Customers
Then Click Forgot Password
Then Enter email for retrieve password
Then Click Submit Button
Given Enter email as "Chowdhurymohammad@hotmail.co.uk"
Given Enter Password as "Welcome123"
Given Click Login Button

Scenario: UFS_login
Given  Load Browser and Login URL
Given Click My Account
Given Enter email as "Chowdhurymohammad@hotmail.co.uk"
Given Enter Password as "Welcome123"
Given Click Login Button
Given Click My dashBoard
Given Click Laminate Link
Given Enter ChelseaExtra as Chelsea Extra
Given Click Search Button
Then Enter Chelsealaminate as Chelsea Laminate
Then Enter Kensington laminate
Then Click Brecon Laminate Flooring