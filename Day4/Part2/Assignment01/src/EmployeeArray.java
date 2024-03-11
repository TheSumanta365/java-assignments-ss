  import java.util.Scanner;

    public class EmployeeArray {
        public static void main(String[] args) {
            Employee[] employees = new Employee[10];

            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < employees.length; i++) {
                System.out.println("Enter details for Employee " + (i + 1));

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Salary: $");
                double salary = scanner.nextDouble();
                scanner.nextLine(); // Consume the newline character

                System.out.print("Date of Joining (YYYY-MM-DD): ");
                String dateOfJoining = scanner.nextLine();

                employees[i] = new Employee(name, salary, dateOfJoining);
            }


            System.out.println("\nEmployee Details:");
            for (Employee employee : employees) {
                employee.printDetails();
            }

            scanner.close();
        }
    }

