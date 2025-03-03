# Developer Journal

## Project Overview
- **Project Name:** Hello World Java Program
- **Objective:** Create a simple Java program to take user input, check the number, and save the result to a file.

## Date: 15 January 2025

### Progress:
- **Step 1:** I started by creating a simple "Hello World" program to print text on the screen.
- **Step 2:** I added a part where the user can enter their name and a number.
- **Step 3:** I used an if-else statement to check if the number is positive, negative, or zero.
- **Step 4:** I used a loop to print the number 5 times.
- **Step 5:** I added a list to store the number multiple times and printed the list.
- **Step 6:** I added a feature to write the user’s name and numbers to a file and handle errors with a try-catch block.

### Challenges:
- I had problems writing to the file, but I solved them using a try-catch block to handle errors.
- It was hard to make the output clear on the screen, but I fixed it by using simple print statements.

### Next Steps:
- Finish testing the program and check for any problems.
- Try adding more features like checking if the number is a valid input.

### References:
- Java Documentation: https://docs.oracle.com/javase/8/docs/api/
- GitHub Respository: [https://github.com/Vladkot124/CSD121-25W](https://github.com/Vladkot124/CSD121-25W)

## Date: 28 January 2025


### Project Overview
**Project Name:** Avatar Generator  
**Objective:** Improve the readability and maintainability of the AvatarGenerator program by adding meaningful comments and JavaDoc documentation.  
**Date:** 28 January 2025

### Progress
- Reviewed the existing Java code and identified areas that required better explanations.
- Added JavaDoc comments for each method, detailing its purpose, parameters, preconditions, and postconditions.
- Improved inline comments to explain key parts of the program, such as HTTP requests, GUI setup, and error handling.
- Ensured that comments followed a consistent format and aligned with Java best practices.
### Challenges
- Understanding the flow of the program before writing comments required careful reading of the code.
- Deciding what level of detail to include in the comments without making them redundant.
- Ensuring that JavaDoc syntax was correctly formatted to generate proper documentation.

### Next Steps
- Verify the JavaDoc documentation by generating and reviewing the output.
- Check if additional clarification is needed for any complex parts of the code.
- Apply the same documentation approac        Your paragraphs are tottaly fine just I need signs as here

# Journal for Lab 3 - Tic Tac Toe Game

## 1. Setting Up the Project
- I started by creating a new project in IntelliJ.
- I made a package called `lab3` and added folders for `game` and `ui`.
- Then, I created the main classes: `Board`, `Game`, `Console`, and `Main`.
- At first, I was unsure where to put each file, but I organized them based on their roles in the game.

## 2. Creating the Board
- I made a `Board` class to store the Tic Tac Toe grid.
- At first, I had trouble figuring out how to display the board correctly.
- After some testing, I used a 2D array to represent the board and added a method to print it.

## 3. Writing the Game Logic
- I created a `Game` class to handle the rules.
- I had problems with checking if the game was over and how to determine the winner.
- I fixed this by adding a method to check for a win or a draw after every move.

## 4. Console Input and Player Moves
- I made a `Console` class to get player input.
- At first, `console.startGame()` gave me an error because I forgot to create the method.
- I fixed it by writing the function properly and linking it to `Game`.
- Another problem was handling invalid moves, which I fixed by checking if the chosen spot was empty before placing a move.

## 5. Running and Debugging
- When I first ran the game, it printed `"Hello, World!"` instead of starting Tic Tac Toe.
- I realized that my `Main` class was not correctly set up.
- After fixing it, I successfully ran the game, and it asked for player input.

## 6. Final Testing and Improvements
- The game worked, but I had some small issues.
- At one point, `printBoard()` and `makeMove()` showed errors because they were not correctly linked.
- I fixed them by checking the method names in `Game`.
- I also had to fix a typo in `getWinnerMessage()`.

## Conclusion
- This lab helped me understand Java classes, methods, and how to structure a simple game.
- I faced some errors, but by debugging and fixing them one by one, I made a working Tic Tac Toe game.
- This was a good learning experience!  



## January 20, 2025 (Monday) - Lecture Notes: Introduction to Java
Today, we started the course with an introduction to Java programming. The focus was on the fundamentals: data types, variables, and control structures. The instructor emphasized the importance of understanding how Java handles different data types, including int, float, double, char, and boolean.

Key points discussed:

- **Data Types**: We learned how to declare and use variables in Java.
- **Control Structures**: We explored basic control structures like if, else, and while loops.
- **Method Declaration**: The importance of method signature, and the difference between void and returning values.

I had a couple of questions on how to choose the right data type for a project, especially in terms of memory optimization. I'll explore more about this in the next few days.

## January 22, 2025 (Wednesday) - Lecture Notes: Using Objects
In this lecture, we dived into object-oriented programming (OOP) and the concept of using objects in Java. We discussed the creation and utilization of objects and classes, and how to implement constructors and methods.

Key concepts covered:

- **Classes and Objects**: Understanding the relationship between classes and objects was the highlight of this lecture. A class is a blueprint, and an object is an instance of that blueprint.
- **Constructors**: We learned how to create constructors to initialize objects.
- **Methods**: The importance of creating methods to define the behaviors of objects was emphasized.

Challenges I faced included understanding how constructors can be overloaded. I plan to practice more on creating constructors with different parameters.

## January 25, 2025 (Saturday) - Personal Project Work
Today, I focused on applying what I learned to a simple Java program where I took user input and stored the results in a file. The goal was to practice object creation and method usage. I used a Scanner object to get input from the user, and then wrote that data to a text file.

Issues encountered:

- Writing to a file wasn't smooth at first. I had to properly manage file handling and exceptions using try-catch blocks.

## January 27, 2025 (Monday) - Lecture Notes: Implementing Classes
In today’s class, we focused on implementing classes with methods that work on objects. The concept of instance variables and methods was explored in depth.

Highlights:

- **Encapsulation**: The idea that you should keep the internal workings of an object hidden from other objects, exposing only the necessary features via methods.
- **Access Modifiers**: We studied the different access levels: private, public, protected, and their use cases.

The lecturer showed examples of creating a Book class with instance variables like title and author and methods like getTitle() and setTitle(). This helped me understand how to keep object data safe while still allowing controlled access.

## January 29, 2025 (Wednesday) - Lecture Notes: More on Objects and Methods
This lecture expanded on the use of objects, focusing on methods that operate on objects and return values. We also worked with ArrayLists and iterators in Java.

Key lessons:

- **Method Overloading**: The ability to have methods with the same name but different parameters.
- **ArrayList Usage**: This dynamic data structure allows you to store elements and access them using indices, unlike arrays in Java.
- **Iterators**: We learned how to use iterators to loop through elements in collections like ArrayLists.

Today’s session helped me better understand how to handle dynamic data and iterate through collections, which I can apply to future projects.

## February 1, 2025 (Saturday) - Personal Project Work
Worked on refining the program from last week. I added error handling for user input and improved the file writing process. I also started incorporating the idea of method overloading in my project. The methods to handle user input now have different signatures depending on the type of data entered.

## February 3, 2025 (Monday) - Lecture Notes: Build Automation and Testing
We covered the concepts of Build Automation and Testing in Java today. The focus was on tools like Maven for project management and automating the build process.

Key highlights:

- **Maven**: This tool automates the build process, allowing you to handle dependencies and project structure more efficiently.
- **JUnit**: We were introduced to the basics of JUnit testing to write unit tests for our Java code.

I was particularly interested in JUnit testing, as it provides a way to test individual units of code for correctness. I plan to integrate JUnit tests into my projects moving forward.

## February 5, 2025 (Wednesday) - Lecture Notes: More on Build Automation and Testing
We dug deeper into Maven and JUnit today. The lecture included examples of unit testing and how to integrate them with Maven for automatic testing during the build process.

Key points:

- **JUnit Tests**: Writing test cases to ensure the code works as expected.
- **Maven Integration**: We saw how Maven helps in automatically running tests during the build process.

I also realized the importance of continuous integration and automatic testing, which will save time and reduce human error in future projects.

## February 8, 2025 (Saturday) - Personal Project Work
- I applied the lessons from the Maven and JUnit lectures to my current project. I set up Maven to manage my dependencies and added some basic unit tests to check if my methods worked as expected. This helped me identify and fix a couple of issues with input validation that I hadn’t noticed before.
## February 10, 2025 (Monday) - Lecture Notes: Advanced Object-Oriented Concepts
Today’s lecture was about more advanced OOP concepts like Inheritance and Polymorphism.


We continued our discussion on OOP concepts, focusing on abstract classes and interfaces.

Key points:

Abstract Classes: These classes cannot be instantiated but can provide a base for other classes to inherit from.
Interfaces: Interfaces define methods without implementations, which must be implemented by classes.
This lecture really helped clarify the role of abstract classes and interfaces in OOP design. I’m now more confident in my ability to apply these concepts in larger projects.
- **Inheritance**: We learned how a subclass can inherit properties and methods from a superclass.
- **Polymorphism**: The ability of an object to take on many forms, such as method overriding and dynamic method dispatch.

I had some difficulty understanding how polymorphism works, especially when trying to override methods in subclasses. I plan to review the concept by writing more example code.

## February 12, 2025 (Wednesday) - Lecture Notes: Finalizing OOP Concepts
We continued our discussion on OOP concepts, focusing on abstract classes and interfaces.

Key points:

- **Abstract Classes**: These classes cannot be instantiated but can provide a base for other classes to inherit from.
- **Interfaces**: Interfaces define methods without implementations, which must be implemented by classes.

This lecture really helped clarify the role of abstract classes and interfaces in OOP design. I’m now more confident in my ability to apply these concepts in larger projects.

## February 14, 2025 (Friday) - Personal Project Work
- Worked on improving the code for my ongoing project by adding more structure using inheritance. I created a base class Person with subclasses like Student and Teacher. This allowed me to reuse common functionality and add specific behavior to each subclass.
## February 17, 2025 (Monday) - Lecture Notes: Polishing Java Code 
- IIn today’s lecture, we discussed how to refine Java code . The focus was on code readability, proper commenting, and optimization.

- Key lessons:

- Refactoring: We practiced refactoring code to improve performance and readability.
- Commenting: Proper commenting to ensure that the code is easily understandable by others.
- I  realized that refactoring is an important step in improving code efficiency and readability, and it should be part of every development process.

