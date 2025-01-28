package OOPS;

abstract class parent2{
    // Method
    public void sayHy() {
        System.out.println("Hy..");
    }

    abstract public void greet();
}

class child2 extends parent2{
    //Method
    @Override
    public void greet(){
        System.out.println("Konichiwa!!!");
    }
}

abstract class child3 extends parent2{
    //Method
    public void th(){
        System.out.println("I am Good..");
    };
}

public class vid53Abstract {
    public static void main(String[] args) {
        // parent2 p = new parent2; // throws -- error
        child2 c = new child2(); // possible because class is concrete
        // child3 p = new child3; // throws -- error

        c.greet();
        c.sayHy();
    }
}
