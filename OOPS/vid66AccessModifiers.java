package OOPS;

class example{

    //Variables Example
    public int oneDigit = 5;
    protected int twoDigit = 65;
    int threeDigit = 356;
    private int fourDigit = 4589;

    // Methods
    void meth1(){
        System.out.println(oneDigit);
        System.out.println(twoDigit);
        System.out.println(threeDigit);
        System.out.println(fourDigit);
    }
}

//new subclass
class example1 extends example{
    //methods
    void meth2(){
        System.out.println(oneDigit);
        System.out.println(twoDigit);
        System.out.println(threeDigit);
//        System.out.println(fourDigit);
    }
}

public class vid66AccessModifiers {
    public static void main(String[] args) {

        //Class Access Modifier
        // object of class Example
        example firstObj = new example();
        firstObj.meth1();

        //Package Access Modifier
        System.out.println(firstObj.oneDigit);
        System.out.println(firstObj.twoDigit);
        System.out.println(firstObj.threeDigit);
//        System.out.println(firstObj.fourDigit); //Cannot access because it is private

        //SubClass Access Modifier
        //object for class example2
        example1 secondObj = new example1();
        secondObj.meth2();
    }
}
