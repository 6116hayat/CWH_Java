package OOPS.CH10Inheritance;

/*
    This Keyword:
    We have to make the cookies for the batch, where we use to sprinkles 1) Hand sprinkles and 2) Machine sprinkles
    THIS :  keyword shows which one should we use for the cookies
 */


class cookie{
    int sprinkles; // A batch of cookies with sprinklers, named sprinklers

    // constructor
    cookie(int sprinkles){
        this.sprinkles = sprinkles; // using 'this' to say: add these sprinklers  to the cookie
    }

    // method
    void showSprinkles(){
        System.out.println("Sprinkles count: "+ this.sprinkles); //saying show me the sprinkles
    }
}

/*
    SUPER Keyword:
    It is used to refer the parent class(superclass) objects
    such as :-
    1) Access parent class variables
    2) Invoke parent class methods
    3) Invoke parent class constructor
 */

class vehicles{
    int speed = 50; // parent class variable

    vehicles(){
        System.out.println("Vehicle constructor called");
    }

    // method
    void displaySpeed(){
        System.out.println("Speed: "+ speed);
    }
}

class car extends vehicles{
    int speed = 100; // subclass variable

    //constructor
    car(){
        super(); // call the constructor of the parent class
        System.out.println("Car constructor called");
    }

    //method
    void displaySpeed(){
        super.displaySpeed(); // call the parent class displaySpeed method
        System.out.println("Speed: "+ speed);
    }
}


public class vid47 {
    public static void main(String[] args) {
        // This keyword
        cookie c1 = new cookie(5); // making a cookie with 5 sprinkles
        c1.showSprinkles(); //showing the sprinkles count

        //Super keyword
        car v1 = new car();
        v1.displaySpeed();
    }
}
