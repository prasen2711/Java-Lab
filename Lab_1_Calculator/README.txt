Calculator Application
Overview
This project is a simple calculator program implemented in Java. It provides various functionalities such as basic arithmetic operations, generating Fibonacci sequences, calculating the mean and variance of an array, and more. The project follows coding guidelines, includes modular code, and supports interactive user input.

Features
Addition - Calculates the sum of an array of numbers.
Subtraction - Subtracts one number from another.
Multiplication - Multiplies two numbers (future extension).
Division - Divides one number by another (future extension).
Fibonacci Sequence - Generates the Fibonacci sequence up to n terms.
Mean - Calculates the mean (average) of an array of numbers.
Variance - Calculates the variance of an array of numbers.
Classes and Methods
1. Main.java
The Main class is the entry point of the program. It interacts with the user, calls methods from the UserInput and Calculator classes, and performs the desired operations.

Key Methods:
main(String[] args):
Controls the flow of the program.
Invokes methods based on user input.
Utilizes a switch-case structure to call the desired operation.
2. UserInput.java
The UserInput class is responsible for handling user interactions, such as receiving input for numbers, arrays, and selecting operations.

Key Methods:
getCalculationChoice():
Displays a menu of operations and returns the user's choice.
getSingleNumber():
Accepts and returns a single integer from the user.
getArrayInput():
Accepts the size of an array and its elements, then returns the array.
3. Calculator.java
The Calculator class contains all the core logic for mathematical calculations.

Key Methods:
add(int[] numbers):
Returns the sum of all elements in the array.
subtract(int a, int b):
Returns the result of subtracting b from a.
fibonacci(int n):
Generates and returns an array containing the first n terms of the Fibonacci sequence.
mean(int[] numbers):
Calculates and returns the mean (average) of the array elements.
variance(int[] numbers):
Calculates and returns the variance of the array elements.