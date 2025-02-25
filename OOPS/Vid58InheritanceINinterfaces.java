package OOPS;

// Interfaces
interface SampleInterface{
    //Methods
    void meth1();
    void meth2();
}

interface childSampleInterface extends SampleInterface{
    //Methods
    void meth3();
    void meth4();
}

//Classes
class SampleClass implements childSampleInterface{

    //Define interface Methods
    public void  meth1(){
        System.out.println("This is Method 1");
    }
    public void  meth2(){
        System.out.println("This is Method 2");
    }
    public void  meth3(){
        System.out.println("This is Method 3");
    }
    public void  meth4(){
        System.out.println("This is Method 4");
    }
}

public class Vid58InheritanceINinterfaces {
    public static void main(String[] args) {

        //Creating Object
        SampleClass obj = new SampleClass();

        obj.meth1();
        obj.meth4();
        obj.meth3();
    }
}
