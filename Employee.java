public class Employee {
    String name;
    int id;
    double salary;
    String department; 
    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department; 
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department); 
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 101, 50000.0, "IT");
        emp1.displayInfo();
    }
}