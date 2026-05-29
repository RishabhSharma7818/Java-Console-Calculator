# Java Console Calculator

A simple console-based calculator application developed in Java.
This project performs basic arithmetic operations and demonstrates Java concepts such as OOP, exception handling, loops, methods, and user input handling.

## Features

* Addition
* Subtraction
* Multiplication
* Division
* Menu-driven interface
* Input validation
* Custom exception handling
* Division by zero handling

## Concepts Used

* Classes and Objects
* Methods
* Loops
* Switch Case
* Exception Handling
* Custom Exceptions
* Scanner Class

## Project Structure

```text id="0tk8hm"
Calculator.java
├── CannotDivideByZeroException
├── MaxInputException
└── Calculator Class
```

## Custom Exceptions

### CannotDivideByZeroException

Thrown when attempting to divide a number by zero.

### MaxInputException

Thrown when the entered number exceeds the allowed limit.

## How It Works

1. The program displays a menu.
2. The user selects an operation.
3. The user enters two numbers.
4. The calculator performs the selected operation.
5. Exceptions are handled properly if invalid input occurs.
6. The program continues until the user exits.

## Example Output

```text id="e7bn12"
========== Welcome to My Calculator ==========

Choice 1 : Addition
Choice 2 : Subtraction
Choice 3 : Multiplication
Choice 4 : Division
Choice 5 : Exit

Please enter your choice : 1
Please enter first number : 10
Please enter second number : 20

Result : 30.0
```

## Requirements

* Java JDK 8 or above

## How to Run

Compile the program:

```bash id="vx6qzt"
javac Calculator.java
```

Run the program:

```bash id="x2fjq7"
java Calculator
```

## Future Improvements

* Scientific calculator functions
* GUI version using Java Swing or JavaFX
* Calculation history
* Additional mathematical operations

## Author

Rishabh
