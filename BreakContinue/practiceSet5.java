package BreakContinue;

import java.util.Scanner;

public class practiceSet5 {

    // Answer one : pint the * pattern
    public static void ans1(){
        System.out.println("Sol 1 :Star Pattern");
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // Solution 2
    public static void ans2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit for Even numbers");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.printf("The sum of Even number is %d", sum);
    }


    // Solution 3
    public static void ans3(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number for multiplication table");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", num , i, num * i);
        }
    }

    public static void main(String[] args) {
        // ans1();
        // ans2();
        // ans3();
    }
}
