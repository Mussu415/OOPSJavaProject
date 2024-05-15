//Inheritance 

public class Employee extends Person {         //inherites from person class
    private String employeeId;
    private String department;

    public Employee(String name, int age, String employeeId, String department) {
        super(name, age);                            //calls constructor of super class i.e., Person
        this.employeeId = employeeId;                //constructors
        this.department = department;
    }

    @Override                                             
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId + ", Department: " + department);
    }

    // getter and setter methods
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

