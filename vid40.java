class sample {
    private double radius;
    private double area;
    private double perimeter;

    //Getter for Radius
    public double getRadius() {
        return radius;
    }

    //Setter for Radius
    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
        this.perimeter = 2 * Math.PI * radius;
    }

    //Getter for area
    public double getArea() {
        return area;
    }

    //Getter for perimeter
    public double getPerimeter() {
        return perimeter;
    }
}

public class vid40 {
    public static void main(String[] args) {
        sample circle = new sample();
        circle.setRadius(5.2);

        System.out.println("Radius: "+ circle.getRadius());
        System.out.println("Area: "+ circle.getArea());
        System.out.println("Perimeter: "+ circle.getPerimeter());
    }
}
