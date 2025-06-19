/*Design a system to manage the relationship between Employees and Departments using aggregation. Implement the following:
Department :
Attributes: name (String), id (String).
Method: displayDetails() - Prints the department details.

Employee :
Attributes: name (String), id (int), department (Department).
Method: displayDetails() - Prints the employee details, including the associated department details.

Examples:
Input : E_name = "Striver" , D_name = "Management", E_id = 10434 , D_id = "MAN41241"
Output :
Employee Name : Striver
Employee Id : 10434
Department Name : Management
Department Id : MAN41241
*/
class Department {
    private String name;
    private String id;

    // Constructor
    public Department(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Method to display department details
    public void displayDetails() {
        System.out.println("Department Name : " + name);
        System.out.println("Department Id : " + id);
    }
}

class Employee {
    private String name;
    private int id;
    private Department department; // Aggregation

    // Constructor
    public Employee(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Id : " + id);
        if (department != null) {
            department.displayDetails();
        }
    }
}
