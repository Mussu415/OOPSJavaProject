//Main class to test 

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        Employee employee = new Employee("Jane Smith", 25, "E123", "HR");
        Manager manager = new Manager("Alice Johnson", 35, "M456", "IT", 10);

        person.displayInfo();
        System.out.println();
        employee.displayInfo();
        System.out.println();
        manager.displayInfo();
    }
}
