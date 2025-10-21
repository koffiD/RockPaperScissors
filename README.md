🎮 Rock Paper Scissor Game






A fun and simple Java console game where you play Rock, Paper, Scissors against the computer.
The computer makes a random choice, and the program determines who wins based on classic game rules.

🧠 Game Rules
Player Choice	Computer Choice	Result
Rock (0)	Scissors (2)	✅ Player Wins
Paper (1)	Rock (0)	✅ Player Wins
Scissors (2)	Paper (1)	✅ Player Wins
Same Choice	Same Choice	🤝 Tie
⚙️ How It Works

The player chooses 0 (Rock), 1 (Paper), or 2 (Scissors).

The computer randomly picks a number between 0 and 2.

The program compares both choices and displays:

🏆 You Won

🤖 Computer Wins

🤝 This is equal, no winner

💻 Example Run
Welcome to the rock paper scissors game
Enter your choice
0: Rock, 1: Paper, 2: scissors
1
Computer chose: 0
You Won

🧩 Code Overview
int computerChoice = (int) (Math.random() * 3); 
// Generates a random number between 0 and 2

if (userChoice == computerChoice)
    System.out.println("This is equal, no winner");
else if ((userChoice == 0 && computerChoice == 2) ||
         (userChoice == 1 && computerChoice == 0) ||
         (userChoice == 2 && computerChoice == 1))
    System.out.println("You Won");
else
    System.out.println("Computer Wins");

🚀 How to Run

Save the file as RockPaperScissorGame.java

Open terminal or IDE (VS Code, IntelliJ, or Eclipse)

Compile and run:

javac RockPaperScissorGame.java
java RockPaperScissorGame

🧾 Requirements

☕ Java JDK 8 or higher

🖥️ A terminal or IDE that supports Java

🔮 Future Improvements

Add a score tracker for multiple rounds

Let the player play again without restarting

Add GUI (Graphical User Interface) with buttons for choices

Include sound effects or animations
