package Java_Threads;


// Thread Constructors (String name)
class myThr extends Thread{

    //Giving thread a name
    public myThr(String name){
        super(name);
    }

    //method Run
    public void run(){
        int i = 5;
        while(i < 20){
            System.out.println("This is a Thread");
            i++;
        }
    }
}

//Implementing Runnable Interfaces
class myRunnable implements Runnable{

    //Over-riding
    @Override
    public void run(){
        int i = 5;
        while(i < 20){
            System.out.println("This is Runnable Thread");
            i++;
        }
    }
}

public class vid73ThreadConstructors {
    public static void main(String[] args) {
        //Creating Object
        myThr naam = new myThr("Hayat");
        naam.start();
        myThr nayaNaam = new myThr("Danish");
        nayaNaam.start();

        // Printing Details of Thread Naam
        System.out.println("The id of Thread " + naam.getId());
        System.out.println("The name of Thread " + naam.getName());


        // Printing Details of Thread Naya-Naam
        System.out.println("The id of Thread " + nayaNaam.getId());
        System.out.println("The name of Thread " + nayaNaam.getName());

        //Thread Runnable interfaces
        myRunnable myRun = new myRunnable();

        //Creating Threads with runnable and giving names
        Thread t1 = new Thread(myRun, "Hayat-1");
        Thread t2 = new Thread(myRun, "Hayat-2");

        //Starting Threads
        t1.start();
        t2.start();


        // Printing Details of Thread t1
        System.out.println("The id of Thread " + t1.getId());
        System.out.println("The name of Thread " + t1.getName());

        // Printing Details of Thread t2
        System.out.println("The id of Thread " + t2.getId());
        System.out.println("The name of Thread " + t2.getName());
    }
}
