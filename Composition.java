/*
Design a system to manage a composition relationship between a University and its Colleges. Implement the following:

University class :
Attribute: colleges (List of College objects), name (string)
Methods:
addCollege(collegeName, collegeId): Adds a college to the university.
displayDetails(): Prints the university's details along with all associated colleges.

College Class :
Attributes: name (String), id (String).
For output format refer the commented code on IDE.

Examples:
Input : name = "Global_University" ,
college Names = [ "COEP", "PICT", "VJTI", "WCE", "PCCOE" ]
college Id = [ "CO8543", "PI9514", "VJ8643", "VF569", "PC9246" ]
Output :
University Name : Global_University
College Name : COEP
College ID : CO8543
College Name : PICT
College ID : PI9514
College Name : VJTI
College ID : VJ8643
College Name : WCE
College ID : VF569
College Name : PCCOE
College ID : PC9246
Explanation :

First we create the object of class University with name as argument to constructor.
Then we call the method addCollege to add the mentioned college names and id under that university object.
Then the displayDetails method is called to display the content of the University and Colleges.*/

//Your code goes here




//Please Do not change anything below, It is only for your reference.
/*

This is the driver code that will execute and demonstrate the functionality of your class `University` and the class 'College'.


public class Main {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        String name;
        List<String> collegeName, collegeId;

        //creating the object of class University with the name as constructor argument
        University university = new University(name);
        
        //adding the collge names and id using the addCollege mthod called through the university object
        for (int j = 0; j < collegeName.size(); j++) {
            university.addCollege(collegeName.get(j), collegeId.get(j));
        }

        //calling the method displayDetails through the university object
        university.displayDetails();

        scanner.close();
    }
}

*/

/*
//Below is the output format

System.out.println("University Name : " + name);
System.out.println("College Name : " + name);
System.out.println("College ID : " + id);

*/
class College{
    String name;
    String id;
    public College(String name, String id){
        this.name=name;
        this.id=id;
    }
    
    public void displayDetails(){
        System.out.println("College Name : "+name);
        System.out.println("College ID : "+id);
    }
    
}
class University{
    String name;
    List<College> colleges;
    public University(String name){
        this.name=name;
        this.colleges=new ArrayList<>();

    }
    public void addCollege(String collegeName,String collegeId){
         College college = new College(collegeName, collegeId);
        this.colleges.add(college);
    }
    public void displayDetails(){
        System.out.println("University Name : "+this.name);
        for (College college : this.colleges) {
            college.displayDetails();
        }
    }
}





















