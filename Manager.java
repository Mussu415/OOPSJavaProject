//Inheritance and polymorphism 

public class Manager extends Employee {      //Manager Inherits from Employee 
    private int teamSize;

    public Manager(String name, int age, String employeeId, String department, int teamSize) {
        super(name, age, employeeId, department);     //constructor to call super class 
        this.teamSize = teamSize;                    //constructors
    }

    @Override                           //Overrides the displayInfo method from the Employee class 
    public void displayInfo() {         // override is a polymorphism concept which is also known as run time
        super.displayInfo();                   //polymorphism and is dynamic in nature
        System.out.println("Team Size: " + teamSize);
    }

    // getter and setter methods
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}

