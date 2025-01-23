public class vid42Constructor {
    private String name;
    private int serialNo;

    //Default Constructor
    public vid42Constructor(){
        this.name = "Unknown";
        this.serialNo = 0;
    }

    //Parameterized constructor
    public vid42Constructor(String name, int serialNo){
        this.name = name;
        this.serialNo = serialNo;
    }

    //Method to display Details
    public void display(){
        System.out.println("Name: " + name + ", Serial No: " + serialNo);
    }

    public static void main(String[] args) {
        //Using default constructor
        vid42Constructor first = new vid42Constructor();
        first.display();

        // Using parameter constructor
        vid42Constructor second = new vid42Constructor("Constructor2", 2);
        second.display();


    }
}
