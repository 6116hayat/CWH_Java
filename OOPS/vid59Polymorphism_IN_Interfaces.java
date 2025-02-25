package OOPS;

//Interfaces
interface Camera2{
    //Methods
    void takePic();
    void recordVideo();

    private void msg(){
        System.out.println("This is Message..");
    }

    //default Method
    default void takeHdPic(){
        msg();
        System.out.println("Taking a Pic in HD");
    }
}

interface playGame2{
    //An array for games
    String[] getGames();
    //methods
    void runGame(String gameName);
}

// Classes
class myPhone2{
    //Methods
    void makeCall(int num){
        System.out.println("Making Call to" +num);
    }
}

//main Class implementing interfaces and inheriting SuperClass
class mySmartphone2 extends myPhone2 implements Camera2, playGame2{
    // Defining the methods
    public void takePic(){
        System.out.println("Taking a Pic");
    }
    public void recordVideo(){
        System.out.println("Record Video");
    }

    // Creating String for the Games
    public String[] getGames(){
        System.out.println("Getting list of Games");
        String[] gamesList = {"God_of_War", "Halo", "Valorant"};
        return gamesList;
    }

    public void runGame(String gameName) {
        System.out.println("Running Game:" + gameName);
    }
}

public class vid59Polymorphism_IN_Interfaces {
    public static void main(String[] args) {
        //Creating obj for smartphone class
        mySmartphone2 ms = new mySmartphone2();

        String[] ar = ms.getGames();

        for (String item: ar){
            System.out.println(item);
        }

        System.out.println("\n");

        ms.takeHdPic();

        System.out.println("\n");

        //Polymorphism in Dynamic Method Allocation

        Camera2 exmp = new mySmartphone2(); //Camera obj created using smartphone class
        exmp.takeHdPic(); // Camera Method implemented
        exmp.recordVideo(); // Camera Method implemented

        playGame2 exmp2 = new mySmartphone2(); // PlayGame obj created using smartphone class
        exmp2.runGame("God_of_War"); // playGame method implemented

    }
}
