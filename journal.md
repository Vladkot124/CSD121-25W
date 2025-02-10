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
