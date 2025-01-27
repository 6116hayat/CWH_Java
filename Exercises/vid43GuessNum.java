package Exercises;

import java.util.*;

/*
    1. Constructor to generate random number
    2. takeUserInput() to take input of number
    3. isCorrectNumber() to detect whether number is true or not
    4. getter and setter for noOfGuess

 */

class game{
    public int CompNum, UserInput, noOfGuess = 0;

    public game(){
        Random rand = new Random();
        CompNum = rand.nextInt(0,100);

        // Calling the Methods
        takeUserInput(); // User-Input Method
        CorrectGuess(); // Correct Guess
        playerRank(noOfGuess); // Rank of players
    }


    // Method for UserInput
    public void takeUserInput(){

        do{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your Guess : ");
            UserInput = scan.nextInt();
            if(CompNum > UserInput){
                System.out.println("Take a bigger Number");
            }else if(UserInput > CompNum){
                System.out.println("Take a smaller Number ");
            }
            noOfGuess++;
        }while(CompNum != UserInput);
    }
    // Method for the correct Number
    public void CorrectGuess(){
        if(CompNum == UserInput){
            System.out.println("You Guessed the right Number");
        }
    }

    //Method for the PlayerRank
    public void  playerRank(int noOfGuess){
        if(noOfGuess > 7){
            System.out.println("You are Noobie!!");
        }else if(7 >= noOfGuess && noOfGuess > 3){
            System.out.println("You have potential to become great!!, My Child");
        }else if(noOfGuess <= 3){
            System.out.println("True Master!!, where were you?");
        }
    }
}

public class vid43GuessNum {
    public static void main(String[] args) {
        game player1 = new game();

    }
}
