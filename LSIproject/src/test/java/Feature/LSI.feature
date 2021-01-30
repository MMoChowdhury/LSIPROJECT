Feature: LSI Automation

Scenario: UFS_1 Login

Given Load Browser and Login url
Given click My Account link
Given Enter email as "chowdhurymohammad@hotmail.co.uk"
Given Enter Password as "Welcome123"
When Click Login Button
Then Click My Wishlist Link
Then Click Shopping Bag
Then Click Carpet Tiles link
Then Click Add to cart
Then Click Summery Row
Then Click My cart

Scenario: UFS_2 Product

Given Load Browser and Login url
Given click My Account link
Given Enter email as "chowdhurymohammad@hotmail.co.uk"
Given Enter Password as "Welcome123"
When Click Login Button
Then Enter Product as "Product"
Then Click View Product Button
Then Click Grid View
Then Click List View
Then Click Sort By
Then Sort By Price
Then Sort By Name 
Then Click Ascending Direction
Then Click Descending Direction
