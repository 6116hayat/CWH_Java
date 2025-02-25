package Java_Exceptions;

import java.util.Scanner;

// Creating a Exceptions Class
class myExcep extends Exception{
    // Override Methods
    @Override
    public String toString(){
        return "Age Cannot be More than 125 years";
    }

    @Override
    public String getMessage(){
        return "Age cannot be -ve";
    }

}

public class Vid82exceptionClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age please");
        int a = scan.nextInt();
        if(a<9){

            //surrounding with try-Catch
            try{
                //object of Exception Class
                throw new myExcep();
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
