//https://www.geeksforgeeks.org/cpp/can-constructor-private-cpp/
//It's a myth that the constructor is always public.It can have any type of access specifier. that can be public,private or protected. It can be done using friend class.
class Rectangle {
    private double length;
    private double width;
    private double area;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        this.area = this.length * this.width;
        return this.area;
    }

    // Method to display details
    public void displayDetails() {
        System.out.printf("Length : %.2f\n", this.length);
        System.out.printf("Width : %.2f\n", this.width);
        System.out.printf("Area : %.2f\n", this.area);
    }
}
