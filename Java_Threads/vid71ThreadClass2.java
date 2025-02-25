package Java_Threads;

// Creating a thread using Runnable Interface

class myThreadRunnable1 implements Runnable{
    //Methods
    public void run(){
        int i = 0;
        while(i < 1000){
            System.out.println("I'm JOKER");
            System.out.println("HA....HA....HA");
            i++;
        }
    }
}

class myThreadRunnable2 implements Runnable{
    //Methods
    public void run(){
        int i = 0;
        while(i < 1000){
            System.out.println("I'm BATMAN");
            System.out.println("Dark knight Rises");
            i++;
        }
    }
}

public class vid71ThreadClass2 {
    public static void main(String[] args) {
        // Creating Obj
        myThreadRunnable1 Joker_Dialogue = new myThreadRunnable1();
        Thread Joker = new Thread(Joker_Dialogue);
        Joker.start();

        myThreadRunnable2 Batman_Dialogue = new myThreadRunnable2();
        Thread Batman = new Thread(Batman_Dialogue);
        Batman.start();

    }
}
