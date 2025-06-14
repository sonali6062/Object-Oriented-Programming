/*You are required to design a class Counter to keep track of how many objects have been created from it. 
The tracking must be done using the static keyword to ensure a single shared variable across all instances of the class. The class should contain below specification :
Attributes :
count (Integer) : A static variable that tracks the total number of objects created.
Methods :
A default constructor that increments the count variable each time a new object is instantiated.
getCount() : A static method that returns the current value of the count variable.
resetCount() : A static method to reset the value of count variable to 0.*/

//Your code goes here




//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your `Counter` class.

It creates a object of class `Counter`, the default constructor increments the count variable each time a object is created.
At the end we simply call the etCount method to print the total number of objects instantiated.

// Main class to demonstrate the functionality of the Student class
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        while (count-- > 0) {
            Counter obj = new Counter(); // Create Counter objects
        }

        System.out.println("Number of objects created : " + Counter.getCount());

        sc.close();
    }
}

*/
class Counter{
    static int count;
    Counter(){
        count++;
    }
    public static int getCount(){
        return count;
    }
    public static void resetCount(){
        count=0;
    }
}
