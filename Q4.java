// Q4 -->
// Constructor Chaining - Student Hierarchy
// Constructer | Inheritance 


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);  // Calls Person's constructor
        this.rollNo = rollNo;
    }
}

class EngineeringStudent extends Student {
    String branch;

    EngineeringStudent(String name, int rollNo, String branch) {
        super(name, rollNo);  // Calls Student's constructor
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name); 
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
}

public class Q4 {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent("John", 101, "Computer Science");
        es.display();
    }
}
