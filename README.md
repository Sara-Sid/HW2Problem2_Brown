# Black Friday Deals System
A Java application that uses two design patterns, the Composite Pattern and Observer Pattern, to create a scenario of Black Friday Shopping. 
The system allows:
Building a full catalogue of categories and products (Composite)
Subscribing customers and notifying them about deals (Observer)

## Design Patterns Used
## 1. Composite Pattern
Classes involved:
ProductComponent (abstract)
Product
Category

What it does:
The Composite Pattern  treats  products and categories the same.
A Product is a leaf node.
A Category can contain Products or other Categories.

This pattern allows the system to build a full Black Friday catalog and display everything recursively.

## 2.Observer Pattern
Classes involved:
BlackFridayDeal (Subject / Publisher)
Customer (Observer)

What it does:
Customers can subscribe or unsubscribe from Black Friday notifications.

Whenever a new deal is released, the system notifies all subscribed customers using:
notifyCustomers(String deal)
Each customer prints their own reaction and deal information.

## Project Structure
src/
│
├── ProductComponent.java
├── Product.java
├── Category.java
│
├── Customer.java
├── BlackFridayDeal.java
│
└── Main.java

## Class Descriptions
ProductComponent (abstract)
Base class for both categories and products
Store's name and price

Requires subclasses to implement:
getPrice()
display()

Product
Leaf node in the composite pattern.
Fields:
name
price

Methods:
getPrice()
display() 

Category
A composite node that can contain:
Products
Other categories

Methods:
add(ProductComponent) 
display()

Customer
Stores:
Customer name

Methods:
receiveNotifications(String deal) 

BlackFridayDeal
Implements the Observer pattern.

Methods:
addCustomer(Customer)
removeCustomer(Customer)
notifyCustomers(String deal)

Holds a List<Customer> and notifies all of them whenever a deal is announced.

## Program Flow (Main.java)
1. Build the Product Catalogue (Composite Pattern)
Creates categories like:
Electronics
Clothing
Home Goods
Other Items

Each category is populated with products.
All categories are added to a Black Friday Deals mega-category.
The full catalogue is printed with:

BlackFridayDeal.display();

2. Register Customers & Send Deal Notifications (Observer Pattern)

The system:
Adds customers
Removes one
Announces a deal
Notifies all subscribed customers

Each customer prints their reaction and message.


## Sample Output Highlights
====================================================
Category: Black Friday Deals
Category: Electronics
Product: Laptops Price: $ 2300.0
Product: Desktop Price: $ 5100.0
...
====================================================

Sara is now subscribed to Black Friday Deals
Jaheel is now subscribed to Black Friday Deals
Bella is now unsubscribed from Black Friday Deals
Gavin is now subscribed to Black Friday Deals

Did someone say NEW DEAL!!
Announcing NEW BLACK FRIDAY DEALS
==================================

Sara DID SOMEONE SAY DEAL!!!
50% OFF STORE WIDE, SHOP WHILE IT LAST
Get it now before it is GONE!!
------GET IT WHILE IT LASTSSSS-----


