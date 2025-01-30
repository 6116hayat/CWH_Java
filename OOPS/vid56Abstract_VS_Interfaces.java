package OOPS;

interface Bicycle{
    int num = 65; // random variable

    //Methods
    void applyBrake(int decrement);
    void speedUp(int decrement);
}

interface MusicalCycle{
    void blowHornB1();
    void blowHornB2();
}

class BugattiCycle implements Bicycle, MusicalCycle{
    //Method
    void blowHorn(){
        System.out.println("blowHorn: Pee Pee Poo Poo Paa");
    }

    // inserting "public" is important for the method
    public void applyBrake(int decrement){
        System.out.println("Applying Brake: Speed Reduced to" + decrement);
    }

    public void speedUp(int increment){
        System.out.println("SpeedUp: Speed Increased to "+ increment);
    }

    @Override
    public void blowHornB1(){
        System.out.println("blowHornB1: Poo Poo Paa Paa");
    }

    public void blowHornB2(){
        System.out.println("blowHornB2: Pee Pee Poo Poo");
    }

}

public class vid56Abstract_VS_Interfaces {
    public static void main(String[] args) {

        // Object for the BugattiCycle class
        BugattiCycle one = new BugattiCycle();

        System.out.println("one.a"); // cannot change properties in Interface as they are final

        one.blowHornB1();
        one.blowHorn();
        one.speedUp(5);

    }
}
