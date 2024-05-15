// Abstraction and encapsulation 

public abstract class AbstractEmployee {          //abstract class 
    private String employeeId;
    private String department;

    public AbstractEmployee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    public abstract void calculateSalary();       //abstract method 

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
