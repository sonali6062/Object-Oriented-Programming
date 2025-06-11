/* Problem statement
Base Class: Employee

Attributes : 1) name (string) : Represents the name of the employee.
2) id (Integer) : Unique identifier for the employee.

Methods : 1) displayDetails () : Prints the name and id.


Derived Classes : a) Manager

Attributes : 1) teamSize (Integer) : The size of team managed.
Methods : 1) displayDetails () : calls the parent class method displayDetails() and then prints teamSize.
b) Engineer

Attributes : 1) specialization (string) : The engineer's area of interest.
Methods : 1) displayDetails () : Calls the parent class method displayDetails() and then prints the specialization.*/

//Your code goes here




//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your base class `Employee`, driver classes 'Manager', 'Engineer'.".

It creates a object of class `Manager`, uses the parametrised constructor to initialize the attributes of Manager and Employee class.
It then prints a line with text message "Manager Details".
Then it calls th displayDetails() method of class Manager which prints details of manager.

It creates a object of class `Engineer`, uses the parametrised constructor to initialize the attributes of Engineer and Employee class.
It then prints a line with text message "Engineer Details".
Then it calls th displayDetails() method of class Engineer which prints details of engineer.


public class Main {

    public static void main(String[] args) {
    
        String M_name, E_name, E_specialization;
        int M_id, E_id, M_teamSize;
    
        // Create Manager instance
        Manager manager = new Manager(M_name, M_id, M_teamSize);
        System.out.println("Manager Details");
        manager.displayDetails();

        // Create Engineer instance
        Engineer engineer = new Engineer(E_name, E_id, E_specialization);
        System.out.println("\nEngineer Details");
        engineer.displayDetails();
    }
}

*/

/*
//Below is the output statements

System.out.println("Name : " + name);
System.out.println("Id : " + id);
System.out.println("Team Size : " + teamSize);
System.out.println("Specialization : " + specialization);

*/

class Employee{
    public String name;
    public int id;
    public Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void displayDetails(){
        System.out.println("Name : "+name);  
        System.out.println("Id : "+id);
    }
}
class Manager extends Employee{
    public int teamSize;
    public Manager(String name,int id,int teamSize){
        super(name,id);
        this.teamSize=teamSize;
    }
    //override displayDetails of parent class
    public void displayDetails(){
       // System.out.println("Manager Details : ");
        super.displayDetails();  
        System.out.println("Team Size : "+teamSize);
    }
}
class Engineer extends Employee{
    public String specialization;
    public Engineer(String name, int id,String specialization){
        super(name,id);
        this. specialization=specialization;
    }
    public void displayDetails(){
        //System.out.println("Engineer Details : ");
        super.displayDetails();
        System.out.println("Specialization : "+specialization);
    }
}



















