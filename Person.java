// Class and object 

public class Person {
    private String name;         // Private for encapsulation
    private int age;

    public Person(String name, int age) {
        this.name = name;        // contructor of the class to initialize name and age 
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

