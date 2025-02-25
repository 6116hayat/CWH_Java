package Java_Threads;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        System.out.println("Thank You for Using ME: " + this.getName());
        while(i < 10){
            System.out.println("This is Thread Name : " +Thread.currentThread().getName());
            System.out.println("This is Thread Priority No: " +Thread.currentThread().getPriority());
            i++;
        }
    }
}

public class Vid74ThreadPriority {
    public static void main(String[] args) {
        //Creating Object
        MyThr1 ONE = new MyThr1("Hayat1 (MINIMUM)");
        MyThr1 TWO = new MyThr1("Hayat2");
        MyThr1 THREE = new MyThr1("Hayat3 (NORMAL)");
        MyThr1 FOUR = new MyThr1("Hayat4");
        MyThr1 FIVE = new MyThr1("Hayat5 (MAX PRIORITY)");

        //Setting Priority
        ONE.setPriority(Thread.MIN_PRIORITY);
        THREE.setPriority(Thread.NORM_PRIORITY);
        FIVE.setPriority(Thread.MAX_PRIORITY);

        //Starting Threads
        ONE.start();
        TWO.start();
        THREE.start();
        FOUR.start();
        FIVE.start();
    }
}
