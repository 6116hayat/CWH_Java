package BreakContinue;

public class breakContinue {
    public static void main(String[] args) {
        // Break and Continue using loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is Great");
            if(i == 2){
                System.out.println("End");
                break;
            }
        }
    }
}
