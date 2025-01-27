package OOPS;

class Phone{
    //Methods
    public void call(){
        System.out.println("Making a call..");
    }

    public void on(){
        System.out.println("Switching on Phone");
    }
}

class Smartphone extends Phone{
    //Methods
    public void playing(){
        System.out.println("Loading GTA: San Andreas");
    }

    public void on(){
        System.out.println("Switching on Smartphone");
    }
}

public class vid49DynamicMethodDispatch {
    public static void main(String[] args) {

        // using reference and obj of something else
        Phone obj = new Smartphone();
        obj.call();
        obj.on();

    }
}
