// 02 -->
// EMPLOY SALERY MANAGEMENT
// INCERMENT | NON NEGETIVE

class Employee {
    int empId;
    String name;
    double salary;

    // Constructor to initialize fields
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to increment salary with exception handling
    void incrementSalary(double amount) {
        try {
            if (amount < 0) {
                throw new Exception("Increment amount cannot be negative!");
            }
            salary += amount;
            System.out.println("Salary incremented successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", 50000);

        System.out.println("Before increment:");
        emp.display();

        emp.incrementSalary(5000);  // Valid increment
        emp.incrementSalary(-1000); // Invalid increment

        System.out.println("\nAfter increment:");
        emp.display();
    }
}
