package Array;

import java.util.Scanner;

public class practiceSet6 {

    // Answer 1
    public static void ans1(){
        Scanner input = new Scanner(System.in);

        float [] nums = new float[5];
        System.out.println("Enter the float num for the Array");
        float sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextFloat();
            sum += nums[i];
        }
        System.out.printf("The sum of all floats %.2f", sum);
    }

    // Answer 2


    // Main function
    public static void main(String[] args) {
        ans1();
    }
}
