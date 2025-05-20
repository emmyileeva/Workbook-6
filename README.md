# Workbook 6 – Java Practice Projects

This folder contains my Java exercises from Workbook 6.

---

## 📘 Exercises Included

### ✅ AssetPortfolio UML Diagram
- Designed a UML class diagram for an Asset Portfolio application
- Defined abstract class `FixedAsset` with subclasses:
  - `Jewelry`, `Gold`, and `House`
- Added a new interface `Valuable` to represent items with a value
- Created new classes `BankAccount` and `CreditCard` to represent liquid assets and debt
  - `BankAccount` includes `deposit()` and `withdraw()` methods
  - `CreditCard` includes `charge()` and `pay()` methods
- Updated the `Portfolio` class to hold a list of `Valuable` items instead of only `FixedAsset`
- Practiced distinguishing between:
  - Fixed assets (less likely to change in value)
  - Liquid accounts (change frequently and should not extend `FixedAsset`)
- Exported the final diagram to the `assets-diagrams` folder as instructed
- Great practice for:
  - Visualizing class relationships and responsibilities
  - Using interfaces to unify behavior between unrelated classes
  - Updating existing designs to support new requirements

### ✅ Portfolio Exercise (Exercise 1)
- Implemented all Java classes from the Asset Portfolio UML diagram, except the `Portfolio` class
- Created a `com.pluralsight.finance` package for:
  - `BankAccount`, `CreditCard`, and fixed asset classes (`House`, `Gold`, `Jewelry`)
  - Abstract class `FixedAsset` and interface `Valuable`
- Implemented the `getValue()` method for all `Valuable` types
- Created a `FinanceApplication` class to test interactions between classes
- Practiced:
  - Calling methods based on declared type vs actual object type
  - Understanding why `account2.deposit(100)` doesn't compile when declared as `Valuable`
  - Separating fixed assets from liquid assets in code using interfaces

#### 🔁 Continued in Exercise 3: Portfolio Class Logic & User Interaction
- Added the `Portfolio` class with:
  - A `List<Valuable>` to track all assets
  - `add()` method to add new assets
  - `getValue()` to calculate the portfolio's total net worth
  - `getMostValuable()` and `getLeastValuable()` to find top and bottom assets by value
- Updated `FinanceApplication` with interactive console input:
  - User is prompted to add new assets (BankAccount, CreditCard, or House)
  - Program gathers all required fields and adds the asset to the portfolio
  - After exiting, the program prints a summary of total value, most valuable, and least valuable items
- Great practice for:
  - Using polymorphism with interface-based design
  - Writing logic to compare and evaluate object values
  - Building interactive console applications with user input

### ✅ WorkingWithInterfaces
- Demonstrates how to use the `Comparable` interface to sort custom objects
- Defines a `Person` class with three fields:
  - `firstName`, `lastName`, and `age`
- Implements the `compareTo()` method to sort:
  - First by last name
  - Then by first name if last names match
  - Then by age if both names match
- Creates an `ArrayList<Person>` and adds sample data to it
- Uses `Collections.sort()` to sort the list
- Great practice for:
  - Implementing Java interfaces
  - Writing custom sorting logic for objects
  - Using `compareTo()` to control sort behavior
  - Understanding the difference between `ArrayList` and `LinkedList`

---

## ✨ What I Learned
- How to design class diagrams using UML to map out class relationships  
- How to refactor a system to support both fixed and liquid assets  
- How to use interfaces like `Valuable` and `Comparable` to enforce behaviors  
- How to implement the `compareTo()` method for custom sorting  
- How to use `Collections.sort()` with custom objects  
- How to compare multiple properties when sorting (name, age, etc.)  
- Differences between `ArrayList` and `LinkedList` and when to use each  
- How to find max and min from a list of objects  
- How to build simple console interfaces to accept user input and store data



