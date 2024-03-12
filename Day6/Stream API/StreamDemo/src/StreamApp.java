import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApp {
    public static void main(String[] args) {
        // Create an ArrayList of Employee objects using the Stream API
        List<Employee> employees = List.of(
                new Employee(1, "John", 450000),
                new Employee(2, "Alice", 380000),
                new Employee(3, "Bob", 420000),
                new Employee(4, "Eve", 500000)
        );

        // Display details of employees with salary > 400000
        System.out.println("Employees with salary > 400000:");
        employees.stream()
                .filter(e -> e.getSalary() > 400000)
                .forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary()));

        // Update employee salary by 25% and display
        System.out.println("\nUpdating employee salary by 25%:");
        employees.forEach(e -> e.setSalary(e.getSalary() * 1.25));
        employees.forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Updated Salary: " + e.getSalary()));

        // Convert employee names to uppercase and store in another list
        List<String> employeeNames = employees.stream()
                .map(e -> e.getName().toUpperCase())
                .collect(Collectors.toList());

        // Display employee names in uppercase
        System.out.println("\nEmployee Names in Uppercase:");
        employeeNames.forEach(System.out::println);
    }
}

