package OOPS.CH10Inheritance;

class Animal{
    public String animal;

    //Method
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void walk(){
        System.out.println("Animal is walking");
    }
}

class Dog extends Animal{
    public String name;

    //Method
    public void bark(){
        System.out.println("Bow!! Bow!!");
    }
}

public class vid45 {
    public static void main(String[] args) {

        // Animal class
        System.out.println("Methods called from the Animal class");
        Animal animal1 = new Animal();
        animal1.animal = "Elephant";
        animal1.eat();
        animal1.walk();

        // Dog class
        System.out.println("Methods called from the Dog class");
        Dog dog = new Dog();
        dog.name = "Bruno";
        dog.bark();

        System.out.println("Methods called from Inheritance");
        dog.eat();
        dog.walk();
    }
}
