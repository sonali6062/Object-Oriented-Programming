//problem statement
/*Design a class ShapeCalculator that calculates the area of different shapes using method overloading. Implement the below attributes and methods to calculate the area of different shapes :

Methods :

area (integer radius) : Calculates and print the area of circle using the formula π×radius2 .
area (integer length, integer width) : Calculates and print the area of rectangle using the formula (length * width).
area (integer base1, integer base2, integer height) : Calculates and print the area of Trapezoid using the formula ( (base1 + base2) * height) / 2.


Refer the sample examples for understanding the output format.

Refer the commented code for the output statements.

Consider π = 3.14*/

//IMPLEMENTATION 
/*

This is the driver code that will execute and demonstrate the functionality of your class `ShapeCalculator`.

It creates a object of class `ShapeCalculator`.
It then calls the area method with radius as an argument. The method calculates the area of Circle and prints it.
It then calls the area method with length and width as arguments. The method calculates the area of Rectangle and prints it.
It then calls the area method with base1, base2, height as arguments. The method calculates the area of Trapezoid and prints it.


public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int radius = scanner.nextInt();
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int base1 = scanner.nextInt();
        int base2 = scanner.nextInt();
        int height = scanner.nextInt();

        ShapeCalculator sc = new ShapeCalculator();
        sc.area(radius);
        sc.area(length, width);
        sc.area(base1, base2, height);

        scanner.close();
    }
}

*/

/*
//Below are the output statements

System.out.println("Area of Circle : " + result);
System.out.println("Area of Rectangle : " + result);
System.out.println("Area of Trapezoid : " + result);

*/
class ShapeCalculator {

    // Method to calculate and print area of a Circle
    public void area(int radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + (int) result);
    }

    // Method to calculate and print area of a Rectangle
    public void area(int length, int width) {
        int result = length * width;
        System.out.println("Area of Rectangle : " + result);
    }

    // Method to calculate and print area of a Trapezoid
    public void area(int base1, int base2, int height) {
        double result = ((base1 + base2) * height) / 2.0;
        System.out.println("Area of Trapezoid : " + (int) result);
    }

}
