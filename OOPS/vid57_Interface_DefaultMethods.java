package OOPS;

interface Camera{

    //Method
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good morning");
    }

    //Default method
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface playGame{

    //Method
    String [] getGames();
    void runGame(String gameName);
}

class MyPhone{

    //method
    void makeCall(int num){
        System.out.println("Calling to "+ num);
    }

    void pickCall(String name){
        System.out.println("Picking Call from "+ name);
    }
}

class MySmartphone extends MyPhone implements Camera, playGame{
    //methods
    public void takeSnap(){
        System.out.println("Taking a picture");
    }

    public void recordVideo(){
        System.out.println("Recording Video");
    }

    public String[] getGames(){
        System.out.println("Getting list of Games");
        String[] gamesList = {"God_of_War", "Halo", "Valorant"};
        return gamesList;
    }

    public void runGame(String gameName) {
        System.out.println("Running Game:" + gameName);
    }
}

public class vid57_Interface_DefaultMethods {
    public static void main(String[] args) {
        MySmartphone ms = new MySmartphone();
        String[] ar = ms.getGames();

        for (String item: ar){
            System.out.println(item);
        }

        System.out.println("\n");

        ms.record4kVideo();
    }
}
