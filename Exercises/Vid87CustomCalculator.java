package Exercises;

/*
Briefing of the Exercise
You have to create a custom calculator with following operations:
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000

 */

import java.util.Scanner;

// Exception Class
class exe6Excep extends Exception{
    public exe6Excep(String message){
        super(message);
    }
}

// Main class
public class Vid87CustomCalculator {
    public static void main(String[] args) {
        // Scanner Class for taking input
        Scanner scan = new Scanner(System.in);

        // Initializing variables for storing numbers and Operator
        int num1, num2, sol;
        String oper;

        System.out.println("Enter the first Number ");
        num1 = scan.nextInt();
        System.out.println("Enter the second Number ");
        num2 = scan.nextInt();

        System.out.println("Choose an operator: '+' , '-', '*', '/'");
        oper = scan.next();

        // try-catch block (Num > 100000)
        try {
            if (num1 > 100000 || num2 > 100000) {
                throw new exe6Excep("Number input is Greater than 100000");
            }

            //Calculator Operation using Switch
            switch(oper){
                case "+":
                    sol = num1 + num2;
                    break;
                case "-":
                    sol = num1 - num2;
                    break;
                case "*":
                    // max multiplier Exception
                    if(num1 > 7000 || num2 > 7000){
                        throw new exe6Excep("Multiplier is Greater than 7000");
                    }
                    sol = num1 * num2;
                    break;
                case "/":
                    // exception for 0/num
                    if(num2 == 0){
                        throw new exe6Excep("number 2 is 0, Invalid Division");
                    }
                    sol = num1 / num2;
                    break;
                default:
                    throw new exe6Excep("Invalid Operation");
            }
            System.out.println("The Result is : " + sol);
        }catch(exe6Excep e){
            System.out.println(e.getMessage());
        }

        scan.close(); // closing the scanner
    }
}
