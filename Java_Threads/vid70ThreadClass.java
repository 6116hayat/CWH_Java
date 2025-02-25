package Java_Threads;

// Creating Thread By Extending Thread Class

class myThread1 extends Thread{
    //Method
    public void run(){
        int i = 0;
        while (i < 1000){
            System.out.println("This is Thread 1: T1");
            System.out.println(":)");
            i++;
        }
    }
}
// Class 2
class myThread2 extends Thread{
    //Method
    public void run(){
        int i = 0;
        while (i < 1000){
            System.out.println("This is Thread 2: T2");
            System.out.println("XD");
            i++;
        }
    }
}

public class vid70ThreadClass {
    public static void main(String[] args) {
        // Creating Object of Thread 1
        myThread1 threadOne = new myThread1();
        threadOne.start();

        // Creating Object of Thread 2
        myThread2 threadTwo = new myThread2();
        threadTwo.start();

    }
}
