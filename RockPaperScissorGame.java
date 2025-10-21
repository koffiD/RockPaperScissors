package day5;

import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the rock paper scissors game");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("0: Rock, 1: Paper, 2: scissors");
		
		int userChoice = input.nextInt();
		
		
		  // Validating input
		  if(userChoice < 0 || userChoice > 2) 
		  {
		   System.out.println("This choice is invalid. Retry with 0,1 0r 2"); 
		  // return();
		   
		  }
		  //exits the program }
		 
		
		// Compute random choice
		int computerChoice = (int) (Math.random()*3);
		System.out.println(computerChoice);
		
		// Determine the Winner
		
		if(userChoice == computerChoice)
		{
			System.out.println("This is equal, no winner");
		}
		
		else if (userChoice==0 && computerChoice == 2 || userChoice==1 && computerChoice == 0||userChoice==2 && computerChoice == 1)
				
				{
					System.out.println("You Won");
				}
		else
		{
			System.out.println("computer Wins");
		}
		
		input.close();
	}

}
