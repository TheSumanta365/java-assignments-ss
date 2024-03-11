    public class Employee {
        // Fields
        private String name;
        private double salary;
        private String dateOfJoining;

        // Constructor
        public Employee(String name, double salary, String dateOfJoining) {
            this.name = name;
            this.salary = salary;
            this.dateOfJoining = dateOfJoining;
        }


        public void printDetails() {
            System.out.println("Name: " + name);
            System.out.println("Salary: $" + salary);
            System.out.println("Date of Joining: " + dateOfJoining);
            System.out.println();
        }
    }

