package OOPS;

//Overload Example
class sample1 {
    //method
    public void print1(int i){
        System.out.println("This is Method 1 " + i);
    }

    public void print1(String s){
        System.out.println("This a method 2" + s);
    }
}

//Override Example
class sample2{
    public void print2(){
        System.out.println("I am Override Method 1 in class sample 2");
    }
}

class sample3 extends sample2{
    @Override
    public void print2(){
        System.out.println("I am Override method 2 in class sample 2");
    }
    public void print3(){
        System.out.println("I am Override method 2 in class sample 3");
    }
}

public class vid48MethodOverRideOverLoad {
    public static void main(String[] args) {
        // Method-Overload
        sample1 one = new sample1();
        one.print1(5);
        one.print1("Umar");

    // Method Override
    sample2 exam1 = new sample2();
    exam1.print2();

    sample3 exam2 = new sample3();
    exam2.print2();
    exam2.print3();
    }
}
